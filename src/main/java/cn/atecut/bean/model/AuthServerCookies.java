package cn.atecut.bean.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AuthServerCookies {
    private int id;
    private String userNumber;
    private String userCookies;
    private Timestamp creatTime;
    private int version;
}
