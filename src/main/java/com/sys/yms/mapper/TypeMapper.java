package com.sys.yms.mapper;

import com.sys.yms.entity.Type;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface TypeMapper {
    /**
     * 查询所有商品类型
     * @return
     */
    List<Type> findAllType();

    /**
     * 带条件的分页查询
     * @param typeName 类型名称，若为null，则为不带条件分页查询
     * @param startIndex：起始记录的索引
     * @param limit 每页的数据量（起始索引的偏移量）
     * @return
     */
    List<Type> findTypeByPage(@Param("n") String typeName,
                              @Param("s") Integer startIndex,
                              @Param("l") Integer limit);

    /**
     * 插入type数据
     * @param type 封装了要被插入到数据库的值
     * @return
     */
    Integer insertType(Type type);

    /**
     * 查询数据量
     * @return
     */
    Integer findCount(String typeName);


    /**
     * 查询总数据量
     * @return
     */
    Integer findCount1();

    /**
     * 根据id修改状态
     * @param id
     * @param state
     * @return
     */
    Integer updateState(@Param("id") Integer id,@Param("state") Integer state);

    /**
     * 根据id修改数据
     */
    Integer updateType(Type type);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    Integer deleteType(Integer id);



}
