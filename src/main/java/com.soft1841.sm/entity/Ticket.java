package com.soft1841.sm.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ticket {
    private final SimpleLongProperty ticketId = new SimpleLongProperty();
    private final SimpleLongProperty cashierId = new SimpleLongProperty();
    private final SimpleLongProperty vipId = new SimpleLongProperty();
    private final SimpleDateFormat date = new SimpleDateFormat();
    private final SimpleDoubleProperty count = new SimpleDoubleProperty();

    public Ticket() {
    }

    public Ticket(long ticketId, long cashierId, long vipId, DateFormat date, double count){

    }
}
