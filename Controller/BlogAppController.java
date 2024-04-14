package com.api.blogAppApi.Controller;

import com.api.blogAppApi.Dtos.BlogAppDto;
import com.api.blogAppApi.Dtos.BlogAppRecordDto;
import com.api.blogAppApi.Model.BlogAppPostModel;
import com.api.blogAppApi.Service.BlogAppService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class BlogAppController {

    @Autowired
    BlogAppService blogAppService;

    @GetMapping(value = "/posts")
    public ResponseEntity<List<BlogAppPostModel>> getPosts(){
        List<BlogAppPostModel> posts = blogAppService.findAll();

        if (posts.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(posts);
        }
        return ResponseEntity.status(HttpStatus.OK).body(posts);
    }

    @GetMapping (value = "/posts/{id}")
    public ResponseEntity<Object> getPostDetails(@PathVariable("id")UUID id){
        Optional<BlogAppPostModel> blogAppPostModelOptional = blogAppService.findById(id);

        if (!blogAppPostModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("blog not post");
        }
        return ResponseEntity.status(HttpStatus.OK).body(blogAppPostModelOptional.get());
    }

    @PostMapping (value = "/newpost")
    public ResponseEntity<Object> savePost(@RequestBody @Valid BlogAppRecordDto blogAppDto){

        var postModel = new BlogAppPostModel();
        BeanUtils.copyProperties(blogAppDto, postModel);
        postModel.setData(LocalDate.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(blogAppService.save(postModel));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deletePost(@PathVariable("id") UUID id) {

        Optional<BlogAppPostModel> postOptional = blogAppService.findById(id);
        if (!postOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Post not found with id: " + id);
        }

        BlogAppPostModel post = postOptional.get();
        blogAppService.delete(post);

        return ResponseEntity.status(HttpStatus.OK).body("Post deleted successfully");
    }



}

