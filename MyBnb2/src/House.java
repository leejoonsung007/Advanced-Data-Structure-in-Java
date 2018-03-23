public class House extends Property
{
    private int number_of_storeys;
    private double clearing_fees;

    public House(int register_number,int propertyID, String owner_name, String postal_address,
                 double rental_cost_per_day, int number_of_storeys, double clearing_fees)
    {
        super(register_number, propertyID ,owner_name, postal_address, rental_cost_per_day);
        this.number_of_storeys = number_of_storeys;
        this.clearing_fees = clearing_fees;
    }

    //Mutator
    public void setNumber_of_storeys(int number_of_storeys) {
        this.number_of_storeys = number_of_storeys;
    }
    //Accessor
    public int getNumber_of_storeys() {
        return number_of_storeys;
    }

    //Mutator
    public void setClearing_fees(double clearing_fees) {
        this.clearing_fees = clearing_fees;
    }
    //Accessor
    public double getClearing_fees() {
        return clearing_fees;
    }
}
