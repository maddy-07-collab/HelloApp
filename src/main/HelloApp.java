public class HelloApp {
     public static void main(String[] args) {

        String name;

        // Default when no arguments
        if (args.length == 0) {
            name = "World";
        } 
        
        // Enhanced for loop + substring cleanup
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove trailing comma and space
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + name + "!");
    }
    
}