import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLine();
			arr[i]=arr[i].toLowerCase();
		}
		
		String[] res = UserMainCode.sortString(arr);
		
		for(String s : res){
			System.out.println(s);
		}
	}	
}

class UserMainCode {
	public static String[] sortString(String[] str){
		
		Arrays.sort(str);
		return str;
		
	
	}
}