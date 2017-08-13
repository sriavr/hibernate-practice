package com.sridhar.hibernatedemo;

import com.sridhar.db.dao.FlightDAO;
import com.sridhar.model.Flight;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan(basePackages = "com.sridhar")
@ContextConfiguration
public class FlightDAOTest {

    private FlightDAO flightDAO;

    @Autowired(required = true)
    public void setFlightDAO(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Test
    @Rollback(false)
    public void testAddFlight(){
        Assert.assertTrue(flightDAO!=null);
        Flight flight = new Flight();
        flight.setCompanyPrefix("Krishna");
        flight.setNumber("GARUDA");
        flightDAO.addFlight(flight);
    }

    @Test
    @Rollback(true)
    public void testGetAllFlights(){
        int count = flightDAO.getAllFlights().size() ;
        Flight flight = new Flight();
        flight.setCompanyPrefix("Krishna");
        flight.setNumber("GARUDA");
        flightDAO.addFlight(flight);
    }

    @Configuration
    public static class Config{
        @Bean
        FlightDAO flightDAO(){
            FlightDAO flightDAO = new FlightDAO() {
                @Override
                public List<Flight> getAllFlights() {
                    List<Flight> flights = new ArrayList<>();
                    Flight flight = new Flight();
                    flight.setCompanyPrefix("Krishna");
                    flight.setNumber("GARUDA");
                    flights.add(flight);
                    flight = new Flight();
                    flight.setCompanyPrefix("Krishna");
                    flight.setNumber("HANUMAN");
                    flights.add(flight);
                    return flights;
                }

                @Override
                public Flight getFlightById(String id) {
                    return null;
                }

                @Override
                public void addFlight(Flight flight) {

                }

                @Override
                public void deleteFlight(Flight flight) {

                }
            };
            return flightDAO;
        }
    }
}
