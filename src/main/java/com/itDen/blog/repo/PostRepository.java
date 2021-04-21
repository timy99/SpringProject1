package com.itDen.blog.repo;

import com.itDen.blog.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post,Long> {


}
