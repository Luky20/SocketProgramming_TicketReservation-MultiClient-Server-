/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuts_serverapplication;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
/**
 *
 * @author Luky
 */
public class User implements Serializable{
    public static ArrayList<User> _daftarUser;
    private String id;
    private String fullname;
    private String username;
    private String password;
    private String email;
    private Date dob;
    private String member_since;

    public User(){
        setId("");
        setFullname("");
        setFullname("");
        setUsername("");
        setPassword("");
        setEmail("");
        setDob(new Date());
        setMember_since("");
    }
    public User(String id, String fullname, String username, String password, String email, Date dob, String member_since) {
        setId(id);
        setFullname(fullname);
        setUsername(username);
        setPassword(password);
        setEmail(email);
        setDob(dob);
        setMember_since(member_since);
    }
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMember_since() {
        return member_since;
    }

    public void setMember_since(String member_since) {
        this.member_since = member_since;
    }
    
    public void DisplayUser(){
        System.out.println("Id: " + getId());
        System.out.println("Fullname: " + getFullname());
        System.out.println("Username: " + getUsername());
        System.out.println("Password: " + getPassword());
        System.out.println("Email: " + getEmail());
        System.out.println("Dob: " + getDob());
        System.out.println("Member Since: " + getMember_since());
    }
    
    public static boolean CheckLogin(String username, String password) {
        for (User user : _daftarUser) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    } 
    public static boolean CheckRegister(String username, String password){
        for (User user : _daftarUser) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return false;
            }
        }
        return true;
    }
    public static User userLogin(String username, String password) {
        User u = new User();
        for(User user : _daftarUser) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return u;
    }
}
