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

    private int userNum;
    private String userId;
    private String frameName;
    private int frameWidth;
    private int frameHeight;

    // 기본 생성자
    public UserframeFrom() {}

    // 매개변수가 있는 생성자
    public UserframeFrom(int userNum, String userId, String frameName, int frameWidth, int frameHeight) {
        this.userNum = userNum;
        this.userId = userId;
        this.frameName = frameName;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
    }

    // Getter 및 Setter
    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFrameName() {
        return frameName;
    }

    public void setFrameName(String frameName) {
        this.frameName = frameName;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }
}

