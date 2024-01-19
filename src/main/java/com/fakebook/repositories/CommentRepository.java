package com.fakebook.repositories;
import com.fakebook.entities.Commentfac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository<Commentfac,Long > {
    List<Commentfac> findByPostId(Long postId);
}
