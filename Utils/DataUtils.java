package com.api.blogAppApi.Utils;

import com.api.blogAppApi.Model.BlogAppPostModel;
import com.api.blogAppApi.Repository.BlogAppPostRepository;
import jakarta.annotation.PostConstruct;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataUtils {
   /* @Autowired
    BlogAppPostRepository blogAppPostRepository;

    @PostConstruct
    public void savePosts() {

        List<BlogAppPostModel> postList = new ArrayList<>();
        BlogAppPostModel post1 = new BlogAppPostModel();
        post1.setAutor("Bruno Alexandre");
        post1.setData(LocalDate.now());
        post1.setTexte("Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                + " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
                + "when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
                + "It has survived not only five centuries, but also the leap into electronic typesetting, "
                + "remaining essentially unchanged. It was popularised in the 1960s with the release of"
                + " Letraset sheets containing Lorem Ipsum passages, and more recently with desktop "
                + "publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        post1.setTitulo("Docker");

        BlogAppPostModel post2 = new BlogAppPostModel();
        post2.setAutor("Michelli Brito");
        post2.setData(LocalDate.now());
        post2.setTexte("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
                + "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
                + "when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
                + "It has survived not only five centuries, but also the leap into electronic typesetting,"
                + " remaining essentially unchanged. It was popularised in the 1960s with the release of "
                + "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing "
                + "software like Aldus PageMaker including versions of Lorem Ipsum.");
        post2.setTitulo("API REST");

        postList.add(post1);
        postList.add(post2);

        for (BlogAppPostModel post : postList) {
            BlogAppPostModel postSaved = blogAppPostRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }*/
}
