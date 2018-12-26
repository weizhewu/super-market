package com.soft1841.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.dao.DetailDAO;
import com.soft1841.entity.Detail;

import java.sql.SQLException;
import java.util.List;

public class DetailDAOImpl implements DetailDAO {
    @Override
    public List<Object> insertDetail(Detail detail) throws SQLException {
        return Db.use().insertForGeneratedKeys(
                Entity.create("t_detail")
                        .set("id",detail.getDetailId())
                        .set("ticket_id",detail.getTicketId())
                        .set("bar_code",detail.getBarCode())
                        .set("number",detail.getGoodsNumber())
        );
    }

    @Override
    public List<Entity> selectAllDetail() throws SQLException {
        return Db.use().query("SELECT * FROM t_detail ");
    }

    @Override
    public Entity getDetailById(long id) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_detail WHERE id = ? ",id);
    }

    @Override
    public Entity getDetailByDate(int date) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_detail WHERE date = ? ",date);
    }

}
