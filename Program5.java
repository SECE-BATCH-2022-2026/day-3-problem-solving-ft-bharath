import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		String[] strList = new String[n];
		
		for(int i=0;i<n;i++){
			strList[i]=br.readLine();
		}
		
		String[] out = UserMainCode.removeDuplicates(strList);
		
		for(String s: out){
			System.out.println(s+" ");
		}
		
		br.close();
	}
}

class UserMainCode{
    public static String [] removeDuplicates (String [] strList){
    		
    		Set<String> ts = new TreeSet<String>();
    		for(String s: strList){
    			ts.add(s);
    		}
    		
    		String[] res = new String[ts.size()];
    		int idx = 0;
    		for(String s:ts){
    			res[idx++]=s;
    		}
    		return res;
   }
}
