import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0 && y>0){
            int a=x*y;
            System.out.println(a);
        }
        else
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
