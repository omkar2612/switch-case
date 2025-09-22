import java.util.Scanner;

 class code8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if(num1 > 0 && num2 > 0) {
            int result = num1 * num2;
            System.out.println("Product: " + result);
            
            // More robust switch case
            switch(result % 2) {
                case 0: 
                    System.out.println("Even"); 
                    break;
                case 1: 
                case -1: // Handle negative modulo results
                    System.out.println("Odd"); 
                    break;
            }
        } else {
            System.out.println("Sorry negative numbers are not allowed");
        }
    }
}