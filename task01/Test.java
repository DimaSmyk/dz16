package selfwork16.task01;

import selfwork15.task02.WriterArray;

public class  Test {

    static int [] array = new int[10_000_000];

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < array.length; i++){
            array [i] = (int) (Math.random() * 100);
        }
        long start = System.currentTimeMillis();

        WriteArray write = new WriteArray(array,0,2_500_000);
       WriteArray write1 = new WriteArray(array,2_500_000,5_000_000);
        WriteArray write2 = new WriteArray(array,5_000_000,7_500_000);
        WriteArray write3 = new WriteArray(array,7_500_000,10_000_000);

       Thread thread = new Thread(write);
       Thread thread1 = new Thread(write1);
        Thread thread2 = new Thread(write2);
        Thread thread3 = new Thread(write3);

       thread.start();
       thread1.start();
        thread2.start();
        thread3.start();

       thread.join();
       thread1.join();
        thread2.join();
        thread3.join();

        long stop = System.currentTimeMillis();
        System.out.println("Time with 4 tread: " + (stop-start));


    }
}
