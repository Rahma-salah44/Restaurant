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
public class Admin extends person{
    
    public Admin(String name,int phone,int id,String address,String username,String password,String email,String db){
    super(name,phone,id,address,username,password,email,db);
    }

    Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addmeal(int id ,String name ,double price, double preparationtime){
        Meal x= new Meal(id,name,price,preparationtime);
        if(x.addmeal()){
            System.out.println(x.toString() + "Added Successfully ");  } 
        else {
            System.out.println("Failed to insert ... !");
          }
        }
    
    
     public void searchformeal(int id) {
        Meal x = new Meal();
        System.out.println(x.searchmeal(id));
    }
     
     
    public void updateMeal(int oldID, Meal newmeal) {
        Meal x = new Meal();
        if (x.updatemeal(oldID, newmeal)) {
            System.out.println(newmeal.toString() + "Updated Successfully ");
        } else {
            System.out.println("Failed to Updated ");
        }
    }

    public void deletemeal(int Id) {
        Meal x = new Meal();
        if (x.deletemeal(Id)) {
           System.out.println("meal: "+ Id + " Deleted Successfully ");
        } else {
            System.out.println("Failed to Deleted ");
        }
    }
    
      public void displaymeals() {
        Meal x = new Meal();
        System.out.println(x.listMeals());
    }
    
  
     
}
