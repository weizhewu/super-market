package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * 商品DAO接口
 */
public interface GoodsDAO {
    /**
     * 增加商品
     * @param goods
     * @return
     * @throws SQLException
     */
    Long insertGoods(Goods goods) throws SQLException;

    /**
     * 根据id删除商品
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteGoodsById(long id) throws SQLException;

    /**
     * 跟新商品信息
     * @param goods
     * @return
     * @throws SQLException
     */
    int updateGoods(Goods goods) throws SQLException;

    /**
     * 查询所有商品
     * @return
     * @throws SQLException
     */
    List<Entity> selectAllGoods() throws SQLException;

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getDoodById(long id) throws SQLException;

    /**
     * 根据关键词查商品
     * @param keywords
     * @return
     * @throws SQLException
     */
    List<Entity> selectGoodsLike(String keywords) throws SQLException;

    /**
     * 根据类别查商品
     * @param typeId
     * @return
     * @throws SQLException
     */
    List<Entity> selectGoodsByTypeId(long typeId) throws SQLException;

    /**
     * 根据类别统计商品数量
     * @param typeId
     * @return
     * @throws SQLException
     */
    int countByType(long typeId) throws SQLException;
}
