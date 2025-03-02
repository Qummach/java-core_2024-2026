package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во кандидатов: ");
        int numberOfCandidate = scanner.nextInt();
        System.out.print("Введите кол-во избирателей: ");
        int numberOfVoters = scanner.nextInt();

        int[] votes = new int[numberOfCandidate];

        System.out.println("Введите голос " + numberOfVoters + " избирателей");
        for (int i = 0; i < numberOfVoters; i++) {
            int candidate = scanner.nextInt();
            votes[candidate - 1]++;
        }
        scanner.close();

        for (int i = 0; i < numberOfCandidate; i++) {
            double candidateVotePercentage = (votes[i] * 100.0) / numberOfVoters;
            System.out.printf("Процент голосов за " + (i + 1) + " кандидата = " + "%.2f%%\n", candidateVotePercentage);
        }
    }
}
