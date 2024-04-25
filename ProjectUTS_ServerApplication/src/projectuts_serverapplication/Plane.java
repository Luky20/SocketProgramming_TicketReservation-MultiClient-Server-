package projectuts_serverapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Date;
import static projectuts_serverapplication.User._daftarUser;

/**
 *
 * @author Luky
 */
public class Plane extends Ticket{
    public static ArrayList<Plane> _listPlane;
    private String no_penerbangan;
    private String bandara_asal;
    private String bandara_tujuan;
    private String kelas;
    
    
    
    public Plane(){
        setNo_penerbangan("");
        setBandara_asal("");
        setBandara_tujuan("");
        setKelas("");
        
    }
    public Plane(String no_penerbangan, String bandara_asal, String bandara_tujuan, String kelas){
        setNo_penerbangan(no_penerbangan);
        setBandara_asal(bandara_asal);
        setBandara_tujuan(bandara_tujuan);
        setKelas(kelas);
    }
    
    public Plane(String id, String ticket_name, String ticket_desc, Date ticket_date, int ticket_price, Date created_date, Date updated_date, 
            String no_penerbangan, String bandara_asal, String bandara_tujuan, String kelas) {
        super(id, ticket_name, ticket_desc, ticket_date, ticket_price, created_date, updated_date);
        setNo_penerbangan(no_penerbangan);
        setBandara_asal(bandara_asal);
        setBandara_tujuan(bandara_tujuan);
        setKelas(kelas);
    }
    
    public String getNo_penerbangan() {
        return no_penerbangan;
    }

    public void setNo_penerbangan(String no_penerbangan) {
        this.no_penerbangan = no_penerbangan;
    }

    public String getBandara_asal() {
        return bandara_asal;
    }

    public void setBandara_asal(String bandara_asal) {
        this.bandara_asal = bandara_asal;
    }

    public String getBandara_tujuan() {
        return bandara_tujuan;
    }

    public void setBandara_tujuan(String bandara_tujuan) {
        this.bandara_tujuan = bandara_tujuan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public void DisplayTicket() {
        System.out.println("Ticket's Information: ");
        super.DisplayTicket();
        System.out.println("No Penerbangan: " + getNo_penerbangan());
        System.out.println("Bandara Asal: " + getBandara_asal());
        System.out.println("Bandara Tujuan: " + getBandara_tujuan());
        System.out.println("Kelas: " + getKelas());
    }
    public static boolean CheckPlane(String bandara_asal, String bandara_tujuan){
        for (Plane plane : _listPlane) {
            if (plane.getBandara_asal().equals(bandara_asal) && plane.getBandara_tujuan().equals(bandara_tujuan)) {
                return true;
            }
        }
        return false;
    }
    public static boolean CheckTicket(String nama_tiket){
        for(Plane plane : _listPlane){
            if (plane.getTicket_name().equals(nama_tiket)) { 
                return true;
            }
        }
        return false;
    }
    
    public static String ambilDataTiket(){
        for(Plane plane : _listPlane){
                return "KIRIMTIKET~" + plane.getId() + "~" + plane.getTicket_name() + "~" + plane.getTicket_desc() + "~" + 
                        plane.getTicket_date().toString() + "~" + String.valueOf(plane.getTicket_price()) + "~" + plane.getCreated_date().toString() + "~" + 
                        plane.getUpdated_date().toString() + "~" + plane.getBandara_asal() + "~" + plane.getBandara_tujuan() + "~" + plane.getKelas() + "~" + "\n";
            }
        return "";
    }
    
    public static Plane getTicket(String id){
        for (Plane p : _listPlane) {
            if(p.getId().equals(id)){
                return p;
            }
            
        }
        return null;
    }
}
