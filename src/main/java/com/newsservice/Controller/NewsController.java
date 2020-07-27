package com.newsservice.Controller;

import com.newsservice.Model.News;
import com.newsservice.Model.NewsResponse;
import com.newsservice.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController
{
    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public ResponseEntity<?> getNews()
    {
        NewsResponse newsResponse=new NewsResponse();
        List<News> newsList =newsService.getNews();
       if(null != newsList) {
           newsResponse.setNewsList(newsList);
       }

        return new ResponseEntity<>(newsResponse, HttpStatus.OK);
    }
}
