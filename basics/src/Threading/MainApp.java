package Threading;

class A implements Runnable {
    @Override
    public void run() {
        String current_thread_name = Thread.currentThread().getName();
        if (current_thread_name.equals("A"))
            printNumsInA();
        else
            printNumsInB();
    }

    private void printNumsInA() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". I am in A");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void printNumsInB() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". I am in B");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

//A race condition happens when:
//  Multiple threads access and modify shared data
//  at the same time and the final result depends on who runs first

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("APPLICATION STARTED");
        A obj = new A();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();

        //Main waits for both threads
        //App terminates only after both finish
        t1.join();
        t2.join();
        System.out.println("APPLICATION TERMINATED");
    }
}
