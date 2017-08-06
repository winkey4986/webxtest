package com.wrz.app1.module.action;

import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.wrz.app1.Visitor;

public class LoginAction {

    public void doCheck(@FormGroup("login") Visitor visitor, Navigator nav) {
        String name = visitor.getName();
        String passwd = visitor.getPasswd();
        if ("admin".equals(name) && "admin".equals(passwd)) {
            nav.redirectTo("app1Link").withTarget("form/welcome").withParameter("key","wrz").withParameter("name", name);
        } else {

        }
    }
}
