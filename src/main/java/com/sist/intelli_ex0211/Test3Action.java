package com.sist.intelli_ex0211;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test3Action implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // v1이라는 파라미터를 받는다.
        String v1 = request.getParameter("v1");
        String msg = "회원";

        // 받은 v1이라는 parameter의 값이 "admin"이면 msg의 값을 "관리자"로 변경하자!
        if(v1 != null && v1.equalsIgnoreCase("admin")) { // 대소문자 구분 없이 비교
            msg = "관리자";
        }

        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", msg);
        mv.setViewName("ex3"); /* viewPage 지정 WEB-INF 의 .jsp*/
        return mv;
    }
}
