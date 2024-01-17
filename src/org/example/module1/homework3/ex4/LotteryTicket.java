package org.example.module1.homework3.ex4;

public class LotteryTicket {
    private static int countsTickets = 0;

    public int checkLuck() {
        countsTickets++;

        if (countsTickets % 100 == 0) {
            return 5000;
        } else if (countsTickets % 10 == 0) {
            return 100;
        }
        return 0;
    }
}

