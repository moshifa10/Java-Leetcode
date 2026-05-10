package practice.majozi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodewarsStyleRankingSystem {

    public int rank;
    public int progress;
    private static final int[] RANKS = {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};
    private static final int MAX_RANK = 8;

    public CodewarsStyleRankingSystem() {
        this.rank = -8;
        this.progress = 0;
    }

    public void incProgress(int taskRank) {
        int userRankIndex = getRankIndex(this.rank);
        int taskRankIndex = getRankIndex(taskRank);

        if (this.rank == MAX_RANK) return;

        int d = taskRankIndex - userRankIndex;

        if (d == 0) {
            this.progress += 3;
        } else if (d == -1) {
            this.progress += 1;
        } else if (d > 0) {
            this.progress += 10 * d * d;
        }
        updateRankAndProgress();
    }

    private void updateRankAndProgress() {
        while (this.progress >= 100 && this.rank < MAX_RANK) {
            int currentIdx = getRankIndex(this.rank);
            this.rank = RANKS[currentIdx + 1];
            this.progress -= 100;
        }
        if (this.rank == MAX_RANK) {
            this.progress = 0;
        }
    }

    private int getRankIndex(int rank) {
        for (int i = 0; i < RANKS.length; i++) {
            if (RANKS[i] == rank) return i;
        }
        throw new IllegalArgumentException("Invalid rank provided");
    }

    public static void main(String[] args) {
        CodewarsStyleRankingSystem user = new CodewarsStyleRankingSystem();

        System.out.println("Initial Rank: " + user.rank);         // -8
        System.out.println("Initial Progress: " + user.progress); // 0

        user.incProgress(-7);
        System.out.println("Progress after -7: " + user.progress); // 10

        user.incProgress(-5);
        System.out.println("Rank after -5: " + user.rank);         // -7
        System.out.println("Progress after -5: " + user.progress); // 0

        // Testing the bridge between -1 and 1
        CodewarsStyleRankingSystem bridgeUser = new CodewarsStyleRankingSystem();
        bridgeUser.rank = -1;
        bridgeUser.incProgress(1);
        System.out.println("Rank after completing 1 while at -1: " + bridgeUser.rank); // Should be 1
    }
}