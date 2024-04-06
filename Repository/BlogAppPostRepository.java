package com.api.blogAppApi.Repository;

import com.api.blogAppApi.Model.BlogAppPostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface BlogAppPostRepository extends JpaRepository<BlogAppPostModel, UUID> {

}
