package com.yuhan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuhan.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Yuhan
 * @create 2022-03-15 12:37
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
