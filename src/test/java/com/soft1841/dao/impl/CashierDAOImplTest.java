package com.soft1841.dao.impl;

import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;


public class CashierDAOImplTest {
    //删除测试
    @Test
    public void deleteTypeById() throws SQLException {
        new CashierDAOImpl().deleteById(22);
    }

//    @Test
//    public void selectAllTypes() throws SQLException {
//        List<Entity> typeList = typeDAO.selectAllTypes();
//        typeList.forEach(entity -> System.out.println(entity));
//    }
}