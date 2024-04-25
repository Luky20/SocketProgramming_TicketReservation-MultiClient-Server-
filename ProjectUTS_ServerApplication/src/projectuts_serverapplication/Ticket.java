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
public class Ticket {
    public static ArrayList<Ticket> _listTiket;
    private String id;
    private String ticket_name;
    private String ticket_desc;
    private Date ticket_date;
    private int ticket_price;
    private Date created_date;
    private Date updated_date;

    public Ticket(){
        setId("");
        setTicket_name("");
        setTicket_desc("");
        setTicket_date(new Date());
        setTicket_price(1);
        setCreated_date(new Date());
        setUpdated_date(new Date());
    }
    public Ticket(String id, String ticket_name, String ticket_desc, Date ticket_date, int ticket_price, Date created_date, Date updated_date) {
        setId(id);
        setTicket_name(ticket_name);
        setTicket_desc(ticket_desc);
        setTicket_date(ticket_date);
        setTicket_price(ticket_price);
        setCreated_date(created_date);
        setUpdated_date(updated_date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicket_name() {
        return ticket_name;
    }

    public void setTicket_name(String ticket_name) {
        this.ticket_name = ticket_name;
    }

    public String getTicket_desc() {
        return ticket_desc;
    }

    public void setTicket_desc(String ticket_desc) {
        this.ticket_desc = ticket_desc;
    }

    public Date getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(Date ticket_date) {
        this.ticket_date = ticket_date;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
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
    
    public void DisplayTicket(){
        System.out.println("ID: " + getId());
        System.out.println("Ticket's Name: " + getTicket_name());
        System.out.println("Ticket's Desc: " + getTicket_desc());
        System.out.println("Ticket's Date: " + getTicket_date());
        System.out.println("Ticket's Price: " + getTicket_price());
        System.out.println("Created Date: " + getCreated_date());
        System.out.println("Updated Date: " + getUpdated_date());
    }
    
    
}
