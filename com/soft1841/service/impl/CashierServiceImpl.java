package com.soft1841.service.impl;

import com.soft1841.dao.CashierDAO;
import com.soft1841.entity.Cashier;
import com.soft1841.service.CashierService;
import com.soft1841.utils.DAOFactory;

import java.sql.SQLException;

/**
 * @zhouguoqing
 * 2018.12.24
 */
public class CashierServiceImpl  implements CashierService {
    private CashierDAO sellerDAO = DAOFactory.getCashierDAOInstance();

    @Override
    public boolean login(String number, String password) {
        Cashier seller = null;
        try {
            seller = sellerDAO.getCashierByNumber(number);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据工号查找成功
        if (seller != null) {
            //比较密码
            if (password.equals(seller.getPassword())) {
                return true;
            }
        }
        return false;

    }
}
