import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(UserMainCode.matchPattern(str));
	}
}

class UserMainCode{
    public static boolean matchPattern (String str){
    			return str.matches("CPT-\\d{6}");
   }
}
