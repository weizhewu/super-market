package com.soft1841.dao.impl;

import com.soft1841.dao.TicketDAO;
import com.soft1841.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

public class TicketDAOImpl implements TicketDAO {

    @Override
    public Long insertTicket(Ticket ticket) throws SQLException {
        return null;
    }

    @Override
    public List<Ticket> selectAllTicket() throws SQLException {
        return null;
    }

    @Override
    public Ticket getTicketById(long id) throws SQLException {
        return null;
    }

    @Override
    public Ticket getTicketByDate(String date) throws SQLException {
        return null;
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
