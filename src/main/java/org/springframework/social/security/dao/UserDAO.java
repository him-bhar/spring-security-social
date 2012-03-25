package org.springframework.social.security.dao;

import org.springframework.social.security.model.User;

public interface UserDAO {

  void save(User user);

  User findByUsername(String username);

}
