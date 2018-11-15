package com.sheliming.service;

import com.sheliming.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(int id) {
        return new User(id,"testName");
    }
}
