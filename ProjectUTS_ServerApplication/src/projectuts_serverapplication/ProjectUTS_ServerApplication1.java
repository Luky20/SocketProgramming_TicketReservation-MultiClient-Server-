/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuts_serverapplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectUTS_ServerApplication1 implements Runnable {
    
    private static ServerSocket server;
    private Socket tmpChannel;
    private Thread listenThread;    

    public static void main(String[] args)  {
        User._daftarUser = new ArrayList<>();
        User._daftarUser.add(new User("1", "Luky Wilan", "Luky", "1234", "lukywilan@gmail.com",
                    new Date(0, 0, 0), "2024")); 
        User._daftarUser.add(new User("1", "Luky Wilan", "Hai", "123", "lukywilan@gmail.com",
                    new Date(0, 0, 0), "2024")); 
        Plane._listPlane = new ArrayList<>();
        Plane._listPlane.add(new Plane("1", "Tiket Pesawat", "Deskripsi", new Date(2024, 4, 8), 500000, new Date(2024,3,20), 
                new Date(2024,3,20 ), "123", "Jakarta", "Surabaya", "Ekonomi"));
        
        
        Train._listTrain = new ArrayList<Train>();
        Train._listTrain.add(new Train("2", "Tiket Kereta", "Deskripsi", new Date(2024, 4, 8), 500000, new Date(2024,3,20), 
                new Date(2024,3,20 ), "Gubeng", "Pasar Turi", "Ekonomi"));
        
        Ship._listShip = new ArrayList<Ship>();
        Ship._listShip.add(new Ship("3", "Tiket Kapal", "Deskripsi", new Date(2024, 4, 8), 500000, new Date(2024,3,20), 
                new Date(2024,3,20 ), "Gilimanuk", "Perak", "Eksklusif"));
        
        Car._listCar = new ArrayList<Car>();
        Car._listCar.add(new Car("4", "Tiket Mobil", "Deskripsi", new Date(2024, 4, 8), 500000, new Date(2024,3,20), 
                new Date(2024,3,20 ), "Kijang Innova", "4-Seater"));
        
        SocketController._clientsList = new ArrayList<SocketController>();
        try {            
            server = new ServerSocket(6001) ;
            System.out.println("Server is running");
            
            new ProjectUTS_ServerApplication1();                                                           
              
        } catch (IOException ex) {
            Logger.getLogger(ProjectUTS_ServerApplication1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }   
    

    public ProjectUTS_ServerApplication1() {
        if(listenThread == null){
                listenThread = new Thread(this,"server");
                listenThread.start();
        }
    }
    

    @Override
    public void run() {
        
        try {
            while (true) {
                tmpChannel = server.accept();
                SocketController sc = new SocketController(tmpChannel);
                sc.start();
                SocketController._clientsList.add(sc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    
}
