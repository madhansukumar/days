import java.io.*;
import java.util.*;
public class number
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int a;
    a=s.nextInt();
    if(a>0)
    {
      System.out.print("positive number");
    }
    else if(a==0)
    {
      System.out.print("zero");
    }
    else
    {
      System.out.print("negative");
    }
   }
 }  
