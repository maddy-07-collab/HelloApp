public class HelloApp {    public static void main(String[] args) {

        String names = "World";

        // If arguments exist, join them
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
    
}