/**
 * 
 */
package TrainningOOP;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class Main {

        private static Scanner scanner;

        /**
         * @param args
         */
        /**
        *user:admin
        *date:Nov 16, 2018
        *project_name:OOP
        *description:
        *modifier:admin
        *date_modify:Nov 16, 2018
        * @param args
        */
        public static void main(String[] args) {
                // TODO Auto-generated method stub
                double chieuDai;
                double chieuRong;
                scanner = new Scanner(System.in);
                System.out.println("Nhap chieu dai cua HCN: ");
                chieuDai = scanner.nextDouble();
                while (chieuDai < 0) {
                        System.out.println("Chieu dai cua HCN phai la so duong. Please nhap lai!!");
                        chieuDai = scanner.nextDouble();
                }
                System.out.println("Nhap chieu rong cua HCN: ");
                chieuRong = scanner.nextDouble();
                while (chieuRong < 0) {
                        System.out.println("Chieu rong cua HCN phai la so duong. Please nhap lai!!");
                        chieuRong = scanner.nextDouble();
                }
                // Tinh dien tich va chu vi hinh chu nhat
                Rectangle rec = new Rectangle(chieuDai, chieuRong);
                rec.dienTich();
                rec.chuVi();
                System.out.println("=============================");
                // Tinh dien tich chu vi hinh vuong
                Square sq = new Square(chieuDai, chieuDai);
                sq.dienTich();
                sq.chuVi();

                System.out.println("=============================");
                // Tinh dien tich va chu vi hinh tam giac
                double a;
                double b;
                double c;
                System.out.println("Nhap chieu dai 3 canh cua tam giac: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                while (a < 0) {
                        System.out.println("Chieu dai canh tam giac phai la so duong. Please nhap lai!!");
                        a = scanner.nextDouble();
                }
                while (b < 0) {
                        System.out.println("Chieu dai canh tam giac phai la so duong. Please nhap lai!!");
                        b = scanner.nextDouble();
                }
                while (c < 0) {
                        System.out.println("Chieu dai canh tam giac phai la so duong. Please nhap lai!!");
                        c = scanner.nextDouble();
                }
                Triangle tri = new Triangle(a, b, c);
                tri.dienTich();
                tri.chuVi();

                System.out.println("=============================");
                // Tinh dien tich va chu vi hinh tron
                double banKinh;
                System.out.println("Nhap ban kinh hinh tron: ");
                banKinh = scanner.nextDouble();
                Circle cir = new Circle(banKinh);
                cir.dienTich();
                cir.chuVi();
        }

}
