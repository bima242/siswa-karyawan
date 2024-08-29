//object class 

import java.util.Scanner;

public class Karyawan {
    int id;
    String nama, unit, alamat;

    //Constructor Parameter
    public Karyawan(int id, String nama, String unit, String alamat) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }

    //method print
    public void print() {
        System.out.println("ID : "+ id);
        System.out.println("Nama : "+ nama);
        System.out.println("Unit : "+ unit);
        System.out.println("Alamat : "+ alamat);

        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan nama siswa");
        String nama = input.nextLine();
        System.out.println("inputkan id siswa");
        int id = input.nextInt();
        System.out.println("inputkan IPk");
        double ipk = input.nextDouble();
    }
   
    
    }


    

    

