package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Detail;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;


public class DetailDAOTest {
    private DetailDAO detailDAO = DAOFactory.getDetailDAOInstance();

//增加测试
    @Test
    public void insertDetail()throws SQLException{
        Detail detail = new Detail();
        detail.setGoodsNumber(3231);
        System.out.println(detailDAO.insertDetail(detail));
    }

//查询所有测试
    @Test
    public void selectAllDetail()throws SQLException{
        List<Entity> detailList = detailDAO.selectAllDetail();
        System.out.println(detailList);

    }

//    根据id查询测试
    @Test
    public void getDetailById()throws SQLException{
        Entity entity = detailDAO.getDetailById(4);
        System.out.println(entity);
    }

//    根据日期查询测试
    @Test
    public void getDetailByDate()throws SQLException{
        Entity entity = detailDAO.getDetailByDate(2018-12-2);
        System.out.println(entity);

    }

}