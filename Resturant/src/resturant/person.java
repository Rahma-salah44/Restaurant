/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant;

/**
 *
 * @author raghda
 */
public class person {
      private String name;
   private int phone;
   private int id;
   private String address;
   private String username;
   private String password;
   private String email;
   private String db;
   public person(String name,int phone,int id,String address,String username,String password,String email,String db){
     this.address=address;
     this.email=email;
     this.id=id;
     this.name=name;
     this.password=password;
     this.phone=phone;
     this.username=username;
     this.db=db;
    }
   public person(){};
   public person(String username,String password,String email){
      this.username=username;
      this.password=password;
      this.email=email;
}
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    public void setDb(String db) {
        this.db = db;
    }

    public String getDb() {
        return db;
}
}
