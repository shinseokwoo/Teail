package com.simple.photo.userframe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*비즈니스 로직을 실행하고 결과 반환(Service Layer)*/
@Service
public class UserframeService {

    @Autowired
    private UserframeRepository userFramRepository;

    //사용자 개인 프레임 조회
    public List<Userframe> listuserframe(){
        return userFramRepository.findAll();
    }

    //사용자 개인 프레임 등록
    public Userframe createuserframe(UserframeFrom userframefrom){
        Userframe userframe = new Userframe();
        userframe.setUser_num(userframefrom.getUser_num());
        userframe.setUser_id(userframefrom.getUser_id());
        userframe.setFrame_name(userframefrom.getFrame_name());
        userframe.setFrame_width(userframefrom.getFrame_width());
        userframe.setFrame_height(userframefrom.getFrame_height());
        return userFramRepository.save(userframe);
    }

    //사용자 개인 프레임 수정
    public void updateuserframe(){

    }

    //사용자 개인 프레임 삭제
    public void deleteuserframe(){

    }

//    public List<Userframe> getAllUserFrams() {
//        return userFramRepository.findAll();
//    }
//
//    public Userframe getUserFramById(Long frame_id) {
//        return userFramRepository.findById(frame_id).orElseThrow(() -> new IllegalArgumentException("Invalid user frame Id:" + frame_id));
//    }
//
//    public Userframe createUserFram(UserframeFrom userFramForm) {
//        Userframe userFram = new Userframe(userFramForm.getUser_num(), userFramForm.getUser_id(),userFramForm.getFrame_name(), userFramForm.getWidth(), userFramForm.getHeight());
//        return userFramRepository.save(userFram);
//    }
//
//    public Userframe updateUserFram(Long frame_id, UserframeFrom userFramForm) {
//        Userframe userFram = getUserFramById(frame_id);
//        userFram.setFrame_name(userFramForm.getFrame_name());
//        userFram.setWidth(userFramForm.getWidth());
//        userFram.setHeight(userFramForm.getHeight());
//        return userFramRepository.save(userFram);
//    }
//
//    public void deleteUserFram(Long frame_id) {
//        userFramRepository.deleteById(frame_id);
//    }
}

