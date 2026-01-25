package Threading.RaceCondtion;


public class LaunchRaceCondition1 {
    public static void main(String[] args) {
        try {
            MyCar common_car = new MyCar();

            Thread t1 = new Thread(common_car);
            Thread t2 = new Thread(common_car);
            Thread t3 = new Thread(common_car);

            System.out.println("APPLICATION STARTED");

            t1.setName("Jethalal");
            t2.setName("Beday");
            t3.setName("PopatLal");

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();
            System.out.println("\nAPPLICATION TERMINATED");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
