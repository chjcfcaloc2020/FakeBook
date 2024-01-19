package com.fakebook.repositories;

import com.fakebook.entities.FacebookUser;
import com.fakebook.entities.Likes;
import com.fakebook.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Long> {
    boolean existsByPostAndUser(Post post, FacebookUser currentUsername);
    Integer deleteByPostAndUser(Post post, FacebookUser currentUsername);
}
