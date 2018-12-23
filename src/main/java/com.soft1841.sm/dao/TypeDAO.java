package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

/**
 * 类别DAO接口
 */
public interface TypeDAO {
    /**
     * 新增图书类别, 返回自增主键(Long)
     * @param type
     * @return
     * @throws SQLException
     */
    Long insertType(Type type) throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteType(long id) throws SQLException;

    /**
     * 查询所有类别
     * @return
     * @throws SQLException
     */
    List<Type> selectAllTypes() throws SQLException;

    /**
     * 根据id查询类别
     * @param id
     * @return
     * @throws SQLException
     */
    Type getTypeById(int id) throws SQLException;
}
