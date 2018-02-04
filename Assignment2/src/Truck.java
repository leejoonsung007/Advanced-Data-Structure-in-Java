public class Truck extends Vehicle
{
    private String cargoweight;

    public Truck(int register_number, int propertyID, String auto_name, String owner_name, String postal_address,
               double rental_cost_per_day, String cargoweight)
    {
        super(register_number, propertyID, auto_name, owner_name, postal_address, rental_cost_per_day);
        this.cargoweight = cargoweight;
    }

    //Mutator
    public void setCargoweight(String cargoweight) {
        this.cargoweight = cargoweight;
    }
    //Accessor
    public String getCargoweight() {
        return cargoweight;
    }

}