
public class ArrayMinExample {

	public static void main(String[] args) {

		int arr[]= {303,105,403,130,97};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}	
		
			System.out.println("Min no "+min);
	}

}
