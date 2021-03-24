
public class Calender {
	//1,3,5,7,8,10,12 31일
	//4,6,9,11 30일   
	//2월 29일
	class Solution {
	    public String solution(int a, int b) {
	        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	    	int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
	        int temp = a-1;
	        int result =0;
	        
	        for(int i=0; i<temp; i++) {
	        	result+=month[i]+(b-1);
	        }
	        String answer = week[result/7];
	        
	        return answer;
	    }
	}
}
