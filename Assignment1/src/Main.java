import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Apartment> apartments = new ArrayList();
        ArrayList<House> houses = new ArrayList();
        ArrayList<Villa> villas = new ArrayList();
        Handle.FillInProperties(apartments, houses, villas);
        Handle.PrintAllProperties(apartments, houses, villas);
        Handle.CalculateTotalIncome(apartments, houses, villas);
    }
}