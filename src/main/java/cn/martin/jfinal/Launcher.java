package cn.martin.jfinal;

import com.jfinal.core.JFinal;

/**
 * Created by Administrator on 2016/4/14.
 */
public class Launcher {
    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 80, "/", 5);
    }
}
