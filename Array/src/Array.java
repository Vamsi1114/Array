import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of elements do you want: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    System.out.println("Enter the elements: ");
    for(int i=0; i< arr.length; i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Prime numbers in the array: ");
    for(int i=0; i< arr.length; i++) {
    	int n =arr[i]/2;
    	if(n%2==0 && n!=0) {
    		System.out.println(arr[i]);
    	}
    }
    System.out.println("Even numbers in the array: ");
    for(int i=0; i< arr.length; i++) {
    	
    	if(arr[i]%2==0) {
    		System.out.println(arr[i]);
    	}
    }
    System.out.println("Odd numbers in the array: ");
    for(int i=0; i< arr.length; i++) {
    
    	if(arr[i]%2!=0) {
    		System.out.println(arr[i]);
    	}
    }
	}

}
