public class BuddyInfo {

    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;

    }

    public void printName() {

        System.out.println(this.name);
    }

    private String name;

    public static void main(String[] args) {


        BuddyInfo buddy = new BuddyInfo("Hasbulla");

        System.out.println("Hello " + buddy.getName() + "!!");
    }
}

//CHANGE TO SEE IF IT UPDATES IN GITHUB REPO.
