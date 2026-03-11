public class HelloAppUC4 {
    public static void main(String[] args) {
        // Check if the array is empty
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            StringBuilder nameBuilder = new StringBuilder("Hello ");
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add comma and space only if there is another name coming up
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            
            System.out.println(nameBuilder.toString());
        }
    }
}