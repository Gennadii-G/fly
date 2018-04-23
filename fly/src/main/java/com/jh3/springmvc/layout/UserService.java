package com.jh3.springmvc.layout;


import com.jh3.springmvc.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    public User getByName(String name);
}
