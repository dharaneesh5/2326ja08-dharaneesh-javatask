class Message implements Runnable {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MessagePrinter());
        Thread t2 = new Thread(new MessagePrinter());
        t1.start();
        t2.start();
    }
}