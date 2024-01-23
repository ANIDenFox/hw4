public class hw4 {
    public static void main(String[] args) {
        int[] arr = {5,-3,-2,16,55,0};
        task1();
        task2();
        task3();
        task4();
        task5();
        task1Medium(arr);
        task2Medium();
        task3Medium(arr);
    }

    public static void task1() {
        for (int i = 1; i < 110; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        System.out.println(" ");
        for (int i = 90; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println(" ");
        int num = 2;
        for (int i = 1; i <= 20; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
    }

    public static void task4() {
        System.out.println(" ");
        for (int i = -29; i < 10; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
    }

    public static void task5() {
        System.out.println(" ");
        int sum = 0;
        int count = 0;
        for (int i = 50; i < 150; i++) {
            sum += i;
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.print("Сума чисел  " + sum + "; ");
        System.out.print("Кількість парних чисел " + count);
    }

    public static void task1Medium(int[] arr) {
        System.out.println(" ");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (max < arr[i]) {
                max = arr[i];
            }
        System.out.print("Найбільше значення в масиві: " + max);
    }

    public static void task2Medium() {
        System.out.println(" ");
        int n = 11;
        int fir = 1;
        int sec = 1;
        System.out.print("Перші " + n + " членів послідовності Фібоначчі: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fir + ", ");
            int sum = fir + sec;
            fir = sec;
            sec = sum;
        }
    }

    public static void task3Medium(int [] arr) {
        System.out.println(" ");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 0) {
                sum += num;
                count++;
            }
        }
        System.out.println("Сума позитивних чисел: " + sum);
        System.out.println("Кількість позитивних чисел: " + count);
    }
}