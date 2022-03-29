package com.example.Intercity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Intercity.bean.RouteBean;

@Repository
public interface AddRouteDao extends CrudRepository<RouteBean, Integer>{

}


