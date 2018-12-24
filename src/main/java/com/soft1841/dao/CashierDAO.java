package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * 收营员DAO接口
 */

public interface CashierDAO {
    /**
     * 增加收银员
     * @param cashier
     * @return
     * @throws SQLException
     */
    long insertCashier(Cashier cashier)throws SQLException;

    /**
     * 删除收银员
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 查询所有收银员
     * @return
     * @throws SQLException
     */
    List <Entity> selectCashiers()throws SQLException;

    /**
     * 根据id查收银员
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getCashierById(long id) throws SQLException;

    List<Entity> selectAllCashierDAOImpl() throws SQLException;
}
