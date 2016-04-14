package cn.martin.jfinal.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created by Administrator on 2016/4/14.
 */
public class UserController extends Controller {

    @ActionKey("/login")
    public void login() {
        renderText("login.html");
    }
}
