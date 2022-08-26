package com.sys.yms.controller;

import com.sys.yms.entity.Product;
import com.sys.yms.entity.Type;
import com.sys.yms.service.impl.ProductServiceImpl;
import com.sys.yms.service.impl.TypeServiceImpl;
import com.sys.yms.util.ResponseCode;
import com.sys.yms.util.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductServiceImpl productService;

    @GetMapping("/queryByPage")
    @ResponseBody
    public ResponseData queryByPage(String typeName,String pname,
                                    @RequestParam("page") Integer startIndex,
                                    @RequestParam("limit") Integer limit){
        Integer count;
        if(typeName !=null){
            count= productService.findCount1(typeName);
            if(pname !=null){
                count = productService.getCount(pname);
            }
        }else {
            count = productService.getCount(pname);
        }
        List<Product> products = productService.queryByPage(typeName,pname,startIndex, limit);
        return new ResponseData(ResponseCode.SUCCESS,products,count);
}

    @PostMapping("/updateState")
    @ResponseBody
    public ResponseData updateState(Integer id,Integer pstate){
        Integer rows = productService.updateState(id, pstate);
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_3);
        }
    }

    @PostMapping("/drinkState")
    @ResponseBody
    public ResponseData drinkState(Integer id,Integer photstate){
        Integer rows = productService.DrinkState(id, photstate);
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
        Integer rows = productService.deleteType(id);
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_4);
        }
    }

    @PostMapping("/updateProduct")
    @ResponseBody
    public ResponseData updateProduct(Integer id, String pname, String imageName, Double tprice,
                                      String tintroduce, Double pdiscount, Integer photstate){
        //拼接路径
        String tImageUrl="/images/productImg/"+imageName+".png";
        Integer rows = productService.updateProduct(id, pname, tImageUrl,tprice,
        tintroduce,pdiscount,photstate);
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_3);
        }
    }

    /**
     * 新增商品
     */
    @PostMapping("/addProduct")
    @ResponseBody
    public ResponseData addType(String pname,String typeName,Double tprice,
                                Double pdiscount,String pimageurl,String tintroduce){


        Type type=new Type(null,typeName,null,null);
        Integer typeid = productService.getTypeid(typeName);
        Integer rows;
        if (typeid ==null){
            //添加
             rows=productService.addProduct(new Product(type, null ,pname,
                    1,tprice, tintroduce,pimageurl,
                    1, pdiscount, 0));
        }else {
            //添加
             rows=productService.addProduct(new Product(type, null ,pname,
                    typeid,tprice, tintroduce,pimageurl,
                    1, pdiscount, 0));
        }
        //判断返回值
        if(rows >0){
            return new ResponseData(ResponseCode.SUCCESS);
        }else {
            return new ResponseData(ResponseCode.ERROR_2);
        }

    }
}