public class arrays {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        float sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("—умма трат за мес€ц составила " + sum + " рублей.");
        int max = 0;
        int min = 4522695;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("ћаксимальна€ сумма трат за день составила " + max + " рублей.");
        System.out.println("ћинимальна€ сумма трат за день составила " + min + " рублей.");
        float averageAmountPerMonth = sum / arr.length;
        System.out.println("—редн€€ сумма трат за мес€ц составила " + averageAmountPerMonth + " рублейї.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int x = reverseFullName.length;
        while (x <= reverseFullName.length && x > 0) {
            x = x - 1;
            System.out.print(reverseFullName[x]);
        }
    }
}


