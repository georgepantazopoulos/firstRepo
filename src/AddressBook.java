import javax.swing.*;
import java.util.ArrayList;

public class AddressBook extends DefaultListModel {
    ArrayList<BuddyInfo> addresses;

    public AddressBook() {
        this.addresses = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        super.addElement(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        super.removeElement(buddy);
    }

    public static void main(String[] args) {

        GUI gui = new GUI();
    }



}
