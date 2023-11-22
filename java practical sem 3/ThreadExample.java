// Write a program to calculate the sum of numbers from 1 
// to a limit in Single and Multiple Thread in Java.
public class ThreadExample {
 public static void main(String[] args) {
 int limit = 1000000; // The limit for the sum calculation
 long singleThreadSum = calculateSumSingleThread(limit);
 long multiThreadSum = calculateSumMultiThread(limit, 4); 
// Use 4 threads
 System.out.println("Single Thread Sum: " + 
singleThreadSum);
 System.out.println("Multi-Thread Sum: " + 
multiThreadSum);
 }
 // Calculate the sum using a single thread
 public static long calculateSumSingleThread(int limit) {
 long sum = 0;
 for (int i = 1; i <= limit; i++) {
 sum += i;
 }
 return sum;
 }
 // Calculate the sum using multiple threads
 public static long calculateSumMultiThread(int limit, int
numThreads) {
 long sum = 0;
 SumThread[] threads = new SumThread[numThreads];
 for (int i = 0; i < numThreads; i++) {
 int start = i * (limit / numThreads) + 1;
 int end = (i == numThreads - 1) ? limit : (i + 1) * (limit / 
numThreads);
 threads[i] = new SumThread(start, end);
 threads[i].start();
 }
 try {
 for (int i = 0; i < numThreads; i++) {
 threads[i].join();
 sum += threads[i].getPartialSum();
 }
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 return sum;
 }
 static class SumThread extends Thread {
 private int start;
 private int end;
 private long partialSum;
 public SumThread(int start, int end) {
 this.start = start;
 this.end = end;
 this.partialSum = 0;
 }
 public void run() {
 for (int i = start; i <= end; i++) {
 partialSum += i;
 }
 }
 public long getPartialSum() {
 return partialSum;
 }
 }
}

