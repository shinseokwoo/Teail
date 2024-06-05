package com.simple.photo.userframe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
 *개인 프레임 크기
 *사용자 아이디 (fk & pk)
 * 고정 프레임 크기
 * 이름(용도)
 * DTO
 *  */
public class UserframeFrom {

    private int user_num;
    private String user_id;
    private String frame_name;
    private int frame_width;
    private int frame_height;

    // 기본 생성자
    public UserframeFrom() {}

    // 매개변수가 있는 생성자
    public UserframeFrom(int user_num, String user_id, String frame_name, int frame_width, int frame_height) {
        this.user_num = user_num;
        this.user_id = user_id;
        this.frame_name = frame_name;
        this.frame_width = frame_width;
        this.frame_height = frame_height;
    }

    // Getter 및 Setter
    public int getUser_num() {
        return user_num;
    }

    public void setUser_num(int user_num) {
        this.user_num = user_num;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFrame_name() {
        return frame_name;
    }

    public void setFrame_name(String frame_name) {
        this.frame_name = frame_name;
    }

    public int getFrame_width() {
        return frame_width;
    }

    public void setFrame_width(int frame_width) {
        this.frame_width = frame_width;
    }

    public int getFrame_height() {
        return frame_height;
    }

    public void setFrame_height(int frame_height) {
        this.frame_height = frame_height;
    }
}

