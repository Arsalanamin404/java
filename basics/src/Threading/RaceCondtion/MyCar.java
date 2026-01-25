package Threading.RaceCondtion;

class MyCar implements Runnable{
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+" entered the parking lot...");
            Thread.sleep(1500);
            synchronized (this){
                System.out.println("-".repeat(50));
                System.out.println(Thread.currentThread().getName()+" has entered into the Car");
                Thread.sleep(1500);
                System.out.println(Thread.currentThread().getName()+" has started to drive the Car");
                Thread.sleep(1500);
                System.out.println(Thread.currentThread().getName()+" has came back and parked the Car");
                Thread.sleep(1500);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}