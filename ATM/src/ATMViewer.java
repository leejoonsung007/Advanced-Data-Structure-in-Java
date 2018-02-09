import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ATMViewer {
    public static void main(String[] args)
    {
        ATM theATM;

        try
        {
            Bank theBank = new Bank();
            theBank.readCustomers("customers.txt");
            theATM = new ATM(theBank);
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"error opening accounts file");
            return;
        }
        JFrame frame = new ATMFrame(theATM);
        frame.setTitle("First National Bank of Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
