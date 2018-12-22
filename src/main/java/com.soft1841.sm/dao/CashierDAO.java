package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * 收营员DAO接口
 */

public interface CashierDAO {
    /**
     * 增加收营员
     * @param cashier
     * @return
     * @throws SQLException
     */
    long insertCashier(Cashier cashier)throws SQLException;

    /**
     * 删除收营员
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 查询所有收营员
     * @return
     * @throws SQLException
     */
    List<Cashier> selectCashiers()throws SQLException;

    /**
     * 根据id查收营员
     * @param id
     * @return
     * @throws SQLException
     */
    Cashier getCashierById(long id) throws SQLException;
}
