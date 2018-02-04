public class Villa extends Property
{
    private double room_service_cost_per_day;
    private double luxury_tax_per_day;

    public Villa(int register_number,int propertyID, String owner_name, String postal_address,
                 double rental_cost_per_day, double room_service_cost_per_day, double luxury_tax_per_day )
    {
        super(register_number,propertyID, owner_name, postal_address, rental_cost_per_day);
        this.room_service_cost_per_day = room_service_cost_per_day;
        this.luxury_tax_per_day = luxury_tax_per_day;
    }

    //Mutator
    public void setLuxury_tax_per_day(double luxury_tax_per_day) {
        this.luxury_tax_per_day = luxury_tax_per_day;
    }
    //Accessor
    public double getLuxury_tax_per_day() {
        return luxury_tax_per_day;
    }

    //Mutator
    public void setRoom_service_cost_per_day(double room_service_cost_per_day) {
        this.room_service_cost_per_day = room_service_cost_per_day;
    }
    //Accessor
    public double getRoom_service_cost_per_day() {
        return room_service_cost_per_day;
    }
}
