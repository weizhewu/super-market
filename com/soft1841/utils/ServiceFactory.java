package com.soft1841.utils;

import com.soft1841.service.CashierService;
import com.soft1841.service.impl.CashierServiceImpl;

public class ServiceFactory {
    public static CashierService getCashierServiceInstance () {
        return new CashierServiceImpl();
    }
}