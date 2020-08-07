package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000 + 1);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
