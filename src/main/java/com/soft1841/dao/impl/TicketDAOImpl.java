package com.soft1841.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.dao.TicketDAO;
import com.soft1841.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

public class TicketDAOImpl implements TicketDAO {

    @Override
    public Long insertTicket(Ticket ticket) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_ticket")
                        .set("ticket_id", ticket.getTicketId())
        );
    }

    @Override
    public List<Entity> selectAllTicket() throws SQLException {
        return Db.use().query("SELECT * FROM t_ticket ");
    }

    @Override
    public Entity getTicketById(long id) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_ticket WHERE id = ? ", id);
    }

    @Override
    public Entity getTicketByDate(String date) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_cashier WHERE date= ? ", date);
    }

    @Override
    public Ticket getTicketByCashierId(long CashierId) throws SQLException {
        return null;
    }

    @Override
    public Ticket getTicketByMemberId(long MemberId) throws SQLException {
        return null;
    }


}
