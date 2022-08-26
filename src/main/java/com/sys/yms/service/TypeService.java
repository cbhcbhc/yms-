package com.sys.yms.service;

import com.sys.yms.entity.Type;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TypeService {
    /**
     * 获取所有数据
     * @return
     */
    List<Type> getAllType();

    /**
     * 获取所有数据量
     * @return
     */
    Integer getCount(String typeName);

    /**
     * 查询总数据量
     * @return
     */
    Integer getCount1();

    /**
     * 添加数据
     * @param type
     * @return
     */
    Integer addType(Type type);

    /**
     * 带条件的分页查询
     * @param typeName 类型名称，若为null，则为不带条件分页查询
     * @param cPage：当前页
     * @param pSize 数据量
     * @return
     */
    List<Type> getTypeByPage( String typeName, Integer cPage, Integer pSize);

    /**
     * 根据id修改状态
     * @param id
     * @param typeState
     * @return
     */
    Integer updateState(Integer id,Integer typeState);

    /**
     * 根据id修改图片和名字
     */
    Integer updateType(Type type);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    Integer deleteType(Integer id);


}
