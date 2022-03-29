package com.example.Intercity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Intercity.bean.DriverBean;

@Repository
public interface AddDriverDao extends CrudRepository<DriverBean, Integer>{

}
