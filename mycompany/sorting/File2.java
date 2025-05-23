package com.mycompany.sorting;

public class File2 {

//    Merge Sort
//    Quick Sort
    private static String[] Names = {
        "Tristan", "Mia", "Benjamin", "Xander", "Vanessa",
        "Daniel", "Patrick", "Abigail", "Samuel", "Kevin",
        "Zoe", "Jacob", "Madison", "Grace", "Quentin",
        "William", "Owen", "Isabella", "Elijah", "Katherine",
        "Caleb", "Alexander", "Jasmine", "Victor", "Noah",
        "Charlotte", "Rachel", "Uriel", "Alice", "Nathan",
        "Penelope", "Thomas", "Hannah", "Liam", "Emma",
        "Diana", "Steven", "Leah", "Lucas", "Matthew",
        "Gabriel", "Yasmine", "Olivia", "Sarah", "Aaron",
        "Sophia", "Isaac"
    };

    public static void main(String[] args) {

        System.out.println("Unsorted Array:");
        printArray(Names);

        mergeSort(Names, 0, Names.length - 1);

        System.out.println("\nMerge Sort:");
        printArray(Names);

        System.out.println("\nQuick Sort:");
        quickSort(Names, 0, Names.length - 1);

        printArray(Names);

    }

    private static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
