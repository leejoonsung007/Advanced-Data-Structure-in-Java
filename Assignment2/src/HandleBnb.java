import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class HandleBnb{
    public static final double BASIC_ADDITIONAL_FEES = 10;
    public static final double BASIC_TAXES = 12;
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 100;

    // Get the data from the txt file and then add the data to corresponding ArrayList.
    public static void readInputPropertyFile(String fileName, ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // read one line every time until no text
            while ((tempString = reader.readLine()) != null) {
                // show the line number
//                System.out.println("line " + line + ": " + tempString);
                String[] line_part = tempString.split(" ");
                int property_type = Integer.parseInt(line_part[0]);
                line++;

                //Initial info for Apartment
                int storey_num = 0, beds = 0;

                //Initial info for house
                int storey = 0; double clearing = 0;

                //Initial info for villa
                double tax = 0, service = 0;

                //Shared Initial info for all
                int number = 0, ID = 0; double cost = 0;
                String name = "", address = "";


                //Apartment
                if (property_type == 1)
                {
                    number = Integer.parseInt(line_part[1]);
                    ID = Integer.parseInt(line_part[2]);
                    name = line_part[3];
                    address = line_part[4];
                    cost = Double.parseDouble(line_part[5]);
                    storey_num = Integer.parseInt(line_part[6]);
                    beds = Integer.parseInt(line_part[7]);
                    apartments.add(new Apartment(number, ID, name, address, cost, storey_num, beds));

                }

                //House
                else if(property_type == 2)
                {
                    number = Integer.parseInt(line_part[1]);
                    ID = Integer.parseInt(line_part[2]);
                    name = line_part[3];
                    address = line_part[4];
                    cost = Integer.parseInt(line_part[5]);
                    storey = Integer.parseInt(line_part[6]);
                    clearing = Double.parseDouble(line_part[7]);
                    houses.add(new House(number, ID, name, address, cost, storey, clearing));
                }

                else if(property_type == 3)
                {
                    number = Integer.parseInt(line_part[1]);
                    ID = Integer.parseInt(line_part[2]);
                    name = line_part[3];
                    address = line_part[4];
                    cost = Double.parseDouble(line_part[5]);
                    tax = Double.parseDouble(line_part[6]);
                    service = Double.parseDouble(line_part[7]);
                    villas.add(new Villa(number, ID, name, address, cost, tax, service));
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

    // print all information of the property and then generate a text file to record it
    public static void PrintAllProperties(String output_filename, ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas) {
        String output_information = "";

        String apartment_title = ("********************************************************Apartment Information********************************************************");
        System.out.println(apartment_title);
        for (Apartment a : apartments) {
            String apartments_information = ("Register Number:" + a.getRegister_number() + " PropertyId:"+ a.getPropertyID() +"  Owner name:" + a.getOwner_name() + "  Address: " + a.getPostal_address() + "  Cost/day(€):"
                    + a.getRental_cost_per_day() + "  Number of Storey:" + a.getStorey_number() + "  Number of Beds:"
                    + a.getNumber_of_beds());
            System.out.println(apartments_information);
            output_information += apartment_title+ "\n" + apartments_information + "\n";
        }
        System.out.println();

        String house_title = ("********************************************************House Information********************************************************");
        System.out.println(house_title);
        for (House h : houses) {
            String houses_information = ("Register Number:" + h.getRegister_number() + " PropertyId:"+ h.getPropertyID() + "  Owner name:" + h.getOwner_name() + "  Address: " + h.getPostal_address() + "  Cost/day(€):"
                    + h.getRental_cost_per_day() + "  Number of Storey:" + h.getNumber_of_storeys() + "  Clearing Fees:"
                    + h.getClearing_fees());
            System.out.println(houses_information);
            output_information += house_title + "\n"+ houses_information + "\n";
        }
        System.out.println();

        String villas_title = ("***********************************************************Villa Information***********************************************************");
        System.out.println(villas_title);
        for (Villa v : villas) {
            String villas_information = ("Register Number:" + v.getRegister_number() + " PropertyId:"+ v.getPropertyID() + "  Owner name:" + v.getOwner_name() + "  Address: " + v.getPostal_address() + "  Cost/day(€):"
                    + v.getRental_cost_per_day() + "  Luxury Tax/day:" + v.getLuxury_tax_per_day() + "  Room Service/day:"
                    + v.getRoom_service_cost_per_day());
            System.out.println(villas_information);
            output_information += villas_title + "\n" + villas_information + "\n";
        }
        System.out.println();

        try{
            PrintWriter myOutFile = new PrintWriter(output_filename);
            myOutFile.write(output_information);
            myOutFile.close();
        }
        catch(Exception ex){
            System.out.println("exception" +ex.getMessage()+"caught");
        }
    }

    //Design a frame which user can insert propertyID and the Rental days
    public static void GiveRentalProperty(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas)
    {
        //Generate visualisation
        JFrame frame = new JFrame();

        //The label for displaying PropertyID
        final JLabel propertyID_label = new JLabel("PropertyID");

        //Text for PropertyID
        JTextField propertyID_text = new JTextField();
        propertyID_text.setColumns(5);

        //The label for displaying Rental Days
        final JLabel rental_days_label = new JLabel("Rental Days");

        //Text for Rental Days
        JTextField rental_days_text = new JTextField();
        rental_days_text.setColumns(5);

        //The button to trigger the ok
        JButton ok_button = new JButton("OK");

        //The button to trigger the cancel
        JButton cancel_button = new JButton("Cancel");

        //The panel that holds the user interface components
        JPanel panel = new JPanel();
        panel.add(propertyID_label);
        panel.add(propertyID_text);
        panel.add(rental_days_label);
        panel.add(rental_days_text);
        panel.add(ok_button);
        panel.add(cancel_button);
        frame.add(panel);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // search propertyID in three ArrayList, if exist, do something. if not exit, return error information
        class AddOKListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event) {
                String pro_id = propertyID_text.getText();
                String days = rental_days_text.getText();

                // To check whether user has already input propertyID and rental days
                if ("".equals(pro_id) && "".equals(days)|| "".equals(pro_id) || "".equals(days)) {
                    System.out.println("Attention: you must input PropertyID and Rental Days");
                }
                else {
                    int pro_id_con = Integer.parseInt(pro_id);
                    int days_con = Integer.parseInt(days);

                    //check apartment list
                    for (int i = 0; i < apartments.size(); i++) {
                        if (pro_id_con == apartments.get(i).getPropertyID()) {
                            System.out.println("This apartment ID is " + pro_id_con);
                            apartments.get(i).RentAnItem(days_con);
                            System.out.println("The Total day you want to rent this apartment is " + apartments.get(i).getTotal_rental_days());
                            break;
                        }
                        else {
                            System.out.println("This property is not in apartment list......");
                            break;
                        }
                    }

                    //check house list
                    for (int j = 0; j < houses.size(); j++) {
                        if (pro_id_con == houses.get(j).getPropertyID()) {
                            System.out.println("This house ID is " + pro_id_con);
                            houses.get(j).RentAnItem(days_con);
                            System.out.println("The Total day you want to rent this house is " + houses.get(j).getTotal_rental_days());
                            break;
                        }
                        else {
                            System.out.println("This property is not in house list......");
                            break;
                        }
                    }

                    //check villa list
                    for (int k = 0; k < villas.size(); k++) {
                        if (pro_id_con == villas.get(k).getPropertyID()) {
                            System.out.println("This house ID is " + pro_id_con);
                            villas.get(k).RentAnItem(days_con);
                            System.out.println("The Total day you want to rent this villa is " + villas.get(k).getTotal_rental_days());
                            break;
                        }
                        else {
                            System.out.println("This property is not in villa list......");
                            break;
                        }
                    }

                }
            }
        }

        ActionListener ok_listener = new AddOKListener();
        ok_button.addActionListener(ok_listener);

        // When click cancel button, the frame will be closed
        class AddCancelListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                frame.getDefaultCloseOperation();
                frame.dispose();
            }
        }

        ActionListener cancel_listener = new AddCancelListener();
        cancel_button.addActionListener(cancel_listener);
    }
}



