package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.VIP;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class VIPDAOTest {
    private VIPDAO vipdao = DAOFactory.getVIPDAOInstance();

//    增加测试
    @Test
    public void insertVIP() throws SQLException{
        VIP vip = new VIP();
        vip.setName("测试");
        System.out.println(vipdao.insertVIP(vip));
    }

//    删除测试
    @Test
    public void deleteVIPById() throws SQLException{
        int entity = vipdao.deleteVIPById(2018012);
        System.out.println(entity);
    }

//    查询所有会员测试
    @Test
    public void selectVIP() throws SQLException{
        List<Entity> vipList = vipdao.selectVIP();
        System.out.println(vipList);
    }

//    根据id查询测试
    @Test
    public void getVIPById() throws SQLException{
        Entity entity = vipdao.getVIPById(2018001);
        System.out.println(entity);
    }

}