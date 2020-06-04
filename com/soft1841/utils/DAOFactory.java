package com.soft1841.utils;

import com.soft1841.dao.CashierDAO;
import com.soft1841.dao.TypeDAO;
import com.soft1841.dao.impl.CashierDAOImpl;
import com.soft1841.dao.impl.TypeDAOImpl;

public class DAOFactory {

    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }

    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }

    }

