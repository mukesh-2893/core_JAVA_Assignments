package Assignments;

import java.io.*;
public class Q63 {
	public static void main(String[] args) throws IOException {
		FileOutputStream f1=new FileOutputStream("E:\\cdacOficial\\corejava\\file1.txt");
		 String s=" Hi This is demo of FileOutputStream:\n ";

		 for(int i=0;i<s.length();i++)
		 {
			 f1.write(s.charAt(i));
			 
		 }
         f1.close();
         System.out.println("Success");
         int ch=-1;
         int count=0;
         FileInputStream f2=new FileInputStream("E:\\cdacOficial\\corejava\\file2.txt");
         {
        	 while((ch=f2.read()) != -1)
            {
	           System.out.print((char)ch);
	           char ch1=(char)ch;
	           if(ch1=='t')
	           {
	        	   count++;
	           }
            }
        	
         }
         System.out.println(count);
         f2.close();
	}

}

