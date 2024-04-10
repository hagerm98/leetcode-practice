package main.problems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {

        int[] result = new int[deck.length];
        Queue<Integer> queue = new ArrayDeque<>();

        Arrays.sort(deck);

        queue.add(deck[deck.length - 1]);

        for (int i = deck.length - 2; i >= 0; i--) {
            queue.add(queue.remove());
            queue.add(deck[i]);
        }

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = queue.remove();
        }

        return result;
    }
}