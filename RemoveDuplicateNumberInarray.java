import java.util.*;
public class RemoveDuplicateNumberInarray{
	public static void main(String[] args) {
		RemoveDuplicateNumberInarray_ a=new RemoveDuplicateNumberInarray_();
        LinkedList<Integer> test = new LinkedList<Integer>();
        int[] test_ = {0,1,1,1,2,1,3,3,3};
        for(int z : test_) test.add(z);
       System.out.println(a.solution(test_));
	}
}

 class RemoveDuplicateNumberInarray_ {
	public LinkedList<Integer> solution(int []arr) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        int pointer=0;
        for (int i=0; i<arr.length-1;i++) {
        	if(arr[i]==arr[i+1]) {
        		pointer=i+1;
        		while(pointer<arr.length-1) {
        			if(arr[i]==arr[pointer]) pointer++;
        			else i=pointer;
        		}
        	temp.add(arr[pointer]);
        	}
        }return temp;
	}
 }