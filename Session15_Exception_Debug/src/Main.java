import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu nhat: ");
        int firstNumber = validateInputNumber(sc);
        System.out.println("Nhap vao so nguyen thu hai:");
        int secondNumber = validateInputNumber(sc);
        int div = 0;
        try {
            //Bat cac exception xay ra trong khoi lenh, khi exception xay ra --> catch de xu ly
            div = divide(firstNumber,secondNumber);
            System.out.println("xin chao");
            System.out.println("xin chao");
            System.out.println("xin chao");
            System.out.println("xin chao");
        } catch (IndexOutOfBoundsException ex1) {
            ex1.printStackTrace();
        } finally {
            //Du co exception hay khong thi cung vao finally
            System.out.println("Ket thuc chuong trinh");
        }
        System.out.println("Thuong cua 2 so nguyen la: " + div);
    }

    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException{
//        if (secondNumber==0){
//            throw new ArithmeticException("Loi chia cho 0");
//        }
        int result = firstNumber/secondNumber;
        return result;
    }

    public static int validateInputNumber(Scanner sc){
        int num;
        do {
            try {
                num = Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException ex){
                System.err.println("Vui long nhap vao mot so nguyen: ");
            }
        }while(true);
        return num;
    }
}