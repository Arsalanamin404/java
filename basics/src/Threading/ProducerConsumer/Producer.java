package Threading.ProducerConsumer;

public class Producer implements Runnable{
    private final Buffer buffer;

    Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void  run(){
        int data = 1;
        try {
            while (true){
                buffer.produce(data++);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
