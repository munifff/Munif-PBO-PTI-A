package tugasSoal;

//import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNoKTP(){
        return noKTP;
    }
    
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP());
    }
    
    public abstract double earnings();//pendapatan
}

//NO 4

// public abstract class Employee {
//     private String name;
//     private String noKTP;
//     private LocalDate tanggalLahir;
    
//     public Employee(String name, String noKTP, LocalDate tanggalLahir){
//         this.name = name;
//         this.noKTP = noKTP;
//         this.tanggalLahir = tanggalLahir;
//     }
    
//     public String getName(){
//         return name;
//     }
    
//     public String getNoKTP(){
//         return noKTP;
//     }
    
//     public LocalDate getTanggalLahir() {
//         return tanggalLahir;
//     }
    
//     public void setTanggalLahir(LocalDate tanggalLahir) {
//         this.tanggalLahir = tanggalLahir;
//     }
    
//     public String toString(){
//         return String.format("Nama: %s\nNo. KTP: %s\nTanggal Lahir: %s", getName(), getNoKTP(), getTanggalLahir());
//     }
    
//     public abstract double earnings();//pendapatan
// }