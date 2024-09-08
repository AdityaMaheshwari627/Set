package Arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        //Remove Duplicate Elements
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]==arr[j]) {
        			for(int k=j;k<n-1;k++) {
        				arr[k]=arr[k+1];
        			}
        			n--;
        			j--;
        		}
        	}
        }
        System.out.print("Set:{");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]);
        	if(i<n-1) {
        		System.out.print(",");
        	}
        }
        System.out.print("}");
	}

}
