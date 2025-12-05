import java.io.*;
import java.util.*;

class Program2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res=UserMainCode.calculateSum(a,b,c);
		System.out.println(res);
	}
}

class UserMainCode{
    public static int calculateSum(int a, int b, int c){
        
        Stack<Integer> st = new Stack<>();
        int[] arr = {a,b,c};
        int sum = 0;

        for(int i=0; i<3; i++){
            st.push(arr[i]);
        }

        for(int i=2; i>=0; i--){
            if(arr[i] == 13 || (i > 0 && arr[i-1] == 13)){
                st.pop();
            } else {
                sum += st.peek();
                st.pop();
            }
        }
        
        return sum;
    }   
}
