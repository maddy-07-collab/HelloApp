public class HelloApp {
     public static void main(String[] args) {

        String name = "";

        // Default if no arguments
        if (args.length == 0) {
            name = "World";
        } 
        
        // Enhanced for loop for multiple names
        else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String n : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(n);
                first = false;
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
    
}