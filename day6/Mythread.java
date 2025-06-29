class Mythread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t1.join();  
        t2.start(); 
    }
}