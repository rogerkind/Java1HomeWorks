import java.util.Arrays;
import java.util.Random;
class HomeWork2{
	public static void main (String[] args){
		
		//task 1
		System.out.println("Task 1: \n");
		int [] arrTask1 = {1,1,0,0,1,0,1,1,0,0};
		System.out.println("Input : "+Arrays.toString(arrTask1));
		System.out.println("Ouput : "+Arrays.toString(invertArray(arrTask1)));
		System.out.println("\n");
		
		//task 2
		System.out.println("Task 2: \n");
		int [] arrTask2 = new int[8];
		System.out.println("Input : "+Arrays.toString(arrTask2));
		System.out.println("Ouput : "+Arrays.toString(fillPlus3(arrTask2)));
		System.out.println("\n");
		//Task 3
		System.out.println("Task 3: ");
		int [] arrTask3 = {1,5,3,2,11,4,5,2,4,8,9,1};
		System.out.println("Input : "+Arrays.toString(arrTask3));
		System.out.println("Ouput : "+Arrays.toString(less6Double(arrTask3)));
		System.out.println("\n");
		//Task 4
		System.out.println("Task 4: ");
		int size = 7;
		int[][] arrTask4= new int[size][size];
		System.out.println("Output : ");
		print2dArray(paintDialonals(arrTask4));// this metod will catch non square 
		System.out.println("\n");
		
		//Task 5
		System.out.println("Task 5: ");
		System.out.print("Input : ");
		int[] arrTask5= new int [10];
		System.out.println(Arrays.toString(fillArray(arrTask5)));
		minmaxOfArray(arrTask5);
		System.out.println("\n");
		
		//Task 6
		System.out.println("Task 6: ");
		int[] arrTask6={1,1,1,2,1}; //{1,1,1,2,1};{2,1,1,2,1}:{10,10};
		System.out.println("Input : "+Arrays.toString(arrTask6));
		System.out.println("Balanced? :" + checkBalance(arrTask6));
		System.out.println("\n");
		
		//Task 7
		System.out.println("Task 7: ");
		int[] arrTask7= {1,2,3,4,5};
		int shift = -22;
		System.out.println("Input : "+Arrays.toString(arrTask7));
		System.out.println("Shift to: "+shift);
		System.out.println("Ouput : "+Arrays.toString(shiftArray(arrTask7,shift)));
		System.out.println("\n");
	}
	
	static int[] invertArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=(arr[i]==0)?1:0;
		}
		return arr;
	}
	
	static int[] fillPlus3(int[] arr){
		
		for(int i=0,j=0;i<arr.length;i++){
			arr[i]=j;
			j+=3;
		}
		return arr;
	}
	
	static int[] less6Double(int[] arr){
		
		for(int i=0,j=0;i<arr.length;i++){
			if(arr[i]<6)arr[i]*=2;
		}
		return arr;
	}
	
	static int[][] paintDialonals(int arr [][]){
		if (arr.length!=arr[0].length){
			System.out.println("Error! Array isn't square");
			return arr;
		}
		else{
			for(int i=0;i<arr.length;i++){
			    for(int j=0;j<arr[i].length;j++){
					if(i==j)arr[i][j]=1;
				else{
					if(j==((arr[i].length-1)-i))arr[i][j]=1;
				}
			}
		}
		return arr;
		}
		
	}
	
	static void print2dArray(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}	
	
	
	static int[] fillArray(int[] arr){
		Random rand = new Random();
		
			for(int i=0;i<arr.length;i++){
			arr[i]=rand.nextInt(arr.length)+1;
			}
		
		 
		
		return arr;
	}
	
	static void minmaxOfArray(int[]arr){
		int min=arr[0];
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min)min=arr[i];
			if(arr[i]>max)max=arr[i];
		}
		System.out.println("Minimum = "+min);
		System.out.println("Maximum = "+max);
	}
	
	static boolean checkBalance(int[]arr){
		int summ=0;
		for(int i=0;i<arr.length;i++){
			summ+=arr[i];
		}
		if(summ%2==0)return true;
		
		return false;
			
	}
	
	static int[] shiftArray(int[]arr,int shift){//велико искушение подглядеть в нете, но пока так.  
		int[] arr1 =new int[arr.length];
		if(shift<0)	{
				shift%=arr.length;
				shift+=arr.length;
			
		}
		else shift%=arr.length;
		
			
		
			for(int i=0;i<arr.length;i++){
				arr1[(i+shift)%arr.length]=arr[i];
			
			}
		
		
			
		return arr1;
	}
	
}