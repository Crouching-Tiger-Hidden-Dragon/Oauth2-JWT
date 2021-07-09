package com.Rest.service;

import com.Rest.model.User;
import com.Rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public long findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

}