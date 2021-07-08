package com.ibs.training.FlightBookingSpringBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.training.FlightBookingSpringBackend.Model.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Integer>{

}
