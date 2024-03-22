import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so x:");
        int x = scanner.nextInt();
        System.out.println("Nhap so y:");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    void calculate(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Khong the chia cho 0");
            }
            else {
                int a = x + y;
                int b = x - y;
                int c = x * y;
                int d = x / y;
                System.out.println("Tong x + y =" + a);
                System.out.println("Hieu x - y =" + b);
                System.out.println("Tich x * y =" + c);
                System.out.println("Thuong x / y =" + d);
            }
        }
        catch (Exception e){
            System.out.println("Xay ra ngoai le:" + e.getMessage());
        }
    }
}
