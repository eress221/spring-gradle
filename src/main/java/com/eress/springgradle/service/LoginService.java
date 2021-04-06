package com.eress.springgradle.service;

import com.eress.springgradle.model.UserDTO;

public interface LoginService {

    UserDTO getUserInfo(UserDTO reqUser);
    String loginCheck(UserDTO reqUser, UserDTO resUser);
}
