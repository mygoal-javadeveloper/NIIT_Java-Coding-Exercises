package codings;

import java.util.*;
public class PalindromeWord
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the word to be checked.");
        String s=ob.next();

        String rev="";
        for(int i=0;i<s.length(); i++)//Loop for reversing the string.
        {
            char x=s.charAt(i);
            rev=x+rev;
        }
        if(rev.equalsIgnoreCase(s))
        {
            System.out.println(s+" is a Palindrome Word.");
        }
        else
        {
            System.out.println(s+" is not a Palindrome Word.");
        }
    }
}