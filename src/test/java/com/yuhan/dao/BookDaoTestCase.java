package com.yuhan.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Yuhan
 * @create 2022-03-15 12:45
 */
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    public void test1() {

    }
}
