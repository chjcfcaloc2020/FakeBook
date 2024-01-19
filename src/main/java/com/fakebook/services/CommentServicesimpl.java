package com.fakebook.services;

import com.fakebook.entities.Commentfac;
import com.fakebook.entities.FacebookUser;
import com.fakebook.entities.Post;
import com.fakebook.repositories.CommentRepository;
import com.fakebook.repositories.PostRepository;
import com.fakebook.services.servicesInterfaces.ICommentServices;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServicesimpl implements ICommentServices {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentServicesimpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public Commentfac createComment(Long postId, String commentText, FacebookUser user) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Commentfac comment = new Commentfac();
        comment.setText(commentText);
        comment.setTimestamp(LocalDateTime.now());
        comment.setUser(user);
        comment.setPost(post);

        return commentRepository.save(comment);
    }

    @Override
    public List<Commentfac> getCommentsByPostId(Long postId) {
        return commentRepository.findByPostId(postId);
    }

}
