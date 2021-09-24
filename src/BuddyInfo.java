public class BuddyInfo {

    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;

    }

    private String name;

    public static void main(String[] args) {


        BuddyInfo buddy = new BuddyInfo("Hasbulla");

        System.out.println("Hello " + buddy.getName() + "!!");
    }
}

