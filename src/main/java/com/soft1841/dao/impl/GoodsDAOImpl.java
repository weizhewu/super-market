package com.soft1841.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.dao.GoodsDAO;
import com.soft1841.entity.Goods;

import java.sql.SQLException;
import java.util.List;

public class GoodsDAOImpl implements GoodsDAO {
    @Override
    public Long insertGoods(Goods goods) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_goods")
                        .set("goods_name", goods.getName())
        );
    }

    @Override
    public int deleteGoodsById(long id) throws SQLException {
        return Db.use().del(
                Entity.create("t_goods").set("id", id)
        );
    }

    @Override
    public int updateGoods(Goods goods) throws SQLException {
        return 0;
    }

    @Override
    public List<Entity> selectAllGoods() throws SQLException {
        return Db.use().query("SELECT * FROM t_goods ");
    }

    @Override
    public Entity getDoodById(long id) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_goods WHERE id = ? ", id);
    }

    @Override
    public List<Entity> selectGoodsLike(String keywords) throws SQLException {
        return Db.use().query("SELECT * FROM t_goods ");
    }

    @Override
    public List<Entity> selectGoodsByTypeId(long typeId) throws SQLException {
        return Db.use().query("SELECT * FROM t_goods ");
    }

    @Override
    public int countByType(long typeId) throws SQLException {
        return Db.use().queryNumber("SELECT COUNT(*) FROM t_goods WHERE id = ? ", typeId).intValue();
    }



}
