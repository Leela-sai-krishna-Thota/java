//MERGESORT
import java.util.Scanner;

public class MergeSort {

    private static int[] b; // Auxiliary array for merging

    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }

        // Copy remaining elements from the left subset
        while (i <= mid) {
            b[k++] = a[i++];
        }

        // Copy remaining elements from the right subset
        while (j <= high) {
            b[k++] = a[j++];
        }

        // Copy the merged elements back into the original array
        for (int h = low; h <= high; h++) {
            a[h] = b[h];
        }
    }

    // Main method to test MergeSort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        b = new int[n]; // Initialize the auxiliary array

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
                 System.out.print(array[i] + " ");
}
        scanner.close();
    }
}









//QUICKSORT
import java.util.Arrays;

public class QuickSort {
    // Method to perform QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); // Sort left subarray
            quickSort(arr, pivotIndex + 1, high); // Sort right subarray
        }
    }

    // Partition method with first element as pivot
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose first element as pivot
        int i = low + 1;
        int j = high;
        
        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j); // Place pivot at its correct position
        return j;
    }

    // Swap method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}











//BFS_AM
import java.util.*;

class BFS_AM {
    static void bfs(int[][] adj, int start) {
        boolean[] visited = new boolean[5];
        List<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int vis;
        while (!q.isEmpty()) {
            vis = q.get(0);
            System.out.print(vis + " ");
            q.remove(q.get(0));
            for (int i = 0; i < 5; i++) {
                if (adj[vis][i] == 1 && (!visited[i])) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int adj[][] = { { 0, 1, 1, 0, 0 }, { 1, 0, 1, 0, 0 }, { 0, 1, 0, 1, 1 },
                { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 } };
        bfs(adj, 0);
    }
}

//DFS_AM
import java.util.*;

public class DFSUsingAM {
    public static void dfs(int[][] adjacencyMatrix, boolean[] visited, int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                dfs(adjacencyMatrix, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };

        boolean[] visited = new boolean[adjacencyMatrix.length];
        System.out.println("DFS Traversal:");
        dfs(adjacencyMatrix, visited, 0);
    }
}






//BFS_AL

import java.util.*;

public class BFSUsingAL {
    public static void bfs(int vertices, List<List<Integer>> adjacencyList, int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> adjacencyList = new ArrayList<>();
        
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(3);
        adjacencyList.get(1).add(4);
        adjacencyList.get(2).add(4);

        bfs(vertices, adjacencyList, 0);
    }
}
list bfs

//DFS_AL
import java.util.*;

public class DFSUsingAL {
    public static void dfs(List<List<Integer>> adjacencyList, boolean[] visited, int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(adjacencyList, visited, neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(3);
        adjacencyList.get(1).add(4);
        adjacencyList.get(2).add(4);

        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal:");
        dfs(adjacencyList, visited, 0);
    }
}
 


//MAX_HEAP

import java.util.Arrays;
import java.util.Scanner;.++

class MaxHeap {
    int[] arr;
    int maxSize, heapSize;

    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heapSize = 0;
        arr = new int[maxSize];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int lChild(int i) {
        return 2 * i + 1;
    }

    int rChild(int i) {
        return 2 * i + 2;
    }

    int getMax() {
        return arr[0];
    }

    int curSize() {
        return heapSize;
    }

    void MaxHeapify(int i) {
        int l = lChild(i);
        int r = rChild(i);
        int largest = i;
        if (l < heapSize && arr[l] > arr[i])
            largest = l;
        if (r < heapSize && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(largest);
        }
    }

    void removeMax() {
        if (heapSize <= 0)
            System.out.println("Heap is empty");
        if (heapSize == 1)
            heapSize--;
        else {
            arr[0] = arr[heapSize - 1];
            heapSize--;
            MaxHeapify(0);
        }
    }

    void insertKey(int x) {
        if (heapSize == maxSize) {
            System.out.println("\nOverflow: Could not insertKey\n");
            return;
        }
        int i = heapSize;
        arr[i] = x;
        heapSize++;
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(15);
        int elements[] = {3, 10, 12, 8, 2, 14};

        for (int e : elements)
            h.insertKey(e);
        System.out.println("The current size of the heap is " + h.curSize());
        System.out.println("The current maximum element is " + h.getMax());
        h.removeMax();
        System.out.println("The current size of the heap is " + h.curSize());
        
        // Inserting 2 new keys into the heap.
        h.insertKey(15);
        h.insertKey(5);
        System.out.println("The current size of the heap is " + h.curSize());
        System.out.println("The current maximum element is " + h.getMax());
    }
}



//MIN_HEAP
import java.util.Arrays;
import java.util.Scanner;

class MinHeap {
    int[] arr;
    int maxSize, heapSize;

    MinHeap(int maxSize) {
        this.maxSize = maxSize;
        heapSize = 0;
        arr = new int[maxSize];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int lChild(int i) {
        return 2 * i + 1;
    }

    int rChild(int i) {
        return 2 * i + 2;
    }

    int getMin() {
        return arr[0];  // The minimum element is always at the root
    }

    int curSize() {
        return heapSize;
    }

    void MinHeapify(int i) {
        int l = lChild(i);
        int r = rChild(i);
        int smallest = i;
        
        if (l < heapSize && arr[l] < arr[i])
            smallest = l;
        if (r < heapSize && arr[r] < arr[smallest])
            smallest = r;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            MinHeapify(smallest);
        }
    }

    void removeMin() {
        if (heapSize <= 0) {
            System.out.println("Heap is empty");
            return;
        }
        if (heapSize == 1) {
            heapSize--;
            return;
        }

        arr[0] = arr[heapSize - 1];
        heapSize--;
        MinHeapify(0);
    }

    void insertKey(int x) {
        if (heapSize == maxSize) {
            System.out.println("\nOverflow: Could not insertKey\n");
            return;
        }

        int i = heapSize;
        arr[i] = x;
        heapSize++;

        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(15);
        int elements[] = {3, 10, 12, 8, 2, 14};

        for (int e : elements)
            h.insertKey(e);

        System.out.println("The current size of the heap is " + h.curSize());
        System.out.println("The current minimum element is " + h.getMin());

        h.removeMin();
        System.out.println("The current size of the heap is " + h.curSize());

        // Inserting 2 new keys into the heap.
        h.insertKey(1);
        h.insertKey(5);
        System.out.println("The current size of the heap is " + h.curSize());
        System.out.println("The current minimum element is " + h.getMin());
    }
}


//JOB_DEADLINE

import java.util.*;

class GfG {

    static ArrayList<Integer> jobSequencing(int[] id, 
            int[] deadline, int[] profit) {
        int n = id.length;
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(0, 0));

        // pair the profit and deadline of
        // all the jobs together
        ArrayList<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{profit[i], deadline[i]});
        }

        // sort the jobs based on profit
        // in decreasing order
        jobs.sort((a, b) -> b[0] - a[0]);

        // array to store result of job sequence
        int[] result = new int[n];
        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {
            int start = Math.min(n, jobs.get(i)[1]) - 1;
            for (int j = start; j >= 0; j--) {

                // if slot is empty
                if (result[j] == -1) {
                    result[j] = i;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (result[i] != -1) {
                ans.set(1, ans.get(1) + jobs.get(result[i])[0]);
                ans.set(0, ans.get(0) + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] id = {1, 2, 3, 4, 5};
        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};
        ArrayList<Integer> ans = jobSequencing(id, deadline, profit);
        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}




//FCFS

#include<stdio.h> main()
{
int bt[20], wt[20], tat[20], i, n; float wtavg, tatavg;
printf("\nEnter the number of processes -- "); scanf("%d", &n);
for(i=0;i<n;i++)
{
printf("\nEnter Burst Time for Process %d -- ", i); scanf("%d", &bt[i]);
}
wt[0] = wtavg = 0; tat[0] = tatavg = bt[0]; for(i=1;i<n;i++)
{
wt[i] = wt[i-1] +bt[i-1];
tat[i] = tat[i-1] +bt[i]; wtavg = wtavg + wt[i]; tatavg = tatavg + tat[i];
}
 
printf("\t PROCESS \tBURST TIME \t WAITING TIME\t TURNAROUND TIME\n");
for(i=0;i<n;i++)
printf("\n\t P%d \t\t %d \t\t %d \t\t %d", i, bt[i], wt[i], tat[i]); printf("\nAverage Waiting Time -- %f", wtavg/n); printf("\nAverage Turnaround Time -- %f", tatavg/n);
}




