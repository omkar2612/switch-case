class code4 {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 2;
        char operator = '*'; 
        
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                System.out.println((int) num1 % (int) num2);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}