package com.test.controller;
import com.test.utils.Json;
import com.test.model.User;
import com.test.service.MemberService;
import com.test.utils.Encript;
import com.test.utils.loginLevel.ToLayuiJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class UserCtrl extends HttpServlet {
    public MemberService userService;
    //注入
    @Autowired
    public void setUserService(MemberService userService) {
        this.userService = userService;
    }


    /**
     * 登录判断
     * @param username
     * @param password
     * @return
     */
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

    /**
     *  重置登录密码
     * @param username
     * @param oldpwd
     * @param newpwd
     * @return
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

    /**
     * 返回登录权限
     * @param leve
     * @return
     */
    @RequestMapping(value = "level")
    @ResponseBody
    public ToLayuiJson selectLevel(String leve){
        return userService.toLayuiJson(leve);
    }
    @RequestMapping(value = "containMember")
    @ResponseBody
    public List<String> selectContain(String leve, String depet, String team){
        List<String > str =new ArrayList<>();
        System.out.printf(depet+"|||"+leve+"|||"+team);
        str = userService.selectContain(leve,depet,team);
        System.out.printf(str.get(1).toString());
        return str;
    }
}
