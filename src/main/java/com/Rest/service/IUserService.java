package com.Rest.service;


import com.Rest.model.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    long findByUserName(String userName);
}
