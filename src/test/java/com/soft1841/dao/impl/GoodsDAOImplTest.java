package com.soft1841.dao.impl;

import org.junit.Test;

import java.sql.SQLException;

public class GoodsDAOImplTest {
    //删除测试
    @Test
    public void deleteGoodsById() throws SQLException {
        new GoodsDAOImpl().deleteGoodsById(66);
    }


}