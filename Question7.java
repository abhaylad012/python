import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		int array[]=new int[10];
		 Scanner scanner1= new Scanner(System.in);
		 System.out.println("Enter array elements:");
		 for(int index=0;index<10;index++)
		 {
			 array[index]=scanner1.nextInt();			 
		 }
		 
		 System.out.println("Enter searching Element");
		 int key=scanner1.nextInt();
		 
		 for(int index=0;index<10;index++) {
			 if(array[index]==key) {
				 System.out.println("Entered Element is found"+key+"index of element is"+index);
				 break;
			 }
			 else if(index==9) {
				 System.out.println("Entered Element is not found");
			 }
		 }
		 

	}

}
