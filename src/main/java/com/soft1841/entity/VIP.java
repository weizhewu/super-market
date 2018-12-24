package com.soft1841.entity;

public class VIP {
  private int id;
    private String number;
    private String name;
    private String place;
    private String phonenumber;
    private String integral;

    public VIP() {
    }

    public VIP(int id, String number, String name, String place, String phonenumber, String integral) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.place = place;
        this.phonenumber = phonenumber;
        this.integral = integral;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }


}
