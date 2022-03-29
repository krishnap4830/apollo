package com.example.Intercity.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Intercity.bean.DriverBean;
import com.example.Intercity.bean.ReservationBean;
import com.example.Intercity.bean.RouteBean;
import com.example.Intercity.bean.UserProfileBean;
import com.example.Intercity.bean.VehicleBean;
import com.example.Intercity.dao.AddDriverDao;
import com.example.Intercity.dao.AddProfileDao;
import com.example.Intercity.dao.AddRouteDao;
import com.example.Intercity.dao.AdminDao;
import com.example.Intercity.dao.AllotDriverDao;

@Service
public class AdminService 
{
	@Autowired
	private AdminDao adao;
	
	@Autowired
	private AddRouteDao ardao;
	
	@Autowired
	private AddDriverDao addao;
	
	@Autowired
	private AllotDriverDao alldao;
	
	@Autowired
	private AddProfileDao apdao;

	public VehicleBean addVehicle(VehicleBean vehicle) 
	{
		if(vehicle!=null)
		{
			VehicleBean vb=adao.save(vehicle);
			return vb; 
		}
		else
		{
			return vehicle;
		}
	}
	public RouteBean addRoute(RouteBean route) 
	{
		if(route!=null)
		{
			RouteBean vb=ardao.save(route);
			return vb; 
		}
		else
		{
			return route;
		}
	}
	
	public DriverBean addDriver(DriverBean driver) 
	{
		if(driver!=null)
		{
			DriverBean vb=addao.save(driver);
			return vb; 
		}
		else
		{
			return driver;
		}
	}
	
	public UserProfileBean addProfile(UserProfileBean profile) 
	{
		if(profile!=null)
		{
			UserProfileBean ub=apdao.save(profile);
			return ub; 
		}
		else
		{
			return profile;
		}
	}
	
	public ReservationBean allotDriver(ReservationBean reservation) 
	{
		if(reservation!=null)
		{
			ReservationBean rb=alldao.save(reservation);
			return rb; 
		}
		else
		{
			return reservation;
		}
	}
	
	public VehicleBean modifyVehicle(VehicleBean vehicle)
	{
		if(vehicle!=null)
		{
//			int id=Integer.parseInt(vehicle.getVehicleid());
			int id =vehicle.getVehicleid();
			VehicleBean vb=adao.findById(id).get();
			vb.setName(vehicle.getName());
			vb.setType(vehicle.getType());
			vb.setRegistrationnumber(vehicle.getRegistrationnumber());
			vb.setSeatingcapacity(vehicle.getSeatingcapacity());
			vb.setFareperkm(vehicle.getFareperkm());
			System.out.println("service");
			return adao.save(vb);
		}
		else
			return vehicle;
	}
	
	public DriverBean modifyDriver(DriverBean driver)
	{
		if(driver!=null)
		{
			int id=driver.getDriverid();
			DriverBean db=addao.findById(id).get();
			db.setName(driver.getName());
			db.setStreet(driver.getStreet());
			db.setLocation(driver.getLocation());
			db.setCity(driver.getCity());
			db.setState(driver.getState());
			db.setPincode(driver.getPincode());
			db.setMobileno(driver.getMobileno());
			db.setLicensenumber(driver.getLicensenumber());
			
			return addao.save(db);
		}
		else
			return driver;
	}
	
	public RouteBean modifyRoute(RouteBean route)
	{
		if(route!=null)
		{
			int id=route.getRouteid();
			RouteBean rb=ardao.findById(id).get();
			rb.setSource(route.getSource());
			rb.setDestination(route.getDestination());
			rb.setDistance(route.getDistance());
			rb.setTravelduration(route.getTravelduration());
			
			return ardao.save(rb);
		}
		else
			return route;
	}
	
	public void deleteVehicle(int id) 
	{
//		ArrayList<VehicleBean> data = adao.findById(id);
//		if(!data.isEmpty())
//		{
//			for(VehicleBean vb:data)
//				adao.delete(vb);
//		}
		adao.deleteById(id);

	}
	
	public ArrayList<VehicleBean> getAllVehicles()
	{
		return (ArrayList<VehicleBean>) adao.findAll();
	}
	
	public ArrayList<RouteBean> getAllRoutes()
	{
		return (ArrayList<RouteBean>) ardao.findAll();
	}
	
	public ArrayList<ReservationBean> getReservation()
	{
		return (ArrayList<ReservationBean>) alldao.findAll();
	}
	
	public ArrayList<VehicleBean> getByType(String type)
	{
		return(ArrayList<VehicleBean>) adao.findBytype(type);
	}
	
	public ArrayList<ReservationBean> getData(int user)
	{
		return(ArrayList<ReservationBean>) alldao.findByreservationid(user);
	}
	

	
	public ReservationBean cancelTicket(ReservationBean reservation)
	{
		if(reservation!=null)
		{
			int id=reservation.getReservationid();
			ReservationBean rb=alldao.findById(id).get();
			rb.setUserid(reservation.getUserid());
			rb.setVehicleid(reservation.getVehicleid());
			rb.setRouteid(reservation.getRouteid());
			rb.setBookingdate(reservation.getBookingdate());
			rb.setJourneydate(reservation.getJourneydate());
			rb.setDriverid(reservation.getDriverid());
			rb.setBookingstatus("cancelled");
			rb.setTotalfare(reservation.getTotalfare());
			rb.setBoardingpoint(reservation.getBoardingpoint());
			rb.setDroppoint(reservation.getDroppoint());
			
			return alldao.save(rb);
		}
		else
			return reservation;
	}
	
//	public int deleteShip(String shipID) {
//		ArrayList<ShipBean> shipData = adao.findByshipID(shipID);
//		System.out.println(shipData);
//		if(!shipData.isEmpty()) {
//		for(ShipBean sb:shipData)
//		adao.delete(sb);
//		return 1;
//		}
//		else {
//		return 0;
//		}
//		}

}
