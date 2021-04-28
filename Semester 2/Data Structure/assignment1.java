import java.util.*;

class Seggregate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		String[] arr = new String[n];
		System.out.print("Enter elements of array: ");
		for (int i = 0; i < n; i++){
			arr[i] = input.next();
		}
		int b1 = 0;
		int b2 = 0;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (arr[i].equals("b") && !flag) {
				b1 = i;
				flag = true;
			} 
			else if (arr[i].equals("b") && flag){
				b2 = i;
			} 
			else if (arr[i].equals("a") && flag){
				if (b2!=b1) {
					arr[i] = "b";
					arr[b1] = "a";
					b1++;
					b2++;
				} 
				else{
					arr[i] = "b";
					arr[b1] = "a";
					flag = false;
				}
			}
		} 
		System.out.print("Elements of array after Seggregation: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}