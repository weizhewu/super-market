package com.soft1841.dao;
import cn.hutool.db.Entity;
import com.soft1841.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

public interface TicketDAO {
    /**
     * 增加小票
     * @param ticket
     * @return
     * @throws SQLException
     */
    Long insertTicket(Ticket ticket) throws SQLException;

    /**
     * 查询所有小票
     * @return
     * @throws SQLException
     */
    List<Entity> selectAllTicket() throws SQLException;

    /**
     * 根据id查小票
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getTicketById(long id) throws SQLException;

    /**
     * 根据日期查小票
     * @param date
     * @return
     * @throws SQLException
     */
    Entity getTicketByDate(String date) throws SQLException;

    /**
     * 根据收银员id查小票
     * @param CashierId
     * @return
     * @throws SQLException
     */
    Ticket getTicketByCashierId(long CashierId) throws SQLException;

    /**
     * 根据会员id查小票
     * @param MemberId
     * @return
     * @throws SQLException
     */
    Ticket getTicketByMemberId(long MemberId) throws SQLException;
}
