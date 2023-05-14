import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(1000), "Element " + i);
            table.put(key, "Value " + i);
        }

        int[] bucketSize = table.getBucketSize();
        // Print the number of elements in each bucket
        for (int i = 0; i < bucketSize.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSize[i] + " elements");
        }
    }
}
