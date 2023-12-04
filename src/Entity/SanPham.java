/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class SanPham {
    private String maSp;
    private String tenSp;
    private String size;
    private double donGia;
    private int soLuongCon;

    public SanPham(String maSp, String tenSp, String size, double donGia, int soLuongCon) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.size = size;
        this.donGia = donGia;
        this.soLuongCon = soLuongCon;
    }

    public SanPham() {
        this.maSp = "";
        this.tenSp = "";
        this.size = "";
        this.donGia = 0;
        this.soLuongCon = 0;
    }
    

    
    @Override
    public String toString() {
        return this.maSp+","+this.tenSp+","+this.size+","+this.donGia+","+this.soLuongCon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSp);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SanPham otherSp = (SanPham) obj;
        return Objects.equals(maSp, otherSp.maSp);
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public String getSize() {
        return size;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }
    //get data from database
    public static List<SanPham> getSanPhamList() {
        List<SanPham> listSP = new ArrayList<SanPham>();
        String fileName = "CSDL\\SanPham.txt";
        String line;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");
                String maSP = fields[0];
                String tenSP = fields[1];
                String size = fields[2];
                double donGia = Double.parseDouble(fields[3]);
                int soLuongCon = Integer.parseInt(fields[4]);
                
                
                SanPham SP = new SanPham(maSP, tenSP, size, donGia, soLuongCon);
                listSP.add(SP);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName);
        }
        return listSP;
    }
    
    
}
