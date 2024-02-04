package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder("Zaki", "Dasalla", "zaki.dasalla@neu.edu.ph")
                .build();
    
        User user2 = new User.Builder("Meldrick", "Carabeo", "meldrick.carabeo@neu.edu.ph")
                .address("Block 3 Lot 36, Villa Zargosa, Baranggay Turo, Bocaue, Bulacan")
                .phone("09989922471")
                .age(20)
                .build();
    
        printUserInfo(user1);
        printUserInfo(user2);
    }
    
    private static void printUserInfo(User user) {
        System.out.println("User Information:");
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + (user.address != null ? user.address : "N/A"));
        System.out.println("Phone: " + (user.phone != null ? user.phone : "N/A"));
        System.out.println("Age: " + (user.age != 0 ? user.age : "N/A"));
        System.out.println();
    }
}
