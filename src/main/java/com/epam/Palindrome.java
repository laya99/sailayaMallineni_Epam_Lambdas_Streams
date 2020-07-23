import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
@FunctionalInterface
interface Operations{
	public boolean palindrome(String s);
}   

class MathUtility{
	public static boolean isPalindrome(String s) {
        String t = s.replaceAll("\\s+", "").toLowerCase();;
        return IntStream.range(0, t.length() / 2).noneMatch(i -> t.charAt(i) != t.charAt(t.length() - i - 1));
    }
}

public class Palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    System.out.println("numbber of strings");
	    int n=sc.nextInt();
	    String[] sarray=new String[n];
	    for(int i=0;i<n;i++){
	        System.out.println("enter string "+(i+1));
	        sarray[i]=sc.next();
	    }
        List<String> list = new ArrayList<>(sarray.length);
        for(String s:sarray){
            list.add(String.valueOf(s));
            Operations operation = (i)->MathUtility.isPalindrome(i);
            if (operation.palindrome(s)){
                System.out.print(Stream.of(s).collect(Collectors.toList()));
            }
        }
	}
}