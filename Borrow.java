

public class Borrow {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập vào số tiền vay: ");
        int money = scanner.nextInt();
        System.out.println("NHập vào lãi suất 1 năm :");
        double bankRate = scanner.nextDouble();
        System.out.println("Nhập vào số tháng vay :");
        int month = scanner.nextInt();

        double total = money * bankRate / 12 * month;
        System.out.println("Tổng số tiền phải trả :" +total);

    }
}
