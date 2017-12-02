import java.util.Random;

public class Sorts {
    public void bubbleSort(){
        Random random = new Random();
        int [] numbers = new int[100000];
        System.out.println("start array:");
        for(int i = 0; i < numbers.length -1; i++) {
            numbers[i] = random.nextInt(1000000) + 1;
            System.out.println(numbers[i]);
        }

        long timeBegin = System.currentTimeMillis();

        for(int i = 0; i < numbers.length; i++){
            for(int k = 0; k < numbers.length - 1; k++){
                int temp;
                if (numbers[k] > numbers[k+1]){
                    temp = numbers[k+1];
                    numbers[k+1] = numbers[k];
                    numbers[k] = temp;
                }
            }
        }
        long timeEnd = System.currentTimeMillis();

        for(int i = 0; i< numbers.length -1; i++) {
           System.out.println(numbers[i]);
        }

        System.out.println("Bubble sort spends " + (timeEnd - timeBegin) + " mseconds");
    }

    public void quickSort(){
        Random random = new Random();
        int [] numbers = new int[100000];
        System.out.println("start array:");
        for(int i = 0; i < numbers.length -1; i++) {
            numbers[i] = random.nextInt(1000000);
           // System.out.println(numbers[i]);
        }

        long timeBegin = System.currentTimeMillis();

        qs(numbers, 0, numbers.length - 1);


        long timeEnd = System.currentTimeMillis();


        for(int i = 0; i < numbers.length -1; i++) {
            //System.out.println(numbers[i]);
        }

        System.out.println("Quick sort spends " + (timeEnd - timeBegin) + " mseconds");
    }

    private void qs(int [] arr, int start, int end){

            if(arr.length == 0){
                return;
            }

            if(start >= end){
                return;
            }
    int i = start;
    int j = end;

    int middle = arr[(end + start) / 2];

    while(i <= j){
        while(arr[i] < middle){
            i++;
        }
        while (arr[j] > middle){
            j--;
        }

        if(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    if(start < j) {
        qs(arr, start, j);
    }
    if(i < end) {
        qs(arr, i, end);
    }

    }

}
