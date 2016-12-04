package main;

import model.Booking;
import model.Dealership;
import utility.DoCalculation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Kamalkumar_S01 on 12/3/2016.
 */
public class Calculate {


    public static void main(String[] args) {

        DoCalculation util = new DoCalculation();

        List<Booking> bookings = new ArrayList<Booking>();
        Map<String, Dealership> dealershipMap = new HashMap<>();


        //Initialising 3 dealer
        Dealership d1 = new Dealership(1,"Kamal");
        Dealership d2 = new Dealership(2,"Sunny");
        Dealership d3 = new Dealership(3,"Rahul");

        //6 booking with D1 having 4, D2 having 2 and D3 no bookings
        Booking b1 = new Booking(1,d1,20,30);
        Booking b2 = new Booking(2,d2,24,32);
        Booking b3 = new Booking(3,d1,22,32);
        Booking b4 = new Booking(4,d1,20,30);
        Booking b5 = new Booking(5,d2,27,33);
        Booking b6 = new Booking(6,d1,21,25);

        bookings.add(b1);
        bookings.add(b2);
        bookings.add(b3);
        bookings.add(b4);
        bookings.add(b5);
        bookings.add(b6);

        dealershipMap.put("1",d1);
        dealershipMap.put("2",d2);
        dealershipMap.put("3",d3);

        //check booking
        System.out.println("---- Bookings ----");

        bookings.forEach(booking -> System.out.println("booking = " + booking.getId() +" Dealership Name = "+booking.getDealership().getName()));
        System.out.println("---- Dealership ----");
        dealershipMap.forEach((s, dealership) -> System.out.println("dealership = " + s + " / "+dealership.getName() ));



        Map<Dealership,List<Booking>> data = bookings.stream().collect(Collectors.groupingBy(Booking::getDealership,Collectors.toList()));


        System.out.println("------------------List of bookings grouped by dealer------------------");

        System.out.println("testsize = " + data.size());

        System.out.println("-------DealerId | DealerName | Average | Min | Max | Median-----------");

        data.forEach((d,bl) -> {System.out.println(d.getId()+" | "+ d.getName() +" | " + util.average(bl)+" | " + util.lowest(bl) + " | " + util.maxium(bl) + " | " + util.median(bl));});



    }
}
