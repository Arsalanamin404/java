package Threading.ProducerConsumer;

public class Consumer implements Runnable{
    private final Buffer buffer;

    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void  run(){
        try {
            while (true){
                buffer.consume();
                System.out.println("-".repeat(30));
                Thread.sleep(1500);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
