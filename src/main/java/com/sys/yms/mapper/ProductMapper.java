package com.sys.yms.mapper;

import com.sys.yms.entity.Product;
import com.sys.yms.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    /**
     * 查询数据量
     * @return
     */
    Integer findCount(@Param("pname") String pname);

    /**
     * 分页查询 product 数据
     * @param startIndex
     * @param limit
     * @return
     */
    List<Product> queryByPage(@Param("t") String typeName,@Param("p") String pname,
                              @Param("s") Integer startIndex,
                              @Param("l") Integer limit);

    /**
     * 根据id修改状态
     * @param id
     * @param pstate
     * @return
     */
    Integer updateState(@Param("id") Integer id,@Param("pstate") Integer pstate);

    /**
     * 根据id修改热饮状态
     * @param id
     * @param photstate
     * @return
     */
    Integer DrinkState(@Param("id") Integer id,@Param("photstate") Integer photstate);
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
    Integer updateProduct(@Param("id") Integer id,
                          @Param("pname") String pname,
                          @Param("pimageurl") String pimageurl,
                          @Param("tprice") Double tprice,
                          @Param("tintroduce") String tintroduce,
                          @Param("pdiscount") Double pdiscount,
                          @Param("photstate") Integer photstate);


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
