package com.sridhar.db.dao;


import com.sridhar.model.Flight;

import java.util.List;

public interface FlightDAO {
    List<Flight> getAllFlights();
    Flight getFlightById(String id);
    void addFlight(Flight flight);
    void deleteFlight(Flight flight);
}
