public class Q4SumOfArray {

    public static int findSum(int arr[],int index) {
        if (index == arr.length) {
            return 0; // Base case: return 0 when all elements are processed
        }

        int currentElement = arr[index];
        int remainingSum = findSum(arr, index + 1);// recursive call

        return currentElement + remainingSum;
    }

    public static void main(String[] args) {
        int arr1[]={92, 23, 15, -20, 10};
        int sum=findSum(arr1,0);
        System.out.println(sum);
    }
}
