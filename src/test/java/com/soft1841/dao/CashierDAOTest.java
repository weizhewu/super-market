package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Cashier;
import com.soft1841.utils.DAOFactory;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class CashierDAOTest {
    private CashierDAO cashierDAO = DAOFactory.getCashierDAOInstance();
//    查询测试
    @Test
   public void selectAllCashiers() throws SQLException {
        List<Entity> cashierList = cashierDAO.selectAllCashiers();
        cashierList.forEach(entity -> System.out.println(entity.getStr("name")));
    }
    @Test
    public void insertCashier() throws SQLException {
        Cashier cashier = new Cashier();
        cashier.setName("测试人员");
        cashier.setNumber("2624009");
        cashier.setPassword("zx009");
        System.out.println(cashierDAO.inserCashier(cashier));
    }
    @Test
    public void deleteCashierById() throws SQLException {
        cashierDAO.deleteCashierById(31);
    }
    @Test
    public void updataCashier() throws SQLException {
        Cashier cashier = new Cashier();
        cashier.setId(32);
        cashier.setNumber(2624151);
        cashierDAO.updataCashier(cashier);
    }
    @Test
    public void getCashierById() throws SQLException {
        Entity entity = cashierDAO.getCashierById(1);
        System.out.println(entity);
    }
    @Test
    public void selectCashiersLike() throws SQLException {
        List<Entity> cashierList = cashierDAO.selectCashiersLike("李");
        cashierList.forEach(entity -> System.out.println(entity.getStr("name")));
    }


}