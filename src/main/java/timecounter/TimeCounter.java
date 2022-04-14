package timecounter;

/**
 * https://www.youtube.com/watch?v=FzwIs2jMESM&list=PLgcKMlJueAM5TOhhyPpFshUd-In7YwCQW&index=7
  */

public class TimeCounter {

    public static void main(String[] args) {
        System.out.println("Counting soon starting");

        int count = 0;

        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("Time since start = " + count);
                count++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

