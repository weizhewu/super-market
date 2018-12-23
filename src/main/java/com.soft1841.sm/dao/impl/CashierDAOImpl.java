package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.CashierDAO;
import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

public class CashierDAOImpl implements CashierDAO {


    @Override
    public long insertCashier (Cashier cashier) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_cashier")
                        .set("cashier_name", cashier.getCashierName())
        );
    }

    @Override
    public int deleteById (long id) throws SQLException {
        return Db.use().del(
                Entity.create("t_cashier").set("id", id)
        );
    }

    @Override
    public List <Entity> selectCashiers () throws SQLException {
        return Db.use().query("SELECT * FROM t_cashier ");
    }

    @Override
    public Entity getCashierById (long id) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_cashier WHERE id = ? ", id);
    }
}
