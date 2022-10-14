import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập vào cạnh thứ nhất!");
            double fistEdge = inputEdge(scanner);
            System.out.println("Nhập vào cạnh thứ hai!");
            double secondEdge = inputEdge(scanner);
            System.out.println("Nhập vào cạnh thứ ba!");
            double thirdEdge= inputEdge(scanner);
            if ()
        }catch (Exception e){

        }
    }
    public static double inputEdge (Scanner scanner){
        double a = 0;
        while (true){
            try {
                a = Double.parseDouble(scanner.nextLine());
                if (a>0){
                    break;
                }else {
                    System.err.println("Nhập vào số lớn hơn 0");
                }
            }catch (NumberFormatException e){
                System.err.println("Vui lòng nhập vào số!!!");
            }
        }

        return a;
    }
}