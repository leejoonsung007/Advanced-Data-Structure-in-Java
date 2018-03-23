import java.io.*;
import java.util.ArrayList;

public class HandleVehicle {
    public static final double BASIC_ADDITIONAL_FEES = 5;
    public static final double BASIC_TAXES = 8;

    public static void readInputVehicleFile(String VehiclefileName, ArrayList<Car> cars, ArrayList<Truck> trucks) {
        File file = new File(VehiclefileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // read one line every time until no text
            while ((tempString = reader.readLine()) != null) {
                String[] line_part = tempString.split(" ");
                int property_type = Integer.parseInt(line_part[0]);
                line++;

                //Initial info for Car
                int passenger = 0;

                //Initial info for Truck
                String weight = "";

                //Shared Initial info for all
                int number = 0, ID = 0;
                double cost = 0;
                String name = "", address = "", model = "";

//                Car
                if (property_type == 1) {
                    number = Integer.parseInt(line_part[1]);
                    ID = Integer.parseInt(line_part[2]);
                    model = line_part[3];
                    name = line_part[4];
                    address = line_part[5];
                    cost = Double.parseDouble(line_part[6]);
                    passenger = Integer.parseInt(line_part[7]);
                    cars.add(new Car(number, ID, model, name, address, cost, passenger));

                }

//                Truck
                else if (property_type == 2) {
                    number = Integer.parseInt(line_part[1]);
                    ID = Integer.parseInt(line_part[2]);
                    model = line_part[3];
                    name = line_part[4];
                    address = line_part[5];
                    cost = Double.parseDouble(line_part[6]);
                    weight = line_part[7];
                    trucks.add(new Truck(number, ID, model, name, address, cost, weight));

                }

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
    //
    public static void PrintAllVehicle(String file, ArrayList<Car> cars, ArrayList<Truck> trucks) {
        String output_information = "";
        String car_title = ("********************************************************Car Information********************************************************");
        System.out.println(car_title);
        for (Car acar : cars) {
            String cars_information = ("Register Number:" + acar.getRegister_number() + " Model:" + acar.getAuto_name() + " PropertyId:" + acar.getPropertyID() + "  Owner name:" + acar.getOwner_name() + "  Address:" + acar.getPostal_address() + "  Cost/day(€):"
                    + acar.getRental_cost_per_day() + "  Passenger number:" + acar.getPassenger_number());
            System.out.println(cars_information);
            output_information += car_title + "\n" + cars_information + "\n";
        }
        System.out.println();

        String truck_title = ("********************************************************Truck Information********************************************************");
        System.out.println(truck_title);
        for (Truck atruck : trucks) {
            String trucks_information = ("Register Number:" + atruck.getRegister_number() + " Model:" + atruck.getAuto_name() +" PropertyId:" + atruck.getPropertyID() + "  Owner name:" + atruck.getOwner_name() + "  Address:" + atruck.getPostal_address() + "  Cost/day(€):"
                    + atruck.getRental_cost_per_day() + "  Cargo Weight:" + atruck.getCargoweight());
            System.out.println(trucks_information);
            output_information += truck_title + "\n" + trucks_information + "\n";
        }
        System.out.println();

        try {
            PrintWriter myOutFile = new PrintWriter(file);
            myOutFile.write(output_information);
            myOutFile.close();
        } catch (Exception ex) {
            System.out.println("exception" + ex.getMessage() + "caught");
        }
    }

    public static void CalculateVehicleTotalIncome(ArrayList<Car>cars, ArrayList<Truck> trucks) {
        System.out.println("Payment Information");
        for (Car acar : cars) {
            acar.RentAnItem(2);
            double car_income = BASIC_ADDITIONAL_FEES * acar.getRental_cost_per_day() / 100 + BASIC_TAXES * acar.getRental_cost_per_day() / 100 + acar.getRental_cost_per_day() * acar.getTotal_rental_days() - acar.getRental_cost_per_day();
            System.out.println("The total fees for car " + acar.getAuto_name() + " is " + car_income + " for " + acar.getTotal_rental_days() + " days");
        }

        for (Truck atruck : trucks) {
            atruck.RentAnItem(3);
            double truck_income = BASIC_ADDITIONAL_FEES * atruck.getRental_cost_per_day() / 100 + BASIC_TAXES * atruck.getRental_cost_per_day() / 100 + atruck.getRental_cost_per_day() * atruck.getTotal_rental_days() - atruck.getRental_cost_per_day();
            System.out.println("The total fees for truck " + atruck.getAuto_name() + " is " + truck_income + " for " + atruck.getTotal_rental_days() + " days");
        }
    }

}
