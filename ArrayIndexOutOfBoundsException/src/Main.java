import java.util.Scanner;

public class Main {
    public static <ArrayExample> void main(String[] args) {
        CreateRandom CreateRandom = new CreateRandom();
        Integer[] arr;
        arr = CreateRandom.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}