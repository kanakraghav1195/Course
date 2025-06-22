package src;

public class ConsecutiveSquareSum {
    public static void main(String[] args) {
        int target = 2030;
        for (int start = 1; start <= target; start++) {
            int sum = 0;
            int num = start;

            while (sum < target) {
                sum = sum + num * num;

                if (sum == target) {
                    System.out.print("Output = ");
                    for(int i = start; i <= num; i++) {
                        System.out.print(i);
                        if (i < num) {
                            System.out.print(", ");
                        }

                    }
                    return;

                }
                num++;

            }
        }
    }
}

