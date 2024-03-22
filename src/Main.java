// Classe Main.java
import models.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 2, 56, 7, 23, 16, 90};

        // Busca Linear
        int linearResult = LinearSearch.search(array, 23);
        if (linearResult != -1) {
            System.out.println("Busca Linear: Elemento encontrado na posição " + linearResult);
        } else {
            System.out.println("Busca Linear: Elemento não encontrado");
        }

        // Bubble Sort
        BubbleSort.sort(array);
        System.out.println("Bubble Sort: " + Arrays.toString(array));

        // Selection Sort
        int[] array2 = {64, 2, 56, 7, 23, 16, 90};
        SelectionSort.sort(array2);
        System.out.println("Selection Sort: " + Arrays.toString(array2));

        // Busca Binária
        int[] array3 = {2, 7, 16, 23, 56, 64, 90};
        int binaryResult = BinarySearch.search(array3, 23);
        if (binaryResult != -1) {
            System.out.println("Busca Binária: Elemento encontrado na posição " + binaryResult);
        } else {
            System.out.println("Busca Binária: Elemento não encontrado");
        }
    }
}
