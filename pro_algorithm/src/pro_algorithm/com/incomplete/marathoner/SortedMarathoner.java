package pro_algorithm.com.incomplete.marathoner;

import java.util.Arrays;

public class SortedMarathoner {
	
	public static void main(String[] args) {
		String answer = "";
		String[] participant = {"mislav","stanko","mislav","ana"};
		String[] completion = {"stanko","ana","mislav"};
		
//			int i;
//			int j;
//			for(i = 0; i < participant.length; i++) {
//				for(j=0; j < completion.length; j++) {
//					if(participant[i].equals(completion[j])) {
//						participant[i] = "";
//						completion[j] = "";
//						break;
//					}
//				}
//			}
//			for(i=0; i < participant.length; i++) {
//				System.out.print(participant[i]);
//			}
		int i;
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(i=0; i < participant.length; i++) {
			if(!participant[i].equals(completion[i])) {
				break;
			}
		}
		
		System.out.println(participant[i]);
	}
}
