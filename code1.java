class code1 {
    public static void main(String[] args) {
        String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("No such color is present in traffic lights.");
                break;
        }
    }
}