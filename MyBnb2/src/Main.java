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

        HandleBnb.readInputPropertyFile("src/InputProperty.txt", apartments, houses, villas);
        HandleBnb.GiveRentalProperty(apartments, houses, villas);
        HandleBnb.PrintAllProperties("src/OutputProperty.txt", apartments, houses, villas);
        HandleVehicle.readInputVehicleFile("src/InputVehicle.txt", cars, trucks);
        HandleVehicle.PrintAllVehicle("src/OutputVehicle.txt", cars, trucks);
        HandleVehicle.CalculateVehicleTotalIncome(cars, trucks);
    }
}
