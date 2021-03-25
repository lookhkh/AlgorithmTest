import java.util.*;

public class CharInArray {
	public static void main(String[] args) {
	String[] a = {"bion", "diger","cabbit","ainsu","zunny","bun"};
	Solution b = new Solution();
System.out.println(b.solution(a, 0).toString());
}
}
	
	
	
	
	

class Solution {
    public ArrayList solution(String[] strings, int n) {
        ArrayList<String> temp = new ArrayList<String>();
        for (String i : strings) temp.add(i);
    	
       for (int i=0; i<temp.size()-1; i++) {
    	   for(int j=temp.size()-1; j>0; j--) {
    		   String bin = "";
    		   if(temp.get(j).charAt(n)>temp.get(j-1).charAt(n)) {
    			   continue;
    		   }
    		   else if(temp.get(j).charAt(n)<temp.get(j-1).charAt(n)) {
    			   bin = temp.get(j-1);
    			   temp.set(j-1, temp.get(j));
    			   temp.set(j, bin);
    		   }
    		   else {
    			   if(temp.get(j).compareTo(temp.get(j-1))>0) {
    				   continue;
    			   }
    			   else {
    				   bin = temp.get(j-1);
        			   temp.set(j-1, temp.get(j));
        			   temp.set(j, bin);
    			   }
    		   }
    	   }
       }return temp;
}
}