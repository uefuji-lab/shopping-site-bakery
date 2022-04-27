package bean;

import java.util.Date;

public class Customer implements java.io.Serializable{

    private int id;
    private String name;
    private String address;
    private String number;
    private String login;
    private String password;
    private Date createdAt;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getNumber(){
        return number;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public Date getCreatedAt(){
        return createdAt;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

}