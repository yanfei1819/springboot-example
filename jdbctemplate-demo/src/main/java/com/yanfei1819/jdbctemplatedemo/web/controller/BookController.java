package com.yanfei1819.jdbctemplatedemo.web.controller;

import com.yanfei1819.jdbctemplatedemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-15.
 */
@RestController
public class BookController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/book/queryBooks")
    public List<Book> queryBooks(){
        String sql = "select * from book ";
        return jdbcTemplate.query(sql,new Object[]{},new BeanPropertyRowMapper<>(Book.class));
    }

    @GetMapping("/book/{id}")
    public Book queryBookById(@PathVariable Long id){
        String sql = "select * from book where id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(Book.class));
    }

    @PostMapping("/book/save")
    public int saveBook(@RequestBody Book book){
        String sql = "insert into book(book_name,book_price,book_author) values(?,?,?)";
        return jdbcTemplate.update(sql,book.getBookName(),book.getBookPrice(),book.getBookAuthor());
    }

    @GetMapping("/book/delete/{id}")
    public int deleteBook(@PathVariable Long id){
        String sql = "delete from book where id = ?";
        return jdbcTemplate.update(sql,id);
    }

}
