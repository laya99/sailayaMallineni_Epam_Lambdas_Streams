import java.util.*;
public class Average {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("no. of integers");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("elements:");
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        List<Integer> l = new ArrayList<>(a.length);
		for (int i : a){
			l.add(Integer.valueOf(i));
		}
    	IntSummaryStatistics avg = list.stream().mapToInt((numbers) -> numbers).summaryStatistics();
        System.out.println("Average is" + avg.getAverage());
    }
}
