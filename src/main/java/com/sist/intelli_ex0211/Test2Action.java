package com.sist.intelli_ex0211;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;

public class Test2Action implements Controller {

    public Test2Action() {
        System.out.println("Test2Action생성");
    }
//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        ModelAndView mv = new ModelAndView();
//
//        LocalDate localDate = LocalDate.now();
//
//        mv.addObject("today", localDate.toString());
//        mv.setViewName("ex2");
//        return mv;
//    }

    /* 이방식을 더 많이 사용함*/
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {


        LocalDate today = LocalDate.now();

        ModelAndView mv = new ModelAndView();
        mv.addObject("today", today.toString());

        // 뷰페이지 지정
        mv.setViewName("ex2"); // WEB-INF/jsp/ex2.jsp를 의미함!
        return mv;
    }
}
