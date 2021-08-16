package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class Abs {
    @Value("${Abs.date}")
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Abs abs = new Abs();
        System.out.println(abs.date);
    }
}
