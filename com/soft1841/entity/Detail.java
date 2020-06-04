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
    private final SimpleLongProperty GoodsId = new SimpleLongProperty();
    private final SimpleDoubleProperty Number = new SimpleDoubleProperty();

    public Detail() {
    }

    public Detail(long detailId,long ticketId,long goodsId,Double number){
        setDetailId(detailId);
        setTicketId(ticketId);
        setGoodsId(goodsId);
        setNumber(number);
    }

    public long getDetailId() { return DetailId.get(); }

    public SimpleLongProperty detailIdProperty() { return DetailId;}

    public void setDetailId(long detailId) {this.DetailId.set(detailId); }

    public long getTicketId() {return TicketId.get(); }

    public SimpleLongProperty ticketIdProperty() {return TicketId; }

    public void setTicketId(long ticketId) {this.TicketId.set(ticketId);}

    public long getGoodsId() {return GoodsId.get();}

    public SimpleLongProperty goodsIdProperty() {return GoodsId; }

    public void setGoodsId(long goodsId) {this.GoodsId.set(goodsId);}

    public double getNumber() {return Number.get();}

    public SimpleDoubleProperty numberProperty() {return Number; }

    public void setNumber(double number) {this.Number.set(number);}

    @Override
    public String toString() {
        return "Detail{" +
                "DetailId=" + DetailId +
                ", TicketId=" + TicketId +
                ", GoodsId=" + GoodsId +
                ", Number=" + Number +
                '}';
    }
}
