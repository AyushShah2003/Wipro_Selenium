package LabSessions_02_08;

import java.util.Arrays;

class SortThread extends Thread {
    private int[] array;

    public SortThread(int[] array) {
        this.array = array;
    }

    public void run() {
        Arrays.sort(array); // sort this half
    }

    public int[] getSortedArray() {
        return array;
    }
}

public class sortArray {

	public static void main(String[] args) {
		
	}

}