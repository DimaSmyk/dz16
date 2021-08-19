package selfwork16.task01;

public class WriteArray implements Runnable {

    int [] array;
    int from;
    int to;


    public WriteArray(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        double average = 0;
        for(int i = from; i < to; i++){
            average = average + array[i];
        }
        average = average / to;
        System.out.println(average);

    }
}
