import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(UserMainCode.countVowels(str));
}
}

class UserMainCode {
	public static int countVowels(String str){
		
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				count++;
			}
		}
		
		return count;
		
	}
}