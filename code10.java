import java.util.Scanner;

 class code10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your day plan:");
        System.out.println("1. Workday");
        System.out.println("2. Weekend");
        System.out.println("3. Vacation");
        System.out.println("4. Sick Day");
        System.out.println("5. Holiday");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Wake up at 6 AM, work from 9 AM to 5 PM");
                break;
            case 2:
                System.out.println("Sleep in, relax, pursue hobbies");
                break;
            case 3:
                System.out.println("Travel, explore new places, enjoy free time");
                break;
            case 4:
                System.out.println("Rest, take medication, visit doctor if needed");
                break;
            case 5:
                System.out.println("Celebrate with family and friends");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}