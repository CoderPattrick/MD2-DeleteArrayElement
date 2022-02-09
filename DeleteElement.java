public class DeleteElement {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,2,10,2,2,100};
        int unnecessaryElement=2;
        int[] infoOfUnnecessaryE=findElement(array,unnecessaryElement);
        if(infoOfUnnecessaryE[0]==-1){
            System.out.printf("Element %d not found in the array!",unnecessaryElement);
        }
        else {
            for (int i = 0; i < infoOfUnnecessaryE.length; i++) {
                array = deleteElement(array, infoOfUnnecessaryE[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
    public static int[] findElement(int[] arr,int element){
        int cnt =0;
        int[] indexOfTheElement,arrTemp=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(element==arr[i]){
                arrTemp[cnt]=i;
                cnt++;
            }
        }
        if(cnt>0) {
            indexOfTheElement = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                indexOfTheElement[i] = arrTemp[i]-i;
            }
        }else{
            indexOfTheElement=new int[1];
            indexOfTheElement[0]=-1;
        }
        return indexOfTheElement;

    }
}
