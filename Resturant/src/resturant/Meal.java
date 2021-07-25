/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant;

import java.util.ArrayList;

/**
 *
 * @author raghda
 */
class Meal {
      private int id;
    private String name;
    private double price;
    private double preparationtime;
    public static ArrayList<Meal> meals = new ArrayList<Meal>();
  
    public String filepath ="Meal.bin";
   
    public Meal(){}
    public Meal(int id,String name,double price,double preparationtime ){
        this.id=id;
        this.name=name;
        this.price=price;
        this.preparationtime=preparationtime;

    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getPreparationtime() {
        return preparationtime;
    }

    public void setPreparationtime(float preparationtime) {
        this.preparationtime = preparationtime;
    }
    
    
    
    
    public boolean addmeal(){
       
       meals.add(this);
          return false;
       
    }
    
    private int getmealIndex(int id) {
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getId()==id) {
                return i;
            }
        }

        return -1;
    }
    
    public String searchmeal(int id) {
        int index = getmealIndex(id);
        if (index != -1) {
            return "\nFound " + meals.get(index).toString();
        } else {
            return "\nNot Found ";
        }
    }
    
    public boolean updatemeal(int oldid, Meal x) {
        
        int index = getmealIndex(oldid);
        if (index != -1) {
            meals.set(index, x);

           
        }

        return false;
    }

     public boolean deletemeal(int id) {
        
        int index = getmealIndex(id);

        if (index != -1) {
            meals.remove(index);

            
        }

        return false;
    }
     
     
    
       @Override
    public String toString() {
        return "Meal id :" + id + "\n" + "Meal name :" + name + "\n" +
                "Meal price :" + price + "\n" + "Meal preparationtime :" + preparationtime;
    }

      public ArrayList<Meal> listMeals() {
        return meals;
    }
       
}
