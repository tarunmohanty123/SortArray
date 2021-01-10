
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {100,59,9,18,6,62,13};
		int temp = 0;
		for(int i=0; i<arr.length ; i++)
		{
			int min = i;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
				
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		 
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k] + " ");
		}
	}

}
