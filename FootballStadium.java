public class FootballStadium {// Static variables
    private static String stadiumName;
    private static int capacity;

    // Static block for initialization
    static {
        stadiumName = "Example Stadium";
        capacity = 50000;
    }

    // Static method 1
    public static void displayStadiumInfo() {
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Capacity: " + capacity);
    }

    // Static method 2
    public static void performActionWithStadium() {
        // Calling static method 1
        displayStadiumInfo();
        // Perform additional actions
        System.out.println("Performing action with the stadium...");
    }
}

