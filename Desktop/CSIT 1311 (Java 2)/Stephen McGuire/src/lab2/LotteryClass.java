/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
import java.util.Random;
/**
 *
 * @author Stephen
 */
public class LotteryClass {
    
    private int[] lotteryNumberArray;
    
    public LotteryClass() {
        Random rand = new Random();
        lotteryNumberArray = new int[5];
        
        for (int i = 0; i < lotteryNumberArray.length; i++) {
             lotteryNumberArray[i] = rand.nextInt(10);
        }
    }
    
    public int compareArray(int[] userAnswers) {
        int matching = 0;
	if (userAnswers.length == lotteryNumberArray.length -1) {
            for (int i = 0; i < lotteryNumberArray.length; i++) {
		for(int j = 0; j < lotteryNumberArray.length; i++) {
                    if (userAnswers[i] == lotteryNumberArray[j]) {
			matching++;
                    	break;
                    }
		}
	}
}
	return matching;
    }
    
    public int[] getLotteryNumberArray() {
        return lotteryNumberArray;
    }
    
    
    
}
