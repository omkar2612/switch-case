public class code7 {
    public static void main(String[] args) {
        String plan = "Silver";
        
        switch(plan.toLowerCase()) {
            case "platinum": 
                System.out.print("For the Platinum plan, the price is ₹799");
                break;
            case "gold": 
                System.out.print("For the Gold plan, the price is ₹599");
                break;
            case "silver": 
                System.out.print("For the Silver plan, the price is ₹399");
                break;
            case "bronze": 
                System.out.print("For the Bronze plan, the price is ₹199");
                break;
            case "free": 
                System.out.print("For less than ₹199, the platform is free with limited access");
                break;
            default: 
                System.out.print("Invalid Input");
        }
    }
}