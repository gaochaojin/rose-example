package com.gaochaojin.controllers;

import com.gaochaojin.model.Chen;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.paramresolver.ParamMetaData;
import net.paoding.rose.web.paramresolver.ParamResolver;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 参数解析器 参数中含有chen1、chen2就会返回Chan对象
 * @Date Created in 9:33 2019/3/8
 */
public class ChenBeanResolver implements ParamResolver {

    @Override
    public boolean supports(ParamMetaData metaData) {
        return Chen.class == metaData.getParamType();
    }

    @Override
    public Object resolve(Invocation inv, ParamMetaData metaData) throws Exception {
        for (String paramName : metaData.getParamNames()) {
            if (paramName != null) {
                Chen chen = new Chen();
                String chen1 = inv.getParameter("chen1");
                String chen2 = inv.getParameter("chen2");
                chen.setChen1(chen1);
                chen.setChen2(chen2);
                return chen;
            }
        }


        return null;
    }
}
