/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuts_serverapplication;


import java.util.ArrayList;
import java.util.Date;
import static projectuts_serverapplication.Plane._listPlane;

/**
 *
 * @author Luky
 */
public class Train extends Ticket {
    public static ArrayList<Train> _listTrain;
    private String stasiun_asal;
    private String stasiun_tujuan;
    private String kelas;
    
    public Train (){
        setStasiun_asal("");
        setStasiun_tujuan("");
        setKelas("");
    }
    public Train(String stasiun_asal, String stasiun_tujuan, String kelas){
        setStasiun_asal(stasiun_asal);
        setStasiun_tujuan(stasiun_tujuan);
        setKelas(kelas);
    }
    public Train(String id, String ticket_name, String ticket_desc, Date ticket_date, int ticket_price, Date created_date, Date updated_date,
            String stasiun_asal, String stasiun_tujuan, String kelas) {
        super(id, ticket_name, ticket_desc, ticket_date, ticket_price, created_date, updated_date);
        setStasiun_asal(stasiun_asal);
        setStasiun_tujuan(stasiun_tujuan);
        setKelas(kelas);
    }
    
    public String getStasiun_asal() {
        return stasiun_asal;
    }

    public void setStasiun_asal(String stasiun_asal) {
        this.stasiun_asal = stasiun_asal;
    }

    public String getStasiun_tujuan() {
        return stasiun_tujuan;
    }

    public void setStasiun_tujuan(String stasiun_tujuan) {
        this.stasiun_tujuan = stasiun_tujuan;
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
        System.out.println("Stasiun Asal: " + getStasiun_asal());
        System.out.println("Stasiun Tujuan: " + getStasiun_tujuan());
        System.out.println("Stasiun Tujuan: " + getKelas());
    }
    
    public static boolean CheckTrain(String stasiun_asal, String stasiun_tujuan){
        for (Train train : _listTrain) {
            if (train.getStasiun_asal().equals(stasiun_asal) && train.getStasiun_tujuan().equals(stasiun_tujuan)) {
                return true;
            }
        }
        return false;
    }
    public static boolean CheckTicket(String nama_tiket){
        for(Train train : _listTrain){
            if (train.getTicket_name().equals(nama_tiket)) { 
                return true;
            }
        }
        return false;
    }
    
    public static String ambilDataTiket(){
        for(Train train : _listTrain){
                return "KIRIMTIKET~" + train.getId() + "~" + train.getTicket_name() + "~" + train.getTicket_desc() + "~" + 
                        train.getTicket_date().toString() + "~" + String.valueOf(train.getTicket_price()) + "~" + train.getCreated_date().toString() + "~" + 
                        train.getUpdated_date().toString() + "~" + train.getStasiun_asal()+ "~" + train.getStasiun_tujuan()+ "~" + train.getKelas() + "~" + "\n";
            }
        return "";
    }
    public static Train getTicket(String id){
        for (Train t : _listTrain) {
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
}
