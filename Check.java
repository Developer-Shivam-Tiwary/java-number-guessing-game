class Check{
 	static int attempt=0;
	static int digitCount(int num){
		int count=0;
		while(num != 0){
			num=num/10;
			count++;
		}return count;
	}

//checking input
	static boolean checkingInput(int number, int num){
		attempt++;
		if(num>number){
			System.out.println("* Nice Try but, The number is Bigger Try again.....");
			return false;
		}else if(num<number){
			System.out.println("* Nice Try but, The number is Smaller Try again.....");
			return false;
		}else{
			System.out.println("* Nice You Got it !!!!");
			System.out.println("* Number of Attempts: "+attempt);
			return true;
		}
	}

	//range finding
	static int rangeFindMin(int count){
			 int min=(int)Math.pow(10,count-1);
			 return min;
	}
   	static int rangeFindMax(int count){
		int max=(int)Math.pow(10,count)-1;
		return max;
	}

}
