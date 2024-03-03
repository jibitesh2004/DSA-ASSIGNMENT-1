import java.util.Scanner;

public class Q7 {
    public static int max(int marks[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }

        }
        return max;

    }

    public static int min(int marks[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];
            }

        }
        return min;

    }

    public static void co(int marks[]) {
        int d = min(marks);
        int e = max(marks);
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == d) {
                count1++;
            } else if (marks[i] == e) {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);

    }

    public static void occurence(int marks[]) {
        int d = min(marks);
        int e = max(marks);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == e) {
                System.out.println(i + 1);
                break;

            }

        }
        for (int i = marks.length - 1; i > 0; i--) {
            if (marks[i] == d) {
                System.out.println(i + 1);
                break;

            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        System.out.println("Enter elements of the array:");
        int marks[] = new int[a];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        int b = max(marks);
        System.out.println(b);
        int c = min(marks);
        System.out.println(c);
        co(marks);

        occurence(marks);

    }

}
