public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
            .setFirstName("John")
            .setLastName("Doe")
            .setEmail("john.doe@example.com")
            .setAge(30)
            .build();

        user.setAddress("123 Main St");
        user.setPhone("+1 555-123-4567");
    }
}
