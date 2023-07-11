public class Span {
    public static void main(String[] args) {
        // int arr[] = {1,2,4,0,5};
        int arr[] = {3,2,4,6,7};
        int n=arr.length;
        int max=-1;
        // int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max<arr[i])
            max=arr[i];
        }
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
               min=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        int span = max-min;
        
        System.out.println("Span is "+span);
    }
}

