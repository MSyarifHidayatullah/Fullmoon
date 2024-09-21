import java.util.Scanner;
public class InputMahasiswa {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String nama,nim,ps;
   //input
    System.out.println("========Input========");
    System.out.print("Nama");
    nama = in.nextLine();
    System.out.print("NIM");
    nim = in.nextLine();
    System.out.print("Program Studi");
    ps = in.nextLine();
    System.out.println();
    System.out.println("========Output=======");
    System.out.print ("Hai" + nama+ "anda terdaftar dengan NIM:" + nim + "diProgram Studi" + ps );

    


}

private static void nextLine() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'nextLine'");
}
    
}
