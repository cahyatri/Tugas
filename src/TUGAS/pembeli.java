/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author MPC
 */
 class pembeli {
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat;
    private String no_tlp;
    public pembeli(int id_pembeli,String nama_pembeli,String alamat,String no_tlp)
{
   this.id_pembeli = id_pembeli;
   this.nama_pembeli = nama_pembeli;
   this.alamat = alamat;
   this.no_tlp = no_tlp;
}

public void tampilkan()
{

System.out.println("------------------------------");
System.out.println("Id pembeli   : " +this.id_pembeli);
System.out.println("Nama pembeli : " +this.nama_pembeli);
System.out.println("Alamat       : " +this.alamat);
System.out.println("No.telepon   : " +this.no_tlp);


}
}
 class kasir extends pembeli  
 {
    private String nama_kasir;
    private String tgl;
    
    public kasir(String nama_kasir,String tgl,int id_pembeli,String nama_pembeli,String alamat,String no_tlp)
    {
        super(id_pembeli,nama_pembeli,alamat,no_tlp);
        this.nama_kasir = nama_kasir;
        this.tgl = tgl;
    }
    public void tampilkan()
{
System.out.println(" Data Transaksi");
System.out.println("------------------------------");
System.out.println("Nama kasir   : " +this.nama_kasir);
System.out.println("Tanggal      : " +this.tgl);
super.tampilkan();
 }
}
class barang extends kasir{
     private int id_barang;
    private String nama_barang;
    private int harga_barang;
    private String merk_barang;
public barang(int id_barang,String nama_barang,int harga_barang,String merk_barang,String nama_kasir,String tgl,int id_pembeli,String nama_pembeli,String alamat,String no_tlp)
{
   super(nama_kasir,tgl, id_pembeli,nama_pembeli,alamat,no_tlp);
   System.out.println();
   this.id_barang = id_barang;
   this.nama_barang = nama_barang;
   this.harga_barang = harga_barang;
   this.merk_barang = merk_barang;
}

public void tampilkan()
{
super.tampilkan(); 
System.out.println("------------------------------");
System.out.println("Id barang    : " +this.id_barang);
System.out.println("Nama barang  : " +this.nama_barang);
System.out.println("Harga barang : " +this.harga_barang);
System.out.println("Merk barang  : " +this.merk_barang);
}
public void total(){
        System.out.println("------------------------------");
        System.out.println("Harga Total  : " + harga_barang);
    }
}
