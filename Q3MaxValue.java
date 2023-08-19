public class Q3MaxValue {

    public static void findMax(int arr[],int index,int max) {
        
        if(index >= arr.length){
            System.out.println(max);        //base condition
        }

        else if(arr[index]>max){
            max=arr[index];
            findMax(arr, index+1,max);// recursive call
        }
        else{
            findMax(arr, index+1,max);// recursive call
        }
    }
    public static void main(String[] args) {
        int arr1[]={13, 1, -3, 22, 5};
        int max=Integer.MIN_VALUE;
        findMax(arr1,0,max);
    }
}
