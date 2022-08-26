package com.sys.yms.service;

import com.sys.yms.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    /**
     * 查询数据量
     * @return
     */
    Integer getCount(String pname);
    /**
     * 分页查询 product 数据
     * @param cPage
     * @param pSize
     * @return
     */
    List<Product> queryByPage(String typeName,String pname,Integer cPage, Integer pSize);

    /**
     * 根据id修改状态
     * @param id
     * @param pstate
     * @return
     */
    Integer updateState(Integer id,Integer pstate);

    /**
     * 根据id修改热饮状态
     * @param id
     * @param photstate
     * @return
     */
    Integer DrinkState(Integer id,Integer photstate);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    Integer deleteType(Integer id);

    /**
     * 根据id修改产品
     * @return
     */
    Integer updateProduct( Integer id, String pname, String pimageurl, Double tprice,
                           String tintroduce, Double pdiscount, Integer photstate);

    /**
     * 新增产品
     * @param product
     * @return
     */
    Integer addProduct(Product product);

    /**
     * 查询数据量1
     * @return
     */
    Integer findCount1( String typeName);

    Integer getTypeid(String typeName);

}
