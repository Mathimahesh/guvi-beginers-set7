import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0,count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' || s.charAt(i)=='1') count++;
            else count1++;
        }
        if(count1==0) System.out.println("yes");
        else System.out.println("no");
        
    }
}
