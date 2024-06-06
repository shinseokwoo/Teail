package com.simple.photo.userframe;

import jakarta.persistence.*;

/*
* frameId (pk)
* 사용자 넘버 userNum (fk)
* 사용자 아이디 userId
* 가로 픽셀 사이즈 : frameWidth
* 세로 픽셀 사이즈 : frameHeight
* 사용 용도 : frameName
* Entity
* */
@SequenceGenerator(
        name = "SEQ_frameId",
        sequenceName = "frame_SEQ",
        allocationSize = 1
)
@Entity
public class Userframe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_frameId")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "frame_id")
    private Long frameId; //기본키

    @Column(name = "user_num")
    private int userNum; //외래키
    @Column(name = "user_id")
    private String userId;
    @Column(name = "frame_name")
    private String frameName; // 예: 증명 사진, 여권 사진, 주민등록 사진, 이력서 사진 등
    @Column(name = "frame_width")
    private int frameWidth; // 가로 픽셀 값으로 입력을 받아야 한다.
    @Column(name = "frame_height")
    private int frameHeight;// 세로 픽셀 값으로 입력을 받아야 한다.

    // 기본 생성자
    public Userframe() {}

    // 매개변수가 있는 생성자
    public Userframe(Long frameId, int userNum, String userId, String frameName, int frameWidth, int frameHeight) {
        this.frameId = frameId;
        this.userNum = userNum;
        this.userId = userId;
        this.frameName = frameName;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
    }

    // Getter 및 Setter
    public Long getFrameId() {
        return frameId;
    }

    public void setFrameId(Long frameId) {
        this.frameId = frameId;
    }

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
