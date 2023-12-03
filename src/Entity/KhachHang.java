package Entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class KhachHang {
    
    private String maKh;
    private String hoTen;
    private String diaChi;
    private String email;
    private String soDT;
    private String maLop;
    private String ngaySinh;
    private String lienKhoa;

  

    public KhachHang() {
        this.maKh = "";
        this.hoTen = "";
        this.diaChi="";
        this.email="";
        this.soDT = "";
        this.maLop="";
        this.ngaySinh = "";
        this.lienKhoa ="";
    }

    public KhachHang(String maKh, String hoTen, String diaChi, String email, String soDT, String maLop, String ngaySinh, String lienKhoa) {
        this.maKh = maKh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.soDT = soDT;
        this.maLop = maLop;
        this.ngaySinh = ngaySinh;
        this.lienKhoa = lienKhoa;
    }

    

    @Override
    public String toString() {
        return this.maKh+","+this.hoTen+","+this.diaChi+","+this.email+","+this.soDT+","+this.maLop+","+this.ngaySinh+","+this.lienKhoa;
    }

    public static ArrayList<KhachHang> getNhanVienList() {
        ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
        String fileName = "CSDL\\KhachHang.txt";
        String line;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");
                String maKh = fields[0];
                String hoTen = fields[1];
                String diaChi = fields[2];
                String email = fields[3];
                String soDt = fields[4];
                String maLop =fields[5];
                String ngaySinh = fields[6];
                String lienKhoa =fields[7];
                KhachHang nv = new KhachHang(maKh, hoTen, diaChi, email, soDt, maLop, ngaySinh, lienKhoa);
                listKH.add(nv);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName);
        }
        return listKH;
    }
}
