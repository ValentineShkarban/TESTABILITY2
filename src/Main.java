public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 75;
        double heightInMeters = 1.75;
        int index = service.calculate(weightInKg, heightInMeters);
        System.out.println(index);
    }
}