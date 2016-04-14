package cn.martin.jfinal;

import cn.martin.jfinal.controller.HelloController;
import cn.martin.jfinal.controller.UserController;
import com.jfinal.config.*;
import com.jfinal.render.ViewType;

/**
 * Created by Administrator on 2016/4/14.
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", HelloController.class);
        routes.add("/user", UserController.class);
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
