package main.problems;

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int time = 0;

        while (tickets[k] != 0)  {
            for (int j = 0; j < tickets.length && tickets[k] != 0; j++) {
                if (tickets[j] != 0) {
                    tickets[j] -= 1;
                    time += 1;
                }
            }
        }
        return time;
    }
}
