package com.api.blogAppApi.Service;

import com.api.blogAppApi.Model.BlogAppPostModel;
import com.api.blogAppApi.Repository.BlogAppPostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BlogAppService {

    @Autowired
    BlogAppPostRepository blogAppPostRepository;

    public List<BlogAppPostModel> findAll() {
        return blogAppPostRepository .findAll();
    }
    public Optional<BlogAppPostModel> findById(UUID id) {
        return blogAppPostRepository.findById(id);
    }
    @Transactional
    public BlogAppPostModel save(BlogAppPostModel post){
        return blogAppPostRepository.save(post);
    }
    @Transactional
    public void delete(BlogAppPostModel post){
        blogAppPostRepository.delete(post);
}
}
