public class Car extends Vehicle
{
    private int passenger_number;

    public Car(int register_number,int propertyID, String auto_name, String owner_name, String postal_address,
                 double rental_cost_per_day, int passenger_number)
    {
        super(register_number, propertyID, auto_name, owner_name, postal_address, rental_cost_per_day);
        this.passenger_number = passenger_number;
    }

    //Mutator
    /**
     * @param passenger_number the number of the storeys of this house
     */
    public void setPassenger_number(int passenger_number)
    {
        this.passenger_number = passenger_number;
    }
    //Accessor
    public int getPassenger_number()
    {
        return passenger_number;
    }

}
