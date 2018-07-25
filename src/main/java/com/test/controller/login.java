package com.test.controller;
import com.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.dao.companyMemberDao;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
@Controller
public class login extends HttpServlet {

    public MemberService userService;
    public MemberService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(MemberService userService) {
        this.userService = userService;
    }

    @RequestMapping("index")
    public String testIndex(){
        return "testIndex";
    }

    @RequestMapping("login")
    public String showUser(HttpServletRequest request) {
        int id=Integer.parseInt(request.getParameter("id"));
        System.out.print("解析id=:"+id+"\n");
        companyMemberDao u = userService.getUserById(id);
        System.out.print("解析返回username=:"+u.getUSERNAME()+"\n");
        request.setAttribute("memberInfo", u);
        return "login";
    }
}
