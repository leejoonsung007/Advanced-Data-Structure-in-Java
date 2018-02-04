public class Apartment extends Property {
    private int storey_number;
    private int number_of_beds;

    public Apartment(int register_number, String owner_name, String postal_address, double rental_cost_per_day, int storey_number, int number_of_beds) {
        super(register_number, owner_name, postal_address, rental_cost_per_day);
        this.storey_number = storey_number;
        this.number_of_beds = number_of_beds;
    }

    public void setStorey_number(int storey_number) {
        this.storey_number = storey_number;
    }

    public int getStorey_number() {
        return this.storey_number;
    }

    public void setNumber_of_beds(int number_of_beds) {
        this.number_of_beds = number_of_beds;
    }

    public int getNumber_of_beds() {
        return this.number_of_beds;
    }
}
