package com.korit.servlet_study.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.korit.servlet_study.entity.Author;
import com.korit.servlet_study.entity.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/api/book")
public class BookRestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Book book = Book.builder()
                .bookId(1234)
                .bookName("테스트북")
                .author("차정민")
                .publisher("출판사")
                .category("목록")
                .imgUrl("Url")
                .build();
        String jsonBook = objectMapper.writeValueAsString(book);
        System.out.println(jsonBook);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);


    }

}
