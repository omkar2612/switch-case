class code2 {
    public static void main(String[] args) {
        char grade = 'O'; 
        switch (grade) {
            case 'O':
                System.out.println("Outstanding");
                break;
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Satisfactory");
                break;
            case 'E':
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
    }
}