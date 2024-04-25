/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuts_serverapplication;


import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Luky
 */
public class Reservation {
    public static ArrayList<Reservation> _listReservation = new ArrayList<Reservation>();
    private User pengguna;
    private Ticket tiket;
    private int qty;
    private Date created_date;
    private Date updated_date;
    
    public Reservation (){
        setPengguna(new User());
        setTiket(new Ticket());
        setQty(0);
        setCreated_date(new Date());
        setUpdated_date(new Date());
    }
    
    public Reservation(User pengguna, Ticket tiket, int qty, Date created_date, Date updated_date) {
        setPengguna(pengguna);
        setTiket(tiket);
        setQty(qty);
        setCreated_date(created_date);
        setUpdated_date(updated_date);
    }

    public User getPengguna() {
        return pengguna;
    }

    public void setPengguna(User pengguna) {
        this.pengguna = pengguna;
    }

    public Ticket getTiket() {
        return tiket;
    }

    public void setTiket(Ticket tiket) {
        this.tiket = tiket;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
    
    public static Reservation AmbilDataReservasi(String id) {
        for (Reservation r : _listReservation){
            if (r.getPengguna().getId().equals(id)) {
                return r;
            }
        }
        return null;
    }
    
    
        
}
