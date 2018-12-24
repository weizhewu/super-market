package com.soft1841.dao.impl;

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
    public List<VIP> selectVIP() throws SQLException {
        return null;
    }

    @Override
    public VIP getVIPById(long id) throws SQLException {
        return null;
    }
}
