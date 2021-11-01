import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int n=sc.nextInt();
        String arr[]= new String[(S.length()*n)];
        int k=0;
        for(int i=0;i<=S.length()-n;i++){
            String s1=S.substring(i,i+n);
            arr[k++]=s1;
        }
        String temp="";
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr[0]+"\n"+arr[k-1]);  
    }
}
