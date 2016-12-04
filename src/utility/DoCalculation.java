package utility;

import model.Booking;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kamalkumar_S01 on 12/4/2016.
 */
public class DoCalculation {
    public double average(List<Booking> bookings){
        return bookings.stream().mapToDouble(Booking::getDifference).average().getAsDouble();
    }

    public double lowest(List<Booking> bookings){
        return bookings.stream().mapToDouble(Booking::getDifference).min().getAsDouble();
    }

    public double maxium(List<Booking> bookings){
        return bookings.stream().mapToDouble(Booking::getDifference).max().getAsDouble();
    }

    public double median(List<Booking> bookings){


        List<Double> difference = bookings.stream().sorted((e1,e2) -> Integer.compare(e1.getDifference(),e2.getDifference())).mapToDouble(Booking::getDifference).boxed().collect(Collectors.toList());
        return (difference.size()%2 != 0) ? difference.get(difference.size()/2) : (difference.get(difference.size()/2) + difference.get(difference.size()/2 - 1))/2;
    }
}
