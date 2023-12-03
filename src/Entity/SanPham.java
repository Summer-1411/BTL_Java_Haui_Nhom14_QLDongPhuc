/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

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
    
    
    
}
