// This is a java program for insertion sort. It takes the elements of array as
// inputs and then sors it.
import java.util.Arrays;
class insertion {
  public static void main(String[] args) {
    int count = args.length;
    int [] myArray = new int [count];
    for (int i=0,j=0; i<count ;i++,j++)  {
        myArray[j] = Integer.parseInt(args[i]);
  }

// Printing out the array before sorting
System.out.println(" The contents of the array is");
System.out.println(Arrays.toString(myArray));

// calling function to sort the input array
Insertion_sort(myArray,count); // Passing arrays in functon call. Arrays are passed
// By reference. So just pass the name of the array.Name of the array
// is arg 0 of the array - i guess ....

} // end of main


// Function to perform insertion sort on a given array of integer elements

private static void Insertion_sort (int[] passedArray , int passedCount) {
  System.out.println(" The contents of the array passed to the Insertion_sort function is");
  System.out.println(Arrays.toString(passedArray));
  System.out.println("Passed value of array count is : " + passedCount);
  System.out.println(passedArray[1]);
  // Performing Insertion sort on the passed array

  for(int j=1;  j< passedCount; j++)  {
    int key = passedArray[j];
    int i=  j-1;

    while(i>=0 && passedArray[i] > key)  {
      passedArray[i+1]  = passedArray[i];
      i --;
    }
    passedArray[i+1] = key;
  }

  System.out.println(" The contents of the array after the insertion sort is");
  System.out.println(Arrays.toString(passedArray));


} // enf of Insertion_sort function


} // end of class
