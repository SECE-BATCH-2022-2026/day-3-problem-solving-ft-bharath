import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char delimiter = sc.nextLine().charAt(0);
		String[] res = UserMainCode.Splitter(str,delimiter);
		for(String s: res){
			System.out.println(s);
		}
	}
}

class UserMainCode {
	public static String[] Splitter(String str , char delimiter){
		
		String[] res = str.split(""+delimiter);
		
		for(int i=0;i<res.length;i++){
			String s = res[i];
			res[i]=new StringBuilder(s).reverse().toString().toLowerCase();
		}
		
		return res;
	}
}