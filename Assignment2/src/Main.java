import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Apartment> apartments = new ArrayList<Apartment>();
        ArrayList<House> houses = new ArrayList<House>();
        ArrayList<Villa> villas = new ArrayList<Villa>();
        ArrayList<Car> cars = new ArrayList<Car>();
        ArrayList<Truck> trucks = new ArrayList<Truck>();

        HandlingBnb.readInputPropertyFile("/Users/leejoonsung/IdeaProjects/java/MyBnb/InputProperty.txt", apartments, houses, villas);
        HandlingBnb.GiveRentalProperty(apartments, houses, villas);
        HandlingBnb.PrintAllProperties("/Users/leejoonsung/IdeaProjects/java/MyBnb/OutputProperty.txt",apartments, houses, villas);
        HandleVehicle.readInputVehicleFile("/Users/leejoonsung/IdeaProjects/java/MyBnb/InputVehicle.txt", cars, trucks);
        HandleVehicle.PrintAllVehicle("/Users/leejoonsung/IdeaProjects/java/MyBnb/OutputVehicle.txt", cars, trucks);
        HandleVehicle.CalculateVehicleTotalIncome(cars, trucks);

//        HandlingBnb.CalculateTotalIncome(apartments, houses, villas);


    }
}
