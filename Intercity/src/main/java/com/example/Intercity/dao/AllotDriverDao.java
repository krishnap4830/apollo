package com.example.Intercity.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Intercity.bean.ReservationBean;
import com.example.Intercity.bean.VehicleBean;

@Repository
public interface AllotDriverDao  extends CrudRepository<ReservationBean, Integer>{
	ArrayList<ReservationBean> findByreservationid(int reservationid);

}


