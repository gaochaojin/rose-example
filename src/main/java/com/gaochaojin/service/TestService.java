package com.gaochaojin.service;

import com.gaochaojin.dao.TestDAO;
import com.gaochaojin.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 10:30 2019/3/8
 */
@Service
public class TestService {

    @Autowired
    private TestDAO testDAO;

    public Test getTest() {
        return testDAO.getTest();
    }

    public int insertTest(Test test) {
        return testDAO.insertTest(test);
    }

}
