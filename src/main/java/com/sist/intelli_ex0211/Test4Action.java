package com.sist.intelli_ex0211;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class Test4Action { /* 한 클래스에서 함수여러개를 주고 싶을 때 사용*/
    @RequestMapping("/t4.inc")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "연습TEST^^");
        mv.setViewName("ex4");
        return mv;
    }
    @RequestMapping("/t5.inc")
    public ModelAndView test2() {
        ModelAndView mv = new ModelAndView();
        LocalDate now = LocalDate.now();
        mv.addObject("date", now.toString());
        mv.setViewName("ex5");
        return mv;
    }
    @RequestMapping("/t6.inc")
    public ModelAndView test3(String v1) {
        String msg = "회원";

        // 받은 v1이라는 parameter의 값이 "admin"이면 msg의 값을 "관리자"로 변경하자!
        if(v1 != null && v1.equalsIgnoreCase("admin")) { // 대소문자 구분 없이 비교
            msg = "관리자";
        }

        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", msg);
        mv.setViewName("ex6"); /* viewPage 지정 WEB-INF 의 .jsp*/
        return mv;
    }
}
