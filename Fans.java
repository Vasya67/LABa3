public class Fans { private final String fan1 = "John";
    private final String fan2 = "Emily";
    private final String fan3 = "Michael";

    public void useFinalVariables() {
        System.out.println("The first fan is: " + fan1);
        System.out.println("The second fan is: " + fan2);
        System.out.println("The third fan is: " + fan3);
    }

    public void useLocalFinalVariables() {
        final int age1 = 25;
        final int age2 = 30;
        final int age3 = 35;

        System.out.println("The age of the first fan is: " + age1);
        System.out.println("The age of the second fan is: " + age2);
        System.out.println("The age of the third fan is: " + age3);
    }
}
