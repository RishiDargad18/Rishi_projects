package rishicodes;
import java.util.Scanner;
public class birthday {
    static void Wishes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! A Very Happy Birthday!\nWishing you all the prosperity and happiness in life. This is my gift. I hope you enjoy.\nPress Enter to begin.");
        sc.nextLine();
        Song();
    }

    static void Song() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Okay, so let's begin traditionally.\nHappy Birthday to You\nHappy Birthday to You\nHappy Birthday Dear\nHappy Birthday to You.\nMay good luck go with you,\nAnd happiness too.\nHappy Birthday to You.");
        System.out.println("Press Enter.");
        sc.nextLine();
        pattern();
    }

    static void pattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So....Which birthday is this?");
        String age = sc.nextLine();
        System.out.println("Great\nHere is a pattern for you. Press Enter.");
        sc.nextLine();

        final String message = " Happy " + age + "th Birthday ";
        final int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 4 * n; j++) {
                double d1 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - n, 2));
                double d2 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - 3 * n, 2));

                if (d1 < n + 0.5 || d2 < n + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 1; i < 2 * n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * n + 1 - 2 * i; j++) {
                if (i >= 2 && i <= 4) {
                    int idx = j - (4 * n - 2 * i - message.length()) / 2;
                    if (idx < message.length() && idx >= 0) {
                        if (i == 3) {
                            System.out.print(message.charAt(idx));
                        } else {
                            System.out.print(' ');
                        }
                    } else {
                        System.out.print('*');
                    }
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        System.out.println("So that's it. Hope you liked it.\nWith love,\nYour friend,\n");
    }

    public static void main(String[] args) {
        Wishes();
    }
}
