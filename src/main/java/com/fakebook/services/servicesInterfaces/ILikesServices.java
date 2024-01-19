package com.fakebook.services.servicesInterfaces;

import jakarta.servlet.http.HttpServletRequest;

public interface ILikesServices {
    void toggleLike(Long postId, HttpServletRequest request);
    void deleteLike(Long likeId);
}
