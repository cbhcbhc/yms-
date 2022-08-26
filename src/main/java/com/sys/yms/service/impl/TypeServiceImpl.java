package com.sys.yms.service.impl;

import com.sys.yms.entity.Type;
import com.sys.yms.mapper.TypeMapper;
import com.sys.yms.service.TypeService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;

@Component
public class TypeServiceImpl implements TypeService {

    @Resource
    TypeMapper mapper;

    @Override
    public List<Type> getAllType() {
        return mapper.findAllType();
    }
    @Override
    public Integer getCount(String typeName){
        return mapper.findCount(typeName);
    }

    @Override
    public Integer getCount1() {
        return mapper.findCount1();
    }

    @Override
    public List<Type> getTypeByPage(String typeName, Integer cPage, Integer pSize) {
        //获取起始记录索引
        Integer startIndex=(cPage-1)*pSize;
        return mapper.findTypeByPage(typeName,startIndex,pSize);
    }

    @Override
    public Integer addType(Type type) {
        return mapper.insertType(type);
    }

    @Override
    public Integer updateState(Integer id, Integer typeState) {
        return mapper.updateState(id,typeState);
    }

    @Override
    public Integer updateType(Type type) {
        return mapper.updateType(type);
    }

    @Override
    public Integer deleteType(Integer id) {
        return mapper.deleteType(id);
    }


}
