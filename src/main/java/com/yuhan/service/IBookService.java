package com.yuhan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yuhan.domain.Book;
import org.springframework.stereotype.Service;

/**
 * @author Yuhan
 * @create 2022-03-15 13:35
 */

public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize,Book book);

}
