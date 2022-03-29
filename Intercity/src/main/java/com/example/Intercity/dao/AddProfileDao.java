package com.example.Intercity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Intercity.bean.UserProfileBean;

@Repository
public interface AddProfileDao extends CrudRepository<UserProfileBean, Integer> {

}
