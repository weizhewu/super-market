package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Cashier;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class CashierDAOTest {
    private CashierDAO cashierDAO = DAOFactory.getCashierDAOInstance();
//    查询测试
    @Test
    public void getCashierByNumber() throws SQLException {
        Cashier entity = cashierDAO.getCashierByNumber("2624001");
        System.out.println(entity);
    }
}