package com.yuhan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuhan.domain.Book;

import java.util.List;

/**
 * @author Yuhan
 * @create 2022-03-15 13:20
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int pageSize);

}
