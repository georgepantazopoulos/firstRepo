public class BuddyInfo {

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void printName() {
        System.out.println(this.name);
    }
    public String toString() {
        String str = this.getName() + " - " + this.getAddress() + " - " + this.getPhoneNumber();
        return str;
    }


    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
    }
}

//CHANGE TO SEE IF IT UPDATES IN GITHUB REPO.
