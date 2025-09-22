public class code6 {
    public static void main(String[] args) {
        int num = 3;
        
        if(num > 5) {
            System.out.print(num + " is greater than 5");
        } else {
            switch(num) {
                case 0: System.out.print("Zero"); break;
                case 1: System.out.print("One"); break;
                case 2: System.out.print("Two"); break;
                case 3: System.out.print("Three"); break;
                case 4: System.out.print("Four"); break;
                case 5: System.out.print("Five"); break;
                default: System.out.print("Invalid input");
            }
        }
    }
}