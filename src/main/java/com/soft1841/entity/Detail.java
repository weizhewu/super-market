package com.soft1841.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 明细实体类
 */

public class Detail {
    private final SimpleLongProperty DetailId = new SimpleLongProperty();
    private final SimpleLongProperty TicketId = new SimpleLongProperty();
    private final SimpleLongProperty BarCode = new SimpleLongProperty();
    private final SimpleDoubleProperty GoodsNumber = new SimpleDoubleProperty();

    public Detail() {
    }

    public long getDetailId() {
        return DetailId.get();
    }

    public SimpleLongProperty detailIdProperty() {
        return DetailId;
    }

    public void setDetailId(long detailId) {
        this.DetailId.set(detailId);
    }

    public long getTicketId() {
        return TicketId.get();
    }

    public SimpleLongProperty ticketIdProperty() {
        return TicketId;
    }

    public void setTicketId(long ticketId) {
        this.TicketId.set(ticketId);
    }

    public long getBarCode() {
        return BarCode.get();
    }

    public SimpleLongProperty barCodeProperty() {
        return BarCode;
    }

    public void setBarCode(long barCode) {
        this.BarCode.set(barCode);
    }

    public double getGoodsNumber() {
        return GoodsNumber.get();
    }

    public SimpleDoubleProperty goodsNumberProperty() {
        return GoodsNumber;
    }

    public void setGoodsNumber(double goodsNumber) {
        this.GoodsNumber.set(goodsNumber);
    }

    @Override
    public String toString() {
        return "Detail{" +
                "DetailId=" + DetailId +
                ", TicketId=" + TicketId +
                ", BarCode=" + BarCode +
                ", GoodsNumber=" + GoodsNumber +
                '}';
    }
}
