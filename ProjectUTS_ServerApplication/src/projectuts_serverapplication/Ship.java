/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuts_serverapplication;


import java.util.ArrayList;
import java.util.Date;
import static projectuts_serverapplication.Train._listTrain;

/**
 *
 * @author Luky
 */
public class Ship extends Ticket{
    public static ArrayList<Ship> _listShip;
    private String pelabuhan_asal;
    private String pelabuhan_tujuan;
    private String layanan;
    
    public Ship(){
        setPelabuhan_asal("");
        setPelabuhan_tujuan("");
        setLayanan("");
    }
    public Ship(String pelabuhan_asal, String pelabuhan_tujuan, String layanan){
        setPelabuhan_asal(pelabuhan_asal);
        setPelabuhan_tujuan(pelabuhan_tujuan);
        setLayanan(layanan);
    }
    public Ship(String id, String ticket_name, String ticket_desc, Date ticket_date, int ticket_price, Date created_date, Date updated_date,
            String pelabuhan_asal, String pelabuhan_tujuan, String layanan) {
        super(id, ticket_name, ticket_desc, ticket_date, ticket_price, created_date, updated_date);
        setPelabuhan_asal(pelabuhan_asal);
        setPelabuhan_tujuan(pelabuhan_tujuan);
        setLayanan(layanan);
    }
    public String getPelabuhan_asal() {
        return pelabuhan_asal;
    }

    public void setPelabuhan_asal(String pelabuhan_asal) {
        this.pelabuhan_asal = pelabuhan_asal;
    }

    public String getPelabuhan_tujuan() {
        return pelabuhan_tujuan;
    }

    public void setPelabuhan_tujuan(String pelabuhan_tujuan) {
        this.pelabuhan_tujuan = pelabuhan_tujuan;
    }
    
    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    @Override
    public void DisplayTicket() {
        System.out.println("Ticket's Information: ");
        super.DisplayTicket();
        System.out.println("Pelabuhan Asal: " + getPelabuhan_asal());
        System.out.println("Pelabuhan Tujuan: " + getPelabuhan_tujuan());
        System.out.println("Layanan: " + getLayanan());
    }
    
    public static boolean CheckShip(String pelabuhan_asal, String pelabuhan_tujuan){
        for (Ship ship : _listShip) {
            if (ship.getPelabuhan_asal().equals(pelabuhan_asal) && ship.getPelabuhan_tujuan().equals(pelabuhan_tujuan)) {
                return true;
            }
        }
        return false;
    }
    public static boolean CheckTicket(String nama_tiket){
        for(Ship ship : _listShip){
            if (ship.getTicket_name().equals(nama_tiket)) { 
                return true;
            }
        }
        return false;
    }
    
    public static String ambilDataTiket(){
        for(Ship ship : _listShip){
                return "KIRIMTIKET~" + ship.getId() + "~" + ship.getTicket_name() + "~" + ship.getTicket_desc() + "~" + 
                        ship.getTicket_date().toString() + "~" + String.valueOf(ship.getTicket_price()) + "~" + ship.getCreated_date().toString() + "~" + 
                        ship.getUpdated_date().toString() + "~" + ship.getPelabuhan_asal()+ "~" + ship.getPelabuhan_tujuan()+ "~" + ship.getLayanan()+ "~" + "\n";
            }
        return "";
        }
    public static Ship getTicket(String id){
        for (Ship s : _listShip) {
            if(s.getId().equals(id)){
                return s;
            }
            
        }
        return null;
    }
}
