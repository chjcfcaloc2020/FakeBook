package com.fakebook.services.servicesInterfaces;

import com.fakebook.entities.Commentfac;
import com.fakebook.entities.FacebookUser;

import java.util.List;

public interface ICommentServices {

    Commentfac createComment(Long postId, String commentText, FacebookUser user);
    List<Commentfac> getCommentsByPostId(Long postId);
}
