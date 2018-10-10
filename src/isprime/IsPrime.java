package isprime;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int i = 2;
        boolean check = true;
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        number = sc.nextInt();

        while (i < Math.sqrt(number)){
            if (number % i == 0){
                check = false;
                break;
            }
            i++;
        }
        if (check){
            System.out.println(number + " là số nguyên tố");
        }else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
