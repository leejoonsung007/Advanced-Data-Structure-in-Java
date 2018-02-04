import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Handle {
    public static final double BASIC_ADDITIONAL_FEES = 10.0;
    public static final double BASIC_TAXES = 12.0;

    public Handle() {
    }

    //Manually insert data
    public static void FillInProperties(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas) {
        apartments.add(new Apartment(1, "Johnson", "Dublin1", 50.0D, 1, 2));
        apartments.add(new Apartment(2, "Steve", "Dublin2", 40.0D, 1, 3));
        apartments.add(new Apartment(3, "Lucy", "Dublin3", 45.0D, 2, 4));

        int i = 0;
        for (Apartment an_apt : apartments)
            for (i = 1; i < 4; i++) {
                an_apt.RentProperty(i);
            }

        houses.add(new House(4, "Alex", "Dublin4", 60.0D, 2, 4.0D));
        houses.add(new House(5, "Mary", "Dublin4", 68.0D, 3, 6.0D));
        houses.add(new House(6, "Jack", "Dublin4", 70.0D, 2, 3.0D));

        for (House a_house : houses)
            for (i = 1; i < 4; i++) {
                a_house.RentProperty(i);
            }

        villas.add(new Villa(7, "Joyce", "Dublin3", 90.0D, 15.0D, 10.0D));
        villas.add(new Villa(8, "Eric", "Dublin15", 100.0D, 18.0D, 12.0D));
        villas.add(new Villa(9, "Henry", "Dublin12", 105.0D, 19.0D, 11.0D));

        for (Villa a_villa : villas)
            for (i = 1; i < 4; i++) {
                a_villa.RentProperty(i);
            }
    }

    public static void PrintAllProperties(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas) {
        System.out.println("********************************************************Apartment Information********************************************************");
        for (Apartment a : apartments) {
            System.out.println("Register Number:" + a.getRegister_number() + "  Owner name:" + a.getOwner_name() + "  Address: " + a.getPostal_address() + "  Cost/day(€):" + a.getRental_cost_per_day() + "  Number of Storey:" + a.getStorey_number() + "  Number of Beds:" + a.getNumber_of_beds());
        }
        System.out.println();

        System.out.println("********************************************************House Information********************************************************");
        for (House h : houses) {
            System.out.println("Register Number:" + h.getRegister_number() + "  Owner name:" + h.getOwner_name() + "  Address: " + h.getPostal_address() + "  Cost/day(€):" + h.getRental_cost_per_day() + "  Number of Storey:" + h.getNumber_of_storeys() + "  Clearing Fees:" + h.getClearing_fees());
        }
        System.out.println();

        System.out.println("***********************************************************Villa Information***********************************************************");
        for (Villa v : villas) {
            System.out.println("Register Number:" + v.getRegister_number() + "  Owner name:" + v.getOwner_name() + "  Address: " + v.getPostal_address() + "  Cost/day(€):" + v.getRental_cost_per_day() + "  Luxury Tax/day:" + v.getLuxury_tax_per_day() + "  Room Service/day:" + v.getRoom_service_cost_per_day());
        }
        System.out.println();
    }

    public static void CalculateTotalIncome(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas) {
        System.out.println("Payment Information");

        for (Apartment a : apartments) {
            double villa_income = BASIC_ADDITIONAL_FEES * a.getRental_cost_per_day() / 100 + BASIC_ADDITIONAL_FEES * a.getRental_cost_per_day() / 100 + a.getRental_cost_per_day() *  a.getTotal_rental_days();
            System.out.println("The total fees for Apartment" + a.getRegister_number() + " is " + villa_income + " for " + a.getTotal_rental_days() + " days");
        }

        for(House h : houses){
            double house_income = BASIC_ADDITIONAL_FEES * h.getRental_cost_per_day() / 100 + BASIC_ADDITIONAL_FEES * h.getRental_cost_per_day() / 100 + h.getRental_cost_per_day() * h.getTotal_rental_days();
            System.out.println("The total fees for House" + h.getRegister_number() + " is " + house_income + " for " + h.getTotal_rental_days() + " days");
        }

        for(Villa v : villas){
            double villa_income = BASIC_ADDITIONAL_FEES * v.getRental_cost_per_day() / 100 + BASIC_ADDITIONAL_FEES * v.getRental_cost_per_day() / 100 + v.getRental_cost_per_day() * v.getTotal_rental_days();
            System.out.println("The total fees for Apartment" + v.getRegister_number() + " is " + villa_income + " for " + v.getTotal_rental_days() + " days");
        }

    }
}
