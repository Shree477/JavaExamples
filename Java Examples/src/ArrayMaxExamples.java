
public class ArrayMaxExamples {

	public static void main(String[] args) {

		
		int arr[]= {3,10,4,13,9};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}	
		
			System.out.println("Max no "+max);
			}
}