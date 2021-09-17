import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> addresses;

    public AddressBook() {
        this.addresses = new ArrayList<BuddyInfo>();
    }

    public String addBuddy(BuddyInfo buddy){
        this.addresses.add(buddy);
        return("Buddy Added");
    }

    public String removeBuddy(BuddyInfo buddy){
        for(BuddyInfo b: this.addresses){
            if (b.getName() == buddy.getName()){
                this.addresses.remove(b);
                return("Buddy Removed");
            }
        }
        return("Buddy is not in Address Book");
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("johnny");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }



}
