package Utilities;

import java.util.ArrayList;

public class Utility {
	public static int convertToInt(ArrayList<Integer> values) {
		int ans = 0;
		for(int value:values) {
			ans+=1<<(value-1);
		}
		return ans;
	}
	public static ArrayList<Integer> getMarkedAnswer(int value) {
		ArrayList<Integer> answers = new ArrayList<>();
		for(int i=0;i<4;i++) {
			int k = value & (1<<i);
			if(k!=0) {
				answers.add(i+1);
			}
		}
		return answers;
	}
}
