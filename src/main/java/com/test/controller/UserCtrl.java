package com.test.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.dao.User;
import com.test.service.MemberService;
import com.test.utils.CheckEncoding;
import com.test.utils.Encript;
import com.test.utils.GBK2UTF;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;
import java.util.Base64.Encoder;

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
    public String showUser(String username, String password) throws JsonProcessingException {
        User u = userService.getUserByName(username);
//        u.setUserid(GBK2UTF.getUTF8StringFromGBKString(u.getUserid()));
//        u.setUsername(GBK2UTF.getUTF8StringFromGBKString(u.getUsername()));
//        u.setDepet(GBK2UTF.getUTF8StringFromGBKString(u.getDepet()));
//        u.setTeam(GBK2UTF.getUTF8StringFromGBKString(u.getTeam()));
//        u.setFullpartname(GBK2UTF.getUTF8StringFromGBKString(u.getFullpartname()));
        System.out.println(CheckEncoding.getEncoding(u.getUsername()));
        String pwdMD5 =Encript.md5(password);
        System.out.println("\n"+u);
        if (pwdMD5.equals(u.getUserpwd())){
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(u);
            return CheckEncoding.getEncoding(s);
        }else {
            return null;
        }
    }
    /*
    reset登录密码
     */
    @RequestMapping(value = "ResetPwd",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String ResetPwd (String username,String oldpwd,String newpwd) {
        System.out.print("\n"+username+"|||"+oldpwd+"|||"+newpwd);
        User u = userService.getUserByName(username);
        String newpwdMD5 =Encript.md5(newpwd);
        String oldpwdMD5 =Encript.md5(oldpwd);
        if (oldpwdMD5.equals(u.getUserpwd()) && !newpwdMD5.equals(u.getUserpwd())){
            //执行修改
            userService.resetPwd(newpwd,username);
            return "1";
        }else {
            return "0";
        }
    }
}
