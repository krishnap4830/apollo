package com.example.Intercity.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Intercity.bean.DriverBean;
import com.example.Intercity.bean.ReservationBean;
import com.example.Intercity.bean.RouteBean;
import com.example.Intercity.bean.UserProfileBean;
import com.example.Intercity.bean.VehicleBean;
import com.example.Intercity.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class Admin 
{
	@Autowired
	private AdminService adserv;
	
	@RequestMapping(value="/selectAll/createvehicle" ,method=RequestMethod.POST)
	public ResponseEntity<VehicleBean> addVehicle(@RequestBody VehicleBean vehicle)
	{
		VehicleBean vb=adserv.addVehicle(vehicle);
		return new ResponseEntity<>(vb,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/selectAll/createroute" ,method=RequestMethod.POST)
	public ResponseEntity<RouteBean> addroute(@RequestBody RouteBean route)
	{
		RouteBean rb=adserv.addRoute(route);
		return new ResponseEntity<>(rb,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/selectAll/createdriver" ,method=RequestMethod.POST)
	public ResponseEntity<DriverBean> addDriver(@RequestBody DriverBean driver)
	{
		DriverBean db=adserv.addDriver(driver);
		return new ResponseEntity<>(db,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/selectAll/allotdriver" ,method=RequestMethod.POST)
	public ResponseEntity<ReservationBean> allotdriver(@RequestBody ReservationBean reservation)
	{
		ReservationBean rb=adserv.allotDriver(reservation);
		return new ResponseEntity<>(rb,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/selectAll/userprofile" ,method=RequestMethod.POST)
	public ResponseEntity<UserProfileBean> userprofile(@RequestBody UserProfileBean profile)
	{
		UserProfileBean rb=adserv.addProfile(profile);
		return new ResponseEntity<>(rb,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/selectAll/modifyvehicle" ,method=RequestMethod.POST)
	public ResponseEntity<VehicleBean> modifyVehicle(@RequestBody VehicleBean vehicle)
	{
		VehicleBean vb=adserv.modifyVehicle(vehicle);
		return new ResponseEntity<>(vb,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/selectAll/modifydriver" ,method=RequestMethod.POST)
	public ResponseEntity<DriverBean> modifydriver(@RequestBody DriverBean driver)
	{
		DriverBean vb=adserv.modifyDriver(driver);
		return new ResponseEntity<>(vb,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/selectAll/modifyroute" ,method=RequestMethod.POST)
	public ResponseEntity<RouteBean> modifyroute(@RequestBody RouteBean route)
	{
		RouteBean rb=adserv.modifyRoute(route);
		return new ResponseEntity<>(rb,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/selectAll/deletevehicle",method=RequestMethod.POST)
	public void deletevehicle(@RequestBody VehicleBean vehicle)
	{
		System.out.println(vehicle.getVehicleid());
		adserv.deleteVehicle(vehicle.getVehicleid());
		System.out.println("hiii");
	}
	
	@GetMapping("/selectAll/getvehicles")
	public ArrayList<VehicleBean> getAllVehicles()
	{
		ArrayList<VehicleBean> list=adserv.getAllVehicles();
		return list;
	}
	
	@GetMapping("/selectAll/getroutes")
	public ArrayList<RouteBean> getAllRoutes()
	{
		ArrayList<RouteBean> list=adserv.getAllRoutes();
		return list;
	}
	
	@GetMapping("/selectAll/getreservation")
	public ArrayList<ReservationBean> getAllReservation()
	{
		ArrayList<ReservationBean> list=adserv.getReservation();
		return list;
	}
	

	
	@GetMapping("/selectAll/getbytype/{type}")
	public ArrayList<VehicleBean> getVehicleById(@PathVariable("type") String type){
	return adserv.getByType(type);
	}
	
	@GetMapping("/selectAll/getdata/{reservationid}")
	public ArrayList<ReservationBean> getdata(@PathVariable("reservationid") int reservationid)
	{
		System.out.println(reservationid);
		return adserv.getData(reservationid);
	}
	
	@RequestMapping(value="/selectAll/cancel" ,method=RequestMethod.POST)
	public ResponseEntity<ReservationBean> cancelticket(@RequestBody ReservationBean reservation)
	{
		ReservationBean rb=adserv.cancelTicket(reservation);
		return new ResponseEntity<>(rb,HttpStatus.CREATED);
		
	}

}
