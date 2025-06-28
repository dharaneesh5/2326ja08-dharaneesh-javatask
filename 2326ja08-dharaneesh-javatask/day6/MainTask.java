class MainTask {
    private int tickets = 5;

    public synchronized void bookTicket(String name, int wanted) {
        if (tickets >= wanted) {
            System.out.println(name + " booked " + wanted + " ticket(s).");
            tickets -= wanted;
        } else {
            System.out.println(name + " tried to book " + wanted + " ticket(s), but only " + tickets + " left.");
        }
    }
}
class BookingThread extends Thread {
    Ticket counter;
    int wanted;
    String name;
    public BookingThread(Ticket counter, String name, int wanted) {
        this.counter = counter;
        this.name = name;
        this.wanted = wanted;
    }
    public void run() {
        counter.bookTicket(name, wanted);
    }
    public static void main(String[] args) {
        Ticket counter = new Ticket();
        BookingThread t1 = new BookingThread(counter, "Alice", 2);
        BookingThread t2 = new BookingThread(counter, "Bob", 3);
        BookingThread t3 = new BookingThread(counter, "Charlie", 1);
        t1.start();
        t2.start();
        t3.start();
    }
}