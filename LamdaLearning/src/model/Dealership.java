package model;

/**
 * Created by Kamalkumar_S01 on 12/3/2016.
 */
public class Dealership {
    private Integer id;
    private String name;

    public Dealership(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
