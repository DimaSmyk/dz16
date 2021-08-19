package selfwork16.task01;

public class WriteArray implements Runnable {

    private int [] array;
    private int from;
    private int to;
    private double average;

    public double getAverage() {
        return average;
    }

    public WriteArray(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        double sumArray = 0;
        int a = to - from;
        for(int i = from; i < to; i++){
            sumArray += array[i];
        }
        average = sumArray / a;
        //System.out.println("Thread average: " + average);
    }
}
