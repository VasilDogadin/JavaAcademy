package org.example.module1.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        int countTicket = 110;
        LotteryTicket[] lotteryTickets = new LotteryTicket[countTicket];

        for (int i = 0; i < countTicket; i++) {
            lotteryTickets[i] = new LotteryTicket();
        }

        int sum = 0;
        for (LotteryTicket lotteryTicket : lotteryTickets) {
            sum += lotteryTicket.checkLuck();
        }
        System.out.println("Выигрыш составил: " + sum);
    }
}