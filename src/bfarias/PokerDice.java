package bfarias;

public class PokerDice {

	public static void main(String[] args) {
		
		System.out.println("Poker Dice Probability Calculator - B. Farias\n");
		
		int num = 1000000;
		System.out.println("Running " + num + " trials\n");
		Die[] dice = new Die[5];
		int[] totalOfThings = new int [7];
	for (int x= 0; x < totalOfThings.length; x++)
	{
	totalOfThings[x] = 0;
	}
	for(int x = 0; x < dice.length; x++)
	{
		dice[x] = new Die();
	}
	for (int j = 0; j < num; j++)
	{
		for (int i = 0; i < dice.length; i++)
		{
		dice[i].roll();
		}
		totalOfThings [evaluate(dice)]++;
	}
	double[] probs = new double[7]; 
			for (int y = 0; y < 7; y++)
			{
			probs[y] = (double) totalOfThings[y]/num;
	}
			System.out.println("Case 1: Non-Alike is " + probs[0]);
			System.out.println("Case 2: One pair is " + probs[1]);
			System.out.println("Case 3: Two pair is " + probs[2]);
			System.out.println("Case 4: Three of a kind is " + probs[3]);
			System.out.println("Case 5: Full house is " + probs[4]);
			System.out.println("Case 6: Five of a kind is " + probs[5]);
			System.out.println("Case 7: Five of a kind is " + probs[6]);
	}
	
	public static int evaluate(Die[] x) {
		int [] s = dieVal(x);
		for (int k = 0; k < 6; k++)
		{
			if (s[k] == 5)
			{
				return 6;
			}
			if (s[k] == 4)
			{
				return 5;
			}
		}
		
	
		for(int p = 0; p < 6; p++) 
		{
			if (s[p] ==3) {
					
			for (int j = 0; j < 6; j++)
			{
				if (s[j] ==2)
				{
					return 4;
				}
		}
		return 3;
	}
	}
	for (int p = 0; p < 6; p++) 
	{
		if (s[p] == 2)
		{
			for (int j = p + 1; j < 6; j++)
			{
				if (s[j] ==2)
				{
					return 2;
				}
			}
			return 1;
		}
		
	}
	return 0;
	}
	
	public static int[] dieVal(Die[] x) {
		int[] pos = new int[6];
		for (int i = 0; i < pos.length; i++)
		{
			
	
	pos[i] = 0;
	}

	for (int j = 0; j < x.length; j++) {
		switch (x[j].getValue())
		{
		case 1: pos[0]++;
		break;
		case 2: pos[1]++;
		break;
		case 3: pos[2]++;
		break;
		case 4: pos[3]++;
		break;
		case 5: pos[4]++;
		break;
		case 6: pos[5]++;
		break;
		
		}
	}
	return pos;
	

}
}
