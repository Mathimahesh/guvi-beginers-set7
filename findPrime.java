import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1) System.out.println("no");
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("no");
                break;
            }
            else {
                System.out.println("yes");
                break;
        }
    }
    }
}
