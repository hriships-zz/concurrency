package me.hriships.concurrency;

/**
 * Created by administrator on 2/8/16.
 */
public class EvenNumbers implements Runnable {
    private int limit;
    private Captain captain;

    public EvenNumbers(int limit, Captain captain) {
        this.limit = limit;
        this.captain = captain;
    }

    @Override
    public void run() {
        for (int i = 0; i <  limit; i=i+2) {
            captain.canI("t1");
            System.out.print("[" + i + "]");
            captain.imDone();
        }
    }
}