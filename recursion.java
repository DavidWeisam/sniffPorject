public static void main(String[] args) {
        	System.out.println("1. A function that gets a number and returns a sum of digits:");

	    	System.out.println("Is all the check is works: " + sum_check() + "\n");	

		System.out.println("2. A function that gets a number and returns an even number of digits: ");

	    	System.out.println("Is all the check is works: " + counter_check() + "\n");

		System.out.println("3. A function that gets a number and returns the largest digit in the number: ");
		
		System.out.println("Is all the check is works: " + max_check() + "\n");

		System.out.println("4. A function that accepts a number and returns the significant digit in the number: ");

		System.out.println("Is all the check is works: " + left_check() + "\n");

		System.out.println("5. A function that gets two numbers and returns the first to the second power:  ");

		System.out.println("Is all the check is works: " + pow_check() + "\n");
	
		System.out.println("6. A function that gets a number and returns a factorial of the number:  ");

		System.out.println("Is all the check is works: " + factorial_check() + "\n");

		System.out.println("9. An operation that gets a number and returns the opposite number:  ");

		System.out.println("Is all the check is works: " + reverseNumber_check() + "\n");

		System.out.println("11.A recursive function that receives a number in base 10 and returns the number in base 8:  ");

		System.out.println("Is all the check is works: " + octal_check() + "\n");

	}

	public static boolean sum_check(){
		int work = 0;
		if(sum(174) == 12)	// First test of sum
			work++;
	
		if(sum(109) == 10)	// Second test of sum
			work++;
	
		if(sum(845) == 17)	// Third test of sum
			work++;

		return(work == 3);
	}

	    	
	public static boolean counter_check(){
		int work = 0;
		if(counter(149) == 1)	// First test of counter
			work++;
	
		if(counter(12554) == 2)	// Second test of counter
			work++;
	
		if(counter(357) == 0)	// Third test of counter
			work++;

		return(work == 3);


	}

	public static boolean max_check(){
		int work = 0;
		if(max(279) == 9)	// First test of max
			work++;
	
		if(max(472) == 7)	// Second test of max
			work++;
	
		if(max(211) == 2)	// Third test of max
			work++;

		return(work == 3);


	}

	public static boolean left_check(){
		int work = 0;
		if(left(279) == 2)	// First test of left
			work++;
	
		if(left(472) == 4)	// Second test of left
			work++;
	
		if(left(311) == 3)	// Third test of left
			work++;

		return(work == 3);


	}
	
	public static boolean pow_check(){
		int work = 0;
		if(pow(2, 4) == 16)	// First test of pow
			work++;
	
		if(pow(5, 2) == 25)	// Second test of pow
			work++;
	
		if(pow(3, 3) == 27)	// Third test of pow
			work++;

		return(work == 3);


	}

	public static boolean factorial_check(){
		int work = 0;
		if(factorial(4) == 24)	// First test of factorial
			work++;
	
		if(factorial(3) == 6)	// Second test of factorial
			work++;
	
		if(factorial(5) == 120)	// Third test of factorial
			work++;

		return(work == 3);


	}
	
	public static boolean reverseNumber_check(){
		int work = 0;
		if(reverseNumber(1234) == 4321)	// First test of reverseNumber
			work++;
	
		if(reverseNumber(3942) == 2493)	// Second test of reverseNumber
			work++;
	
		if(reverseNumber(78) == 87)	// Third test of reverseNumber
			work++;

		return(work == 3);


	}
	
	public static boolean octal_check(){
		int work = 0;
		if(octal(12) == 14)	// First test of octal
			work++;
	
		if(octal(42) == 52)	// Second test of octal
			work++;
	
		if(octal(89) == 131)	// Third test of octal
			work++;

		return(work == 3);


	}


	public static int sum(int num){
		if (num == 0)
			return 0;

		return (num % 10 + sum(num / 10));
	}	
	

	
   	public static int counter(int num){
		if(num == 0)	
	    		return 0;
		if((num % 10) % 2 == 0)
	    		return (1 + counter(num / 10));
    		return (counter(num / 10));

    	}
    
	public static int max(int num){
		return(max(num, 0));
    	}
    
	public static int max(int num, int max){
		if(num == 0)
	    		return max;
	    	
		if(num % 10 > max)
	    		return max(num / 10, num % 10);
    		return max(num / 10, max);

    	}
    
        public static int left(int num){
    		if(num < 10)
	    		return num;
    		return left(num / 10);

    	}
    
    	public static int pow(int num1, int num2){
		if(num2 == 0)
	    		return 1;
	    	return (num1 * pow(num1, num2 - 1));
	
    	}

    	public static int factorial(int num){
		if(num == 1)
	    		return 1;
    		return (num * factorial(num - 1));
    	}
    
    
    	public static int reverseNumber(int num){ 
        	return(reverseNumber(num, 0));
    	}
        
    	public static int reverseNumber(int num, int num2){
        	if(num == 0)
            		return num2;
        	num2 *= 10;
        	num2 += num % 10;
        	return reverseNumber(num / 10, num2);
    	}

    	public static int octal(int num){
        	if (num == 0)
            		return num;
        	int num2 = num % 8;
        
       		return octal(num / 8) * 10 + num2; 
    	}

/*
           out put:

1. A function that gets a number and returns a sum of digits:
Is all the check is work: true

2. A function that gets a number and returns an even number of digits: 
Is all the check is work: true

3. A function that gets a number and returns the largest digit in the number: 
Is all the check is work: true

4. A function that accepts a number and returns the significant digit in the number: 
Is all the check is work: true

5. A function that gets two numbers and returns the first to the second power:  
Is all the check is work: true

6. A function that gets a number and returns a factorial of the number:  
Is all the check is work: true

9. An operation that gets a number and returns the opposite number:  
Is all the check is work: true

11.A recursive function that receives a number in base 10 and returns the number in base 8:  
Is all the check is work: true 

*/

