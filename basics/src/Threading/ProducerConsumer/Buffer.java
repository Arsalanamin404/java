package Threading.ProducerConsumer;

public class Buffer {
    private int data;
    private boolean hasData = false;

    // producer calls this
    public synchronized void produce(int data) {
        try {
            if (hasData) {
//                System.out.println("PRODUCER IN WAITING STATE...");
                wait();
            } else {
                this.data = data;
                hasData = true;
                System.out.println("Producer produced: " + data);

                notify(); //notify the consumer
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // consumer call this
    public synchronized void consume() {
        try {
            if (!hasData) {
//                System.out.println("CONSUMER IN WAITING STATE...");
                wait(); //wait if buffer is empty
            } else {
                int consumedData = data;
                hasData = false;
                System.out.println("Consumer consumed: " + consumedData);

                notify(); //notify the producer
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
