/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12151473perabotrt;

import java.util.Scanner;

/**
 *
 * @author Dank Arif
 */
public class tokoperabotRT {

  private static Object scan;

    public static void main(String[] args) {
        // TODO code application logic here
        perabot entityObjk =new perabot();
        QueryPrabot update = new QueryPrabot();
        Scanner input=new Scanner(System.in);
        String t,p,q,r,s,jawab;
        String pertanyaan;
        long id = 0;
        
        System.out.println("|+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+|");
        System.out.println("|TOKO PERABOTAN RUMAH TANGGA BERKAH|");
        System.out.println("|+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+|");
        
        System.out.println("=======================================================================");
        System.out.println("1.Tambah Data pembeli | 2. Edit Data pembeli | 3.Delete data pembeli");
        System.out.println("=======================================================================");
        
        System.out.print("Tentukan lah pilihanmu 1/2/3 : ");
        jawab = input.nextLine();
        if(jawab.equals("1")){
            System.out.print("Kode Barang :"); p =input.nextLine();
            System.out.print("Nama Pembeli :"); q =input.nextLine();
            System.out.print("Alamat Pembeli :"); r =input.nextLine();
            System.out.print("Nomer Telepon Pembeli:"); s = input.nextLine();
            System.out.print("Nama barang :"); t =input.nextLine();
            entityObjk.setKd_barang(p);
            entityObjk.setNama(q);
            entityObjk.setAlamat(r);
            entityObjk.setNo_telp(s);
            entityObjk.setNama_barang(t);
            update.Add(entityObjk);}
            update.Show();
        if(jawab.equals("2")){
                System.out.print("Kode Barang :");p = input.nextLine();
                System.out.print("Nama pembeli :");q = input.nextLine();
                System.out.print("Alamat :");r = input.nextLine();
                System.out.print("No Telepon :");s = input.nextLine();
                System.out.print("Nama Barang :");t = input.nextLine();
                update.update(id, p, q, r, s,t);
                System.out.println("kode barang "+p+" Dengan nama "+t+" berhasil Dirubah");
                System.out.println("");}update.Show();
        if(jawab.equals("3")){
                    System.out.print("Kode Barang :"); p = input.nextLine();
                    update.Delete(p);
                    System.out.println("Kode Barang "+p+" berhasil dihapus");
                    update.Show();
        }
   }
}