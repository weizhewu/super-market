package com.soft1841.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ticket {
    private final SimpleLongProperty ticketId = new SimpleLongProperty();
    private final SimpleLongProperty cashierId = new SimpleLongProperty();
    private final SimpleLongProperty vipId = new SimpleLongProperty();
    private final SimpleDoubleProperty count = new SimpleDoubleProperty();
    private final SimpleLongProperty barcode = new SimpleLongProperty();
    private final SimpleDoubleProperty number = new SimpleDoubleProperty();

    public Ticket() {
    }

    public long getTicketId() {
        return ticketId.get();
    }

    public SimpleLongProperty ticketIdProperty() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId.set(ticketId);
    }

    public long getCashierId() {
        return cashierId.get();
    }

    public SimpleLongProperty cashierIdProperty() {
        return cashierId;
    }

    public void setCashierId(long cashierId) {
        this.cashierId.set(cashierId);
    }

    public long getVipId() {
        return vipId.get();
    }

    public SimpleLongProperty vipIdProperty() {
        return vipId;
    }

    public void setVipId(long vipId) {
        this.vipId.set(vipId);
    }

    public double getCount() {
        return count.get();
    }

    public SimpleDoubleProperty countProperty() {
        return count;
    }

    public void setCount(double count) {
        this.count.set(count);
    }

    public long getBarcode() {
        return barcode.get();
    }

    public SimpleLongProperty barcodeProperty() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode.set(barcode);
    }

    public double getNumber() {
        return number.get();
    }

    public SimpleDoubleProperty numberProperty() {
        return number;
    }

    public void setNumber(double number) {
        this.number.set(number);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", cashierId=" + cashierId +
                ", vipId=" + vipId +
                ", count=" + count +
                ", barcode=" + barcode +
                ", number=" + number +
                '}';
    }
}
