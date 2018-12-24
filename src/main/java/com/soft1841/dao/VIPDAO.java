package com.soft1841.dao;
import com.soft1841.entity.VIP;

import java.sql.SQLException;
import java.util.List;

/**
 * 会员DAO接口
 */

public interface VIPDAO {
    /**
     * 增加VIP
     * @param vip
     * @return
     * @throws SQLException
     */
    long insertVIP(VIP vip) throws SQLException;

    /**
     * 删除会员
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteVIPById(long id) throws SQLException;

    /**
     * 查询所有会员
     * @return
     * @throws SQLException
     */
    List<VIP> selectVIP() throws SQLException;

    /**
     * 根据id查会员
     * @param id
     * @return
     * @throws SQLException
     */
    VIP getVIPById(long id) throws SQLException;
}