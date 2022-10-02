class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Print the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int rev;

        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
        for (int i =0; i< arr.length/2; i++) {
            rev=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=rev;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
    }
}