package com.soft1841.sm.entity;

public class Cashier {
    private String id;
    private  String name;
    private Double number;
    private  String password;
    private  String varchar;

    public Cashier (String id, String name, Double number, String password, String varchar) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.password = password;
        this.varchar = varchar;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getNumber () {
        return number;
    }

    public void setNumber (Double number) {
        this.number = number;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getVarchar () {
        return varchar;
    }

    public void setVarchar (String varchar) {
        this.varchar = varchar;
    }


    public Object getCashierName () {
        return null;
    }
}

