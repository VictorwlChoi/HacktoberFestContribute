import java.util.Scanner;

public class max_pair_sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
			if (max <= arr[i]) {
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax) {
				smax = arr[i];
			}
		}
		int ans = max + smax;
		System.out.println("Max sum is :" + ans);
	}
}
