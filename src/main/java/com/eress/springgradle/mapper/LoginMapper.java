package com.eress.springgradle.mapper;

import com.eress.springgradle.model.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    UserDTO getUserInfo(UserDTO resUser) throws Exception;
}
