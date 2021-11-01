import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='?' || ch==',' || ch=='!'|| ch=='\'' ||ch=='@'||ch=='_'||ch=='.')
            str=str.replace(ch,' ');
        }
        StringTokenizer st=new StringTokenizer(str);
        int c=st.countTokens();
        System.out.println(c);
        while(st.hasMoreTokens())
        {
            String s1=st.nextToken();
            System.out.println(s1);

        }
    }
}
