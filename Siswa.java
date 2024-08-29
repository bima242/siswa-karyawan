// Driver Class
public class Siswa {
    int id;
    String Nama;
    double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

// Constructor
// nama harus sama dgn Class
public Siswa() {
    id = 0;
Nama = "kosong";
ipk = 0.0;

}

//Constructor Parameter
public Siswa(int id, String nama, double
ipk) {

//variabel = parameter
this.id = id;
this.Nama = nama;
this.ipk = ipk;
}

//method print 
public void print() {
    System.out.println("ID : "+ id);
    System.out.println("NAMA : "+ Nama);
    System.out.println("IPK : "+ ipk );






}
    
}