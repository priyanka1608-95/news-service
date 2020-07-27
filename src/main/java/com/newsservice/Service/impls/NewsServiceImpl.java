package com.newsservice.Service.impls;

import com.newsservice.Model.News;
import com.newsservice.Repository.NewsRepository;
import com.newsservice.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService
{
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> getNews() {
        return newsRepository.findAll();
    }
}
