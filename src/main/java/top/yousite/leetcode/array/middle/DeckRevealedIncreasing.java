package java.top.yousite.leetcode.array.middle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DeckRevealedIncreasing {
    /**
     * 950. 按递增顺序显示卡牌
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            queue.offer(i);
        }
        Arrays.sort(deck);
        int[] res = new int[deck.length];
        for (int num : deck) {
            int poll = queue.poll();
            res[poll] = num;
            if (!queue.isEmpty()){
                queue.offer(queue.poll());
            }
        }
        return res;

    }
}
