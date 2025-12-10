import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(UserMainCode.regex(str));	
		
	}
}

class UserMainCode {
	public static boolean regex(String str){
		return str.matches("^[1-9]{2}[0-9]{8}$");
	}
}