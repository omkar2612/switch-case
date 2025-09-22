import java.util.Scanner;

class code9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passingMarks = 35;
        int total = 0;
        boolean failed = false;
        
        System.out.println("Enter marks for 5 subjects:");
        for(int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            if(marks < passingMarks) {
                failed = true;
            }
            total += marks;
        }
        
        if(failed) {
            System.out.println("You failed the exam");
        } else {
            double percentage = total / 5.0;
            
            switch((int)percentage / 10) {
                case 10:
                case 9:
                case 8: System.out.println("First Class with Distinction"); break;
                case 7: System.out.println("First Class"); break;
                case 6: System.out.println("Second Class"); break;
                default: System.out.println("Pass");
            }
        }
    }
}