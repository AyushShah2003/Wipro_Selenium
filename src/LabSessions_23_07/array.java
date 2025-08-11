package LabSessions_23_07;

public class array {
	
	public static boolean search(int arr[], int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) return true;
		}
		return false;
	}
	
	public static void reverse(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
	}
	
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,7,3,6,22,7,3,6,3};
		int n=50;
		String isPresent = search(arr,n)?" is present in array":" is not present in array";
		System.out.println(n+isPresent);
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
		reverse(arr);
		System.out.println("After reverse :");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
		System.out.println("Sum ->"+sum(arr));
	}

}