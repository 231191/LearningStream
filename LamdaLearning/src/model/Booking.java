package model;

/**
 * Created by Kamalkumar_S01 on 12/3/2016.
 */
public class Booking {
    private Integer id;
    private Dealership dealership;
    private int start;
    private int end;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public int getDifference(){
        return getEnd() - getStart();
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }


    public Booking(Integer id, Dealership dealership, int start, int end) {

        this.id = id;
        this.dealership = dealership;
        this.start = start;
        this.end = end;
    }
}
