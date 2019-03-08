package com.gaochaojin.controllers;

import net.paoding.rose.web.ControllerInterceptorAdapter;
import net.paoding.rose.web.Invocation;

import java.lang.annotation.Annotation;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: controller拦截器 在需要拦截的路径上添加注解@PriCheckRequired
 * @Date Created in 9:46 2019/3/8
 */
public class AccessTrackInterceptor extends ControllerInterceptorAdapter {

    public AccessTrackInterceptor() {
        setPriority(29600);
    }

    @Override
    protected Object before(Invocation inv) throws Exception {

        return super.before(inv);
    }

    @Override
    public void afterCompletion(Invocation inv, Throwable ex) throws Exception {
        super.afterCompletion(inv, ex);
        System.out.println("afterCompletion==============" + inv.getRequestPath());
    }

    @Override
    protected Object after(Invocation inv, Object instruction) throws Exception {
        System.out.println("after==============" + inv.getRequestPath());
        return super.after(inv, instruction);
    }

    @Override
    protected Class<? extends Annotation> getRequiredAnnotationClass() {
        return PriCheckRequired.class;
    }

}
