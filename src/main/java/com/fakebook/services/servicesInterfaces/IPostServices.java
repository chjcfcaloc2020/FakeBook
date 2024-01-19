package com.fakebook.services.servicesInterfaces;

import com.fakebook.entities.Post;

import java.util.List;
import java.util.Optional;

public interface IPostServices {
    List<Post> getAllPosts();
    Optional<Post> getPostById(Long id);
    Post createPost(Post post);
    Post updatePost(Post post);
    void deletePost(Long id);



}
