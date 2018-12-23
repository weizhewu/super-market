package com.soft1841.sm.dao;
import com.soft1841.sm.entity.VIP;
import java.sql.SQLException;
import java.util.List;

/**
 * 会员DAO接口
 */

public interface VIPDAO {
    /**
     * 增加会员
     * @param member
     * @return
     * @throws SQLException
     */
    long insertMember(VIP member) throws SQLException;

    /**
     * 删除会员
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 查询所有会员
     * @return
     * @throws SQLException
     */
    List<VIP> selectMembers() throws SQLException;

    /**
     * 根据id查会员
     * @param id
     * @return
     * @throws SQLException
     */
    VIP getMemberById(long id) throws SQLException;
}