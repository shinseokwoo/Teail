package com.simple.photo.userframe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*클라이언트 요청을 받고 클라이언트에게 결과를 반환 (Presentation Layer)*/
@RestController
@RequestMapping("/userframe")
//@CrossOrigin(origins = "http://localhost:3000") 리액트 포트 번호랑 맞춰야 한다.???
public class UserframeController {

    @Autowired
    private UserframeService userframeService;

    //사용자 개인 프레임 확인(조회 : user_num, user_id) 포스트맨 http://localhost:8000/userframe/1/사용자1
//    @GetMapping("/{userNum}/{userId}")
//    public List<Userframe> listuserframe(@PathVariable("userNum") int userNum, @PathVariable("userId") String userId) {
//        List<Userframe> listuserframe = userframeService.listuserframe(userNum, userId);
//        return listuserframe;
//    }

    //사용자 개인 프레임 확인(조회 : user_num, user_id) 포스트맨 key value
    @GetMapping("/listuserframe")
    public List<Userframe> listuserframe(@RequestParam("userNum") int userNum, @RequestParam("userId") String userId) {
        List<Userframe> listuserframe = userframeService.listuserframe(userNum, userId);
        return listuserframe;
    }


    //사용자 개인 프레임 등록 (user_num, user_id)
    @PostMapping("/createuserframe")
    public String createuserframe(UserframeFrom userframefrom){
        String result = userframeService.createuserframe(userframefrom);
        return result;
    }
    //사용자 개인 프레임 등록
//    @PostMapping("/createuserframe")
//    public void createuserframe(@RequestParam("userNum") int userNum, @RequestParam("userId") String userid,
//                                  @RequestParam("frameName") String framename, @RequestParam("frameWidth") int framewidth,
//                                  @RequestParam("frameHeight") int frameheight){
//        UserframeFrom userframefrom = new UserframeFrom();
//        userframefrom.setUserNum(userNum);
//        userframefrom.setUserId(userid);
//        userframefrom.setFrameName(framename);
//        userframefrom.setFrameWidth(framewidth);
//        userframefrom.setFrameHeight(frameheight);
//        userframeService.createuserframe(userframefrom);
//    }

    //사용자 개인 프레임 업데이트 (user_num, user_id, frame_name) 업데이트가 필요한가???
    @PutMapping()
    public String updateuserframe(){
        userframeService.updateuserframe();
        return"";
    }

    //사용자 개인 프레임 삭제 (user_num, user_id, frame_name)
    @DeleteMapping("/deleteuserframe")
    public String deleteuserframe(@RequestParam("userNum") int userNum, @RequestParam("userId") String userId,
                                  @RequestParam("frameName") String frameName){
        userframeService.deleteuserframe(userNum,userId,frameName);
        return "";
    }

//    @GetMapping
//    public String list(Model model) {
//        List<Userframe> userFrames = userframeService.getAllUserFrams();
//        model.addAttribute("userFrames", userFrames);
//        return "userframe/list";
//    }
//
//    @GetMapping("/create")
//    public String createForm(Model model) {
//        model.addAttribute("userframeForm", new UserframeFrom());
//        return "userframe/create";
//    }
//
//    @PostMapping("/create")
//    public String create(@ModelAttribute UserframeFrom userframeForm) {
//        userframeService.createUserFram(userframeForm);
//        return "redirect:/userframe";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String editForm(@PathVariable Long id, Model model) {
//        Userframe userframe = userframeService.getUserFramById(id);
//        UserframeFrom userframeForm = new UserframeFrom(userframe.getUser_num(), userframe.getUser_id(), userframe.getFrame_name(), userframe.getWidth(), userframe.getHeight());
//        model.addAttribute("userframeForm", userframeForm);
//        model.addAttribute("userframeId", id);
//        return "userframe/edit";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String edit(@PathVariable Long id, @ModelAttribute UserframeFrom userframeForm) {
//        userframeService.updateUserFram(id, userframeForm);
//        return "redirect:/userframe";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Long id) {
//        userframeService.deleteUserFram(id);
//        return "redirect:/userframe";
//    }
}
