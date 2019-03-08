package com.gaochaojin.dao;

import com.gaochaojin.model.Test;
import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.ReturnGeneratedKeys;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.annotation.SQLParam;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 说明必须以DAO结尾
 * @Date Created in 10:22 2019/3/8
 */
@DAO
public interface TestDAO {

    @SQL("select id,msg from test limit 1")
    public Test getTest();

    @ReturnGeneratedKeys //返回生成的id
    @SQL("insert into test (id,msg) values (:t.id,:t.msg)")
    public int insertTest(@SQLParam("t") Test test);

}
