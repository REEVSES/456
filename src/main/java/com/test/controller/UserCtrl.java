package com.test.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.dao.Json;
import com.test.dao.User;
import com.test.service.MemberService;
import com.test.utils.CheckEncoding;
import com.test.utils.Encript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/login")
public class UserCtrl extends HttpServlet {
    public MemberService userService;
    @Autowired
    public void setUserService(MemberService userService) {
        this.userService = userService;
    }
    @RequestMapping("index")
    public String testIndex(){
        return "index";
    }

    @RequestMapping(value = "signIn")
    @ResponseBody
    public User showUser(String username, String password) {
        User u = userService.getUserByName(username);
        String pwdMD5 =Encript.md5(password);
        if (pwdMD5.equals(u.getUserpwd())){
            return u;
        }else {
            return null;
        }
    }
    /*
    reset登录密码
     */
    @RequestMapping(value = "ResetPwd")
    @ResponseBody
    public Json ResetPwd (String username, String oldpwd, String newpwd) {
        System.out.print("\n"+username+"|||"+oldpwd+"|||"+newpwd);
        User u = userService.getUserByName(username);
        String newpwdMD5 =Encript.md5(newpwd);
        String oldpwdMD5 =Encript.md5(oldpwd);
        if (oldpwdMD5.equals(u.getUserpwd()) && !newpwdMD5.equals(u.getUserpwd())){
            //执行修改
            userService.resetPwd(newpwdMD5,username);

            return new Json("ok","修改成功！");
        }else {
            return new Json("error","修改失败！");
        }
    }
}
