import java.io.*;
import java.util.*;
class Program1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int count = UserMainCode.countOccurances(str1,str2);
		System.out.print(count);
		

	}
}

class UserMainCode{
	public static int countOccurances(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int count = 0 ;
        
		for(int i=0;i<=len1-len2;i++){
			if(str1.substring(i,i+len2).equals(str2)){
				count++;	
			}
		}	
		return count;
	}
}