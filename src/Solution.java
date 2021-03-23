import java.util.ArrayList;



public class Solution {
	 public ArrayList<Integer> solution(int[] array, int[][] commands) {
	 ArrayList<Integer> modifier = new ArrayList<Integer>();
	 ArrayList<Integer> modified = new ArrayList<Integer>();
	 for (int i=0; i<array.length; i++) modifier.add(array[i]);
	 for(int i=0; i<commands.length; i++) {
		 modifier.subList(commands[i][0]-1, commands[i][1]).stream().sorted();
		 int temp = modifier.get(commands[i][2]-1);
		 modified.add(temp);
		 
	 }

	        return modified;
	    }
	}
