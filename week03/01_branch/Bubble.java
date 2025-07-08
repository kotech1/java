// Bubble.java
class Bubble {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 4, 3 };
        int size = arr.length; // 배열의 길이 

        // 버블 정렬
        for (int step = 0; step < size-1; step++)
            for (int i = 0; i < size-1-step; i++) 
                // 왼쪽이 오른쪽보다 크면
                if (arr[i] > arr[i+1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

        // 결과 출력
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }
}
