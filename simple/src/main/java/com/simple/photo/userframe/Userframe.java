package com.simple.photo.userframe;

import jakarta.persistence.*;

/*
* frame_id (pk)
* 사용자 넘버 user_num (fk)
* 사용자 아이디 user_id
* 가로 픽셀 사이즈 : frame_width
* 세로 픽셀 사이즈 : frame_height
* 사용 용도 : frame_name
* Entity
* */
@Entity
public class Userframe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long frame_id; //기본키

    private int user_num; //외래키
    private String user_id;
    private String frame_name; // 예: 증명 사진, 여권 사진, 주민등록 사진, 이력서 사진 등
    private int frame_width; // 가로 픽셀 값으로 입력을 받아야 한다.
    private int frame_height;// 세로 픽셀 값으로 입력을 받아야 한다.

    // 기본 생성자
    public Userframe() {}

    // 매개변수가 있는 생성자
    public Userframe(int user_num, String user_id, String frame_name, int frame_width, int frame_height) {
        this.user_num = user_num;
        this.user_id = user_id;
        this.frame_name = frame_name;
        this.frame_width = frame_width;
        this.frame_height = frame_height;
    }

    // Getter 및 Setter
    public Long getFrame_id() {
        return frame_id;
    }

    public void setFrame_id(Long frame_id) {
        this.frame_id = frame_id;
    }

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
