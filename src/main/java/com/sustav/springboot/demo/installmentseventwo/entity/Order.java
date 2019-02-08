package com.sustav.springboot.demo.installmentseventwo.entity;

public class Order {

    private String phone;
    private String phone4LastDigit;
    private String id;
    private String sum;
    private String term;
    private String messageID;
    private int status;

    public Order() {
    }

    public Order(String phone, String phone4LastDigit, String id, String sum, String term, String messageID, int status) {
        this.phone = phone;
        this.phone4LastDigit = phone4LastDigit;
        this.id = id;
        this.sum = sum;
        this.term = term;
        this.messageID = messageID;
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone4LastDigit() {
        return phone4LastDigit;
    }

    public void setPhone4LastDigit(String phone4LastDigit) {
        this.phone4LastDigit = phone4LastDigit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
