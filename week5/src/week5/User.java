package week5;

public class User {

    // Private attributes
    private int userId;
    private String name;

    // Constructor
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}