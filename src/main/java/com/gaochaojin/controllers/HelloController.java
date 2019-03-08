package com.gaochaojin.controllers;

import com.gaochaojin.model.Chen;
import com.gaochaojin.model.Test;
import com.gaochaojin.service.TestService;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.annotation.rest.Post;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 17:23 2019/3/7
 */
@Path("")
public class HelloController {

    @Autowired
    private TestService testService;

    /**
     * 参数验证
     *
     * @param param
     * @return
     * @throws Exception
     */
    @Get("index")
    public String index(@NotBlank @Param("param") String param) throws Exception {
//        int i = 10 / 0;  //测试ErrorHandler
        return "@hello world";
    }

    /**
     * 测试参数解析器
     *
     * @param chen
     * @return http://localhost:8080/param?chen1=gaochaojin&chen2=zhouhousha
     * @throws Exception
     */
    @Get("param")
    public String param(Chen chen) throws Exception {
        return "@hello world:" + chen.getChen1() + ":" + chen.getChen2();
    }

    /**
     * 测试拦截器  未生效
     *
     * @return
     */
    @PriCheckRequired
    @Get("interceptor")
    public String interceptorAction() throws Exception {
        return "@this is a access track interceptor";
    }

    @Get("getTest")
    public String getTest() throws Exception {
        Test test = testService.getTest();
        String s = "hello the No." + test.getId() + " is " + test.getMsg();
        return "@" + s;
    }

    @Get("insertTest")
    @Post("insertTest")
    public int insertTest(@NotBlank @Param("id") Integer id, @NotBlank @Param("msg") String msg) throws Exception {
        Test test = new Test();
        test.setId(id);
        test.setMsg(msg);
        return testService.insertTest(test);
    }
}
