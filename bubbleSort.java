public class bubbleSort {
    public void static bubblesort(int[] array){
        int n = array.length;
        if(n <= 1){
            return;
        }else{
            for(int i = 0;i < n;i++){
                boolean flag = false;
                for(int j = 0;j < n-i-1;j++){
                    if(array[j]>array[j+1]){
                        flag = true;
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
                if(!flag){
                    break;
                }
            }
        }
    }
}
