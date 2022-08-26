package com.sys.yms.service.impl;

import com.sys.yms.entity.Product;
import com.sys.yms.mapper.ProductMapper;
import com.sys.yms.service.ProductService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper mapper;

    @Override
    public Integer getCount(String pname) {
        return mapper.findCount(pname);
    }

    @Override
    public List<Product> queryByPage(String typeName,String pname,Integer cPage, Integer pSize) {
        //获取起始记录索引
        Integer startIndex=(cPage-1)*pSize;
        return mapper.queryByPage(typeName,pname,startIndex,pSize);
    }

    @Override
    public Integer updateState(Integer id, Integer pstate) {
        return mapper.updateState(id, pstate);
    }

    @Override
    public Integer DrinkState(Integer id, Integer photstate) {
        return mapper.DrinkState(id, photstate);
    }

    @Override
    public Integer deleteType(Integer id) {
        return mapper.deleteType(id);
    }

    @Override
    public Integer updateProduct(Integer id, String pname, String pimageurl, Double tprice, String tintroduce, Double pdiscount, Integer photstate) {
        return mapper.updateProduct(id, pname, pimageurl, tprice, tintroduce, pdiscount, photstate);
    }

    @Override
    public Integer addProduct(Product product) {
        return mapper.addProduct(product);
    }

    @Override
    public Integer findCount1(String typeName) {
        return mapper.findCount1(typeName);
    }

    @Override
    public Integer getTypeid(String typeName) {
        return mapper.getTypeid(typeName);
    }
}
