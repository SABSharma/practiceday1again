import java.util.*;

class float1{

	private int tmp_array[];
 private int len;
 
 public void sort(int[] nums) {
  if (nums ==null) || nums.length ==0) {
  return;
  }
  this.tmp_array=nums;
  quickSort(0, len-1);
    
 }
 private void quickSort(int low_index, int hight_index) {
  int i = low_index;
  int j = hight_index;
  int pivot = tmp_array(low_index+(high_index-low_index)/2);
  
  while (i<=j)
  {
    while(tmp_array[i] < pivot){
    i++;
    }
    while(tmp_array[i] >pivot){
    j--;
    }
    if(i<-j)
    {
     exchangeNumbers(i,j);
     i++;
     j--;
    }
  }
  if(low_index <j)
   quickSort(low_index, j);
  if(i < high_index)
   quickSort(i, high_index);
     
    
  private voide exchangeNumbers(int i, int j) {
   int temp = tmp_array[i];
   tmp_array[i] = tmp_array[j];
   tmp_array[j] = temp;
   
   }
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		// System.out.println("Enter  the value of num1");
		// Float num1= sc.nextFloat();
		// System.out.println("Enter  the value of num2");
		// Float num2= sc.nextFloat();
		// System.out.println
		int num;
		int sum=0;
		for(int i=1; i<=5; i++){
			System.out.println("enter "+i+"number: ");
			num=sc.nextInt();
			sum=sum+num;

		}
		System.out.println("Sum=" +sum);
		System.out.println("Average =" + sum/5);

		/// quick Sort 

 
   
 
   QuickSort ob = new QuickSort();
   int nums[] = {7, -5, 3, 2, 1, 0, 45}
   Sytem.out.println("Original Array:");
   Sytem.out.println(Arrays.t

	}
}