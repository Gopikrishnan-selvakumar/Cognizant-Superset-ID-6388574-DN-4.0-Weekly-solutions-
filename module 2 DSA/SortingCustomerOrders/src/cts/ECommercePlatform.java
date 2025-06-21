package cts;

public class ECommercePlatform {
    public static void main(String[] args) {
        Orders[] orders = {
            new Orders("1", "Alice", 250.0),
            new Orders("2", "Bob", 150.0),
            new Orders("3", "Charlie", 500.0),
            new Orders("4", "David", 300.0),
            new Orders("5", "Eve", 100.0)
        };

        // Bubble Sort
        Orders[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Orders sorted by totalPrice using Bubble Sort:");
        for (Orders order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort
        Orders[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders sorted by totalPrice using Quick Sort:");
        for (Orders order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
