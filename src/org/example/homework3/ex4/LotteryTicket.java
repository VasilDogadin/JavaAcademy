package org.example.homework3.ex4;

public class LotteryTicket {

    public void checkLuck() {
        int totalWinnings = 0;
        int[] tickets = new int[100];

        for (int i = 1; i <= tickets.length; i++) {
            if (i % 100 == 0) {
                totalWinnings += 5000;
            } else if (i % 10 == 0) {
                totalWinnings += 100;
            } else {
                totalWinnings += 0;
            }
        }
        System.out.println("Общий выигрыш: " + totalWinnings + " рублей.");
    }
}