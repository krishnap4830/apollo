package com.example.Intercity.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Intercity.bean.VehicleBean;

@Repository
public interface AdminDao extends CrudRepository<VehicleBean, Integer>{
	ArrayList<VehicleBean> findByvehicleid(int vehicleid);
	ArrayList<VehicleBean> findBytype(String type);
	

}
