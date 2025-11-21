package com.scaler.oops.multithreadedmergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> listToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> listToSort, ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Logic of merge sort.
        int n = listToSort.size();

        if (n <= 1) {
            return listToSort;
        }

        //Divide the list into 2 halves.
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();

        for (int i = 0; i < n/2; i++) {
            firstHalf.add(listToSort.get(i));
        }

        for (int i = n/2; i < n; i++) {
            secondHalf.add(listToSort.get(i));
        }

        //Sort first half and second half recursively in separate threads.
        MergeSorter leftMergeSorter = new MergeSorter(firstHalf, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(secondHalf, executorService);

//        Instead of creating a new ExecutorService object everytime, we can use the one passed in the constructor.
//        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedListFuture = executorService.submit(leftMergeSorter); // Non Blocking call
        Future<List<Integer>> rightSortedListFuture = executorService.submit(rightMergeSorter); // Non Blocking call

        //Merge leftSortedList and rightSortedList.
        List<Integer> leftSortedList = leftSortedListFuture.get(); //Blocking call.
        List<Integer> rightSortedList = rightSortedListFuture.get(); //Blocking call.

        int i = 0, j =0;
        List<Integer> finalSortedList = new ArrayList<>();

        while (i < leftSortedList.size() && j < rightSortedList.size()) {
            if (leftSortedList.get(i) < rightSortedList.get(j)) {
                finalSortedList.add(leftSortedList.get(i));
                i++;
            } else {
                finalSortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while (i < leftSortedList.size()) {
            finalSortedList.add(leftSortedList.get(i));
            i++;
        }

        while (j < rightSortedList.size()) {
            finalSortedList.add(rightSortedList.get(j));
            j++;
        }

        return finalSortedList;
    }
}
