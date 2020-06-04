package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Type;

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
    List <Entity> selectAllTypes() throws SQLException;

    /**
     * 根据id查询类别
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getTypeById(int id) throws SQLException;
}
