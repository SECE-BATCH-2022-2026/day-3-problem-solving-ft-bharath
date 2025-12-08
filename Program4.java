import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();                  
		String str = sc.nextLine();      
		
		System.out.println(UserMainCode.repeatFront(str,n));
	}
}

class UserMainCode{
    
    public static String repeatFront(String str,int n){
    	
    	if(str.length() == 0) return "";   
    	
    	String repString;
    	if(str.length() < 3){
    		repString = str.substring(0, str.length());
    	}     	
    	else{
    		repString = str.substring(0, 3);
    	}
    	
    	String result = "";
    	for(int i = 0; i < n; i++){
    		result += repString;
    	}

    	return result;
    }
}
