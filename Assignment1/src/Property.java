public class Property {
    private int register_number;
    private String owner_name;
    private String postal_address;
    private double rental_cost_per_day;
    private int total_rental_days;

    public Property(int register_number, String owner_name, String postal_address, double rental_cost_per_day) {
        this.register_number = register_number;
        this.owner_name = owner_name;
        this.postal_address = postal_address;
        this.rental_cost_per_day = rental_cost_per_day;
    }

    public void setRegister_number(int register_number) {
        this.register_number = register_number;
    }

    public int getRegister_number() {
        return this.register_number;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_name() {
        return this.owner_name;
    }

    public void setPostal_address(String postal_address) {
        this.postal_address = postal_address;
    }

    public String getPostal_address() {
        return this.postal_address;
    }

    public void setRental_cost_per_day(double rental_cost_per_day) {
        this.rental_cost_per_day = rental_cost_per_day;
    }

    public double getRental_cost_per_day() {
        return this.rental_cost_per_day;
    }

    public void setTotal_rental_days(int total_rental_days) {
        this.total_rental_days = total_rental_days;
    }

    public int getTotal_rental_days() {
        return this.total_rental_days;
    }

    public void RentProperty(int RentalDays) {
        this.total_rental_days += RentalDays;
    }
}
