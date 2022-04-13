package timecounter;

/**
 * https://www.youtube.com/watch?v=FzwIs2jMESM&list=PLgcKMlJueAM5TOhhyPpFshUd-In7YwCQW&index=7
 *
 * C:\JavaCode\Docker
 * docker build -f src/timecounter/Dockerfile -t counter:1.0 .
 *
 * docker run counter:1.0
 *
 * docker run -d counter:1.0
 *
 * docker logs ID
 *
 * show the counting despite in detached mode:
 * docker logs ID
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

