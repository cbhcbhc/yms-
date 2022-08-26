package com.sys.yms.controller;

import com.sys.yms.entity.Type;
import com.sys.yms.service.impl.TypeServiceImpl;
import com.sys.yms.util.ResponseCode;
import com.sys.yms.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    TypeServiceImpl serviceImpl;

    /**
     * 分页展示type数据
     * @param typeName
     * @param page 表示当前页，是layui发送给服务器的参数
     * @param limit
     * @return
     */
    @GetMapping("/getByPage")
    @ResponseBody
    public ResponseData showTypesByPage(String typeName,Integer page,Integer limit){
        //分页获取数据
        List<Type> types = serviceImpl.getTypeByPage(typeName, page, limit);
        //获取数据量
        Integer count=serviceImpl.getCount(typeName);
        //返回响应数据
        return new ResponseData(ResponseCode.SUCCESS,types,count);

    }

    @PostMapping("/addType")
    @ResponseBody
    public ResponseData addType(String typeName,String imageName){
        //拼接路径
        String tImageUrl="/images/typeImg/"+imageName+".png";
        //添加
        Integer rows=serviceImpl.addType(new Type(null,typeName,tImageUrl,null));
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_2);
        }

    }

    @PostMapping("/updateState")
    @ResponseBody
    public ResponseData updateState(Integer id,Integer typeState){
        Integer rows=serviceImpl.updateState(id, typeState);
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_3);
        }

    }

    @PostMapping("/updateType")
    @ResponseBody
    public ResponseData updateType(Integer id,String typeName,String imageName){
        //拼接路径
        String tImageUrl="/images/typeImg/"+imageName+".png";
        Integer rows = serviceImpl.updateType(new Type(id,typeName,tImageUrl,null));
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_3);
        }
    }

    @PostMapping("delType")
    @ResponseBody
    public ResponseData deleteType(Integer id){
        Integer rows = serviceImpl.deleteType(id);
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_4);
        }
    }


    @GetMapping("/getAll")
    @ResponseBody
    public ResponseData getAll() {
        //获取所有数据
        List<Type> allType = serviceImpl.getAllType();
        Integer count= serviceImpl.getCount1();
        return new ResponseData(ResponseCode.SUCCESS, allType,count);
    }

}
