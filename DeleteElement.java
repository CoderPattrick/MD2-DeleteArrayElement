public class DeleteElement {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        array= deleteElement(array,2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static int[] deleteElement(int[] arr,int index){
        int arrTemp[]=new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            arrTemp[i]=arr[i];
        }
        for (int i = index; i <arr.length-1 ; i++) {
            arrTemp[i]=arr[i+1];
        }
        return arrTemp;
    }
}
