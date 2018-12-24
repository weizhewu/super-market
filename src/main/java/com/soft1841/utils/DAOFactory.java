package com.soft1841.utils;

import com.soft1841.dao.*;
import com.soft1841.dao.impl.*;
import com.soft1841.entity.Ticket;

public class DAOFactory {

    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }
    public static TicketDAO getTicketDAOInstance() {
        return new TicketDAOImpl();
    }
    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }
    public static VIPDAO getVIPDAOInstance() {
        return new VIPDAOImpl();
    }
    public static DetailDAO getDetailDAOInstance() {
        return new DetailDAOImpl();
    }
    public static GoodsDAO getGoodsDAOInstance() {
        return new GoodsDAOImpl();
    }


}
