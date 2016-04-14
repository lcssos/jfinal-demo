package cn.martin.jfinal.controller;

import com.jfinal.core.Controller;

/**
 * Created by Administrator on 2016/4/14.
 */
public class HelloController extends Controller {
    public void index() {
        renderText("Hello JFinal World.");
    }
}
