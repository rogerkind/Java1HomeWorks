class HomeWork1{
	
	public static void main (String[] args){
		
		//task 2
		System.out.println("Task 2: \n");
		createPrimitives();
		System.out.println("\n");
		//task 3
		System.out.println("Task 3: \n");
		System.out.println("Result = "+(int)calcThis(2,2,2,2));//дробуную отсекаем приведением к типу int
		System.out.println("\n");
		//Task 4
		System.out.println("Task 4: ");
		System.out.println("Result = "+isBetween10and20(5,10));
		System.out.println("\n");
		//Task 5
		System.out.println("Task 5: ");
		isNegativeOrPositive(5);
		System.out.println("\n");
		
		//Task 6
		System.out.println("Task 6: ");
		System.out.println("Result = "+isNegative(-10));
		System.out.println("\n");
		
		//Task 7
		System.out.println("Task 7: ");
		helloName("Вася");//да простит меня преподавтель, надеюсь, у вас по умолчанию в консоли винды подключена UTF8(chcp 65001) :)
		System.out.println("\n");
		
		//Task 8
		System.out.println("Task 8: ");
		isLeapYear(2017);
		System.out.println("\n");
	}
	
	static void createPrimitives(){
		byte b = 100;
		short s = 200;
		int i = 30000;
		long l = 500000;
		float f = 3.1409859f;
		double d = 314.239423;
		boolean flag = true;
		char c = 'V';
		System.out.println("byte = "+b);
		System.out.println("short = "+s);
		System.out.println("int = "+i);
		System.out.println("long = "+l);
		System.out.println("float = "+f);
		System.out.println("double = "+d);
		System.out.println("boolean = "+flag);
		System.out.println("char = "+c);
	}
	
	static float calcThis(float a, float b, float c, float d){// деление - float иначе точность потеряем 
		return a * (b + (c / d));
	}
	
	static boolean isBetween10and20(int a, int b){
		if((a+b)>=10&&(a+b)<=20) return true;
		else return false;
	}
	
	static void isNegativeOrPositive(int number){
		if(number>=0)System.out.println("This number is positive");
		else System.out.println("This number is negative");
	}
	
	static boolean isNegative(int number){
		if(number<0)return true;
		return false;
	}
	
	static void helloName (String name){
		System.out.println("Привет, "+name);
	}
	
	static void isLeapYear(int year){
		if (year%100==0){
			if(year%400==0)System.out.println(year+" Is a leap year");
			else System.out.println(year+" Is not a leap year");
		}
		else{
			if(year%4==0)System.out.println(year+" Is a leap year");
			else System.out.println(year+" Is not a leap year");
		}
	}
}