public class FootballStadium {
    private static String stadiumName;
    private static int capacity;

    
    static {
        stadiumName = "Example Stadium";
        capacity = 50000;
    }

    
    public static void displayStadiumInfo() {
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Capacity: " + capacity);
    }

   
    public static void performActionWithStadium() {
        
        displayStadiumInfo();
       
        System.out.println("Performing action with the stadium...");
    }
}

