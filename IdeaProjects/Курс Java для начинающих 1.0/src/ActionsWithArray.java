public class ActionsWithArray {
    public static void main(String[] args) {
        //задать массив из 5 любых целых чисел
        int[] arr = {1, 2, 3, 4, 5};
        //поменять местами 1 и последний элементы
        int addVar = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = addVar;
        //вывести сумму первого и среднего элементов
        int sum = arr[0] + arr[arr.length/2];
        System.out.println("Сумма первого и среднего элементов: " + sum);
    }
}
