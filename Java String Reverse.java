import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String str="";
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            str=ch+str;
        }
        if(A.equalsIgnoreCase(str))
        System.out.println("Yes");
        else
        System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
