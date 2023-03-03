package MultiThreading.BusReservationSystem.client;

import MultiThreading.BusReservationSystem.system.TicketBookingThread;
import MultiThreading.BusReservationSystem.system.TicketCounter;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"John",2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Martin",2);

        t1.start();
//        t1.join();
        t2.start();
    }
}
