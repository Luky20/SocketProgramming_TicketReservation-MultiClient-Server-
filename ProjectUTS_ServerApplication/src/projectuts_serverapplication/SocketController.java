/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuts_serverapplication;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
/**
 *
 * @author Luky
 */
public class SocketController extends Thread{
    public static ArrayList<SocketController> _clientsList;
    
    private Socket commChannel;
    private BufferedReader fromClient;
    private DataOutputStream toClient;
    private User userLogin;

    public SocketController(Socket commChannel) throws IOException{
        this.commChannel = commChannel;
        fromClient = new BufferedReader(new InputStreamReader(commChannel.getInputStream()));
        toClient = new DataOutputStream(commChannel.getOutputStream());
        _clientsList.add(this);
    }

    
    public void getChat() throws IOException, ParseException{
        String message = fromClient.readLine();
        String command = message;
        String[] commands = command.split("~");
        if (commands[0].equals("LOGIN")){
            userLogin = User.userLogin(commands[1], commands[2]);
            
            if (userLogin != null) { 
                toClient.writeBytes("TRUE\n");
            }
            else toClient.writeBytes("FALSE\n");
        }
        else if (commands[0].equals("REGISTER")){
            boolean tmp;
            tmp = User.CheckRegister(commands[2], commands[3]);
            if (tmp){ 
                SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                Date dateTanggalLahir = dateFormat.parse(commands[5]);
                User._daftarUser.add(new User("1", commands[1], commands[2], commands[3], commands[4], dateTanggalLahir, commands[6]));
                toClient.writeBytes("TRUE\n");
            }
            else toClient.writeBytes("FALSE\n");
        }
        else if(commands[0].equals("FINDPLANE")){
            boolean tmp;
            tmp = Plane.CheckPlane(commands[1], commands[2]);
            if(tmp){
                toClient.writeBytes("TRUE\n");
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
        }
        else if (commands[0].equals("FINDTRAIN")){
            boolean tmp;
            
            tmp = Train.CheckTrain(commands[1], commands[2]);
            if(tmp){
                toClient.writeBytes("TRUE\n");
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
        }
        else if (commands[0].equals("FINDSHIP")){
            boolean tmp;
            
            tmp = Ship.CheckShip(commands[1], commands[2]);
            if(tmp){
                toClient.writeBytes("TRUE\n");
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
        }
        else if (commands[0].equals("FINDCAR")){
            boolean tmp;
            
            tmp = Car.CheckCar(commands[1], commands[2]);
            if(tmp){
                toClient.writeBytes("TRUE\n");
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
        }
        else if (commands[0].equals("AMBILTIKETPESAWAT")){
            boolean tmp;
            
            tmp = Plane.CheckTicket(commands[1]);
            if(tmp){
                toClient.writeBytes(Plane.ambilDataTiket());
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
            
        }
        
        else if (commands[0].equals("AMBILTIKETKERETA")){
            boolean tmp;
            
            tmp = Train.CheckTicket(commands[1]);
            if(tmp){
                toClient.writeBytes(Train.ambilDataTiket());
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
            
        }
        else if (commands[0].equals("AMBILTIKETKAPAL")){
            boolean tmp;
            
            tmp = Ship.CheckTicket(commands[1]);
            if(tmp){
                toClient.writeBytes(Ship.ambilDataTiket());
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
            
        }
        else if (commands[0].equals("AMBILTIKETMOBIL")){
            boolean tmp;
            
            tmp = Car.CheckTicket(commands[1]);
            if(tmp){
                toClient.writeBytes(Car.ambilDataTiket());
            }
            else {
                toClient.writeBytes("FALSE\n");
            }
            
        }
        else if (commands[0].equals("RESERVEPESAWAT")){
            Plane p = Plane.getTicket(commands[1]);
            Reservation._listReservation.add(new Reservation(this.userLogin, p, 1, new Date(), new Date()));
            toClient.writeBytes("TRUE\n");
        }
        else if (commands[0].equals("RESERVEKERETA")){
            Train t = Train.getTicket(commands[1]);
            Reservation._listReservation.add(new Reservation(this.userLogin, t, 1, new Date(), new Date()));
            toClient.writeBytes("TRUE\n");
        }
        else if (commands[0].equals("RESERVEKAPAL")){
            Ship s = Ship.getTicket(commands[1]);
            Reservation._listReservation.add(new Reservation(this.userLogin, s, 1, new Date(), new Date()));
            toClient.writeBytes("TRUE\n");
        }
        else if (commands[0].equals("RESERVEMOBIL")){
            Car c = Car.getTicket(commands[1]);
            Reservation._listReservation.add(new Reservation(this.userLogin, c, 1, new Date(), new Date()));
            toClient.writeBytes("TRUE\n");
        }
        
        
    }   
    
    public static void broadcast(String message) {
        for(SocketController client : _clientsList){
            try {
                client.getChat();
            } catch (IOException ex) {
                Logger.getLogger(ProjectUTS_ServerApplication1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ProjectUTS_ServerApplication1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run() {
        while (true){
                try {
                    getChat();
                } catch (ParseException ex){
                    Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
                }catch (IOException ex) {
                    Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        }
    }
    
