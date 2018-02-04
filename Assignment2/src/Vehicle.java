//import java.util.ArrayList;
public class Vehicle implements RentalItem{
    private int register_number;
    private int propertyID;
    private String auto_name;
    private String owner_name;
    private String postal_address;
    private double rental_cost_per_day;
    private int total_rental_days;

    public Vehicle(int register_number, int propertyID, String auto_name, String owner_name, String postal_address, double rental_cost_per_day)
    {
        this.register_number = register_number;
        this.propertyID = propertyID;
        this.auto_name = auto_name;
        this.owner_name = owner_name;
        this.postal_address = postal_address;
        this.rental_cost_per_day = rental_cost_per_day;

    }
    //Mutator
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }
    //Accessor
    public int getPropertyID() {
        return propertyID;
    }

    //Mutator
    public void setRegister_number(int register_number) {
        this.register_number = register_number;
    }
    //Accessor
    public int getRegister_number() {
        return register_number;
    }

    //Mutator
    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
    //Accessor
    public String getOwner_name() {
        return owner_name;
    }

    //Mutator
    public void setAuto_name(String auto_name) {
        this.auto_name = auto_name;
    }
    //Accessor
    public String getAuto_name() {
        return auto_name;
    }

    //Mutator
    public void setPostal_address(String postal_address) {
        this.postal_address = postal_address;
    }
    //Accessor
    public String getPostal_address() {
        return postal_address;
    }

    //Mutator
    public void setRental_cost_per_day(double rental_cost_per_day) {
        this.rental_cost_per_day = rental_cost_per_day;
    }
    //Accessor
    public double getRental_cost_per_day() {
        return rental_cost_per_day;
    }

    //Mutator
    public void setTotal_rental_days(int total_rental_days) {
        this.total_rental_days = total_rental_days;
    }
    //Accessor
    public int getTotal_rental_days() {
        return total_rental_days;
    }


    /**
     * @param RentalDays the days of user to want to rent
     */

    public void RentAnItem(int RentalDays)
    {
        this.total_rental_days += RentalDays;
    }

}
