package com.soft1841.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.dao.VIPDAO;
import com.soft1841.entity.VIP;
import java.sql.SQLException;
import java.util.List;

public class VIPDAOImpl implements VIPDAO {
    @Override
    public long insertVIP(VIP vip) throws SQLException {
        return 0;
    }

    @Override
    public int deleteVIPById(long id) throws SQLException {
        return 0;
    }

    @Override
    public List<Entity> selectVIP() throws SQLException {
        return Db.use().query("SELECT * FROM t_vip ");
    }

    @Override
    public VIP getVIPById(long id) throws SQLException {
        return null;
    }
}
