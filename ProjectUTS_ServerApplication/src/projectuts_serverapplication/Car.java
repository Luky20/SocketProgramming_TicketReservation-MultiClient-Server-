package projectuts_serverapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.ArrayList;
import java.util.Date;
import static projectuts_serverapplication.Plane._listPlane;
import static projectuts_serverapplication.Ship._listShip;

/**
 *
 * @author Luky
 */
public class Car extends Ticket{
    public static ArrayList<Car> _listCar;
    private String nama_mobil;

    
    private String tipeSeater;

    
    public Car(){
        setNama_mobil("");
        setTipeSeater("");
        
    }
    
    public Car(String nama_mobil, String tipe_seater){
        setNama_mobil(nama_mobil);
        setTipeSeater(tipe_seater);
    }
    public Car(String id, String ticket_name, String ticket_desc, Date ticket_date, int ticket_price, Date created_date, Date updated_date,
            String nama_mkobil, String tipeSeater) {
        super(id, ticket_name, ticket_desc, ticket_date, ticket_price, created_date, updated_date);
        setNama_mobil(nama_mkobil);
        setTipeSeater(tipeSeater);

        
    }
    
    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }
    
    public String getTipeSeater() {
        return tipeSeater;
    }

    public void setTipeSeater(String tipeSeater) {
        this.tipeSeater = tipeSeater;
    }

    
    
    @Override
    public void DisplayTicket() {
        System.out.println("Ticket's Information: ");
        super.DisplayTicket();
        System.out.println("Nama Mobil: " + getNama_mobil());
        System.out.println("Tipe Seater: " + getTipeSeater());
    }
    
    public static boolean CheckCar(String nama_mobil, String tipe_seater){
        for (Car car : _listCar) {
            if (car.getNama_mobil().equals(nama_mobil) && car.getTipeSeater().equals(tipe_seater)) {
                return true;
            }
        }
        return false;
    }
    
     public static boolean CheckTicket(String nama_tiket){
        for(Car car : _listCar){
            if (car.getTicket_name().equals(nama_tiket)) { 
                return true;
            }
        }
        return false;
    }
    
    public static String ambilDataTiket(){
        for(Car car : _listCar){
                return "KIRIMTIKET~" + car.getId() + "~" + car.getTicket_name() + "~" + car.getTicket_desc() + "~" + 
                        car.getTicket_date().toString() + "~" + String.valueOf(car.getTicket_price()) + "~" + car.getCreated_date().toString() + "~" + 
                        car.getUpdated_date().toString() + "~" + car.getNama_mobil()+ "~" + car.getTipeSeater()+ "~" + "\n";
            }
        return "";
        }
    public static Car getTicket(String id){
        for (Car c : _listCar) {
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
