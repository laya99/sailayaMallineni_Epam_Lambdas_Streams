import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StartingWitha {
    public static void main( String[] args ){
    	Scanner sc=new Scanner(System.in);
	    System.out.println("length");
	    int n=sc.nextInt();
	    String[] sarray=new String[n];
	    for(int i=0;i<n;i++){
	        System.out.println("enter the "+(i+1)+" String :");
	        sarray[i]=sc.next();
	    }
        List<String> list = new ArrayList<>(sarray.length);
        for(String s:sarray){
            list.add(String.valueOf(s));
        }
        System.out.println(Stream.of(sarray).filter(str -> str.startsWith("a")).filter(str -> str.length() == 3).collect(Collectors.toList()));
    }
}
