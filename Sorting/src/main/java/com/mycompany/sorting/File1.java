package com.mycompany.sorting;

public class File1 {
//    Bubble Sort - Done
//    Selection Sort
//    Insertion Sort

    public static String[] Names = {
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

        bubbleSort(Names);

        System.out.println("Bubble Sort:");
        for (String name : Names) {
            System.out.println(name);
        }

        selectionSort(Names);
        System.out.println("\nSelection Sort:");
        for (String str : Names) {
            System.out.print(str + " \n");
        }

        System.out.println("\nInsertion Sort:");
        for (String str : Names) {
            System.out.print(str + " \n");
        }

    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
