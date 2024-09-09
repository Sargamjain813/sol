//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int n = str.length();
        char[] charArray = str.toCharArray();
        for(int i =0; i<n/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[n-i-1];
            charArray[n-i-1]=temp;
            
        }
        return new String(charArray);
    }
}