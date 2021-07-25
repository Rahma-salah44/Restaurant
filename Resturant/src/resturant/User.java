

package resturant;

/**
 *
 * @author raghda
 */
public class User extends person{
     private double salary;

    public User() {};
    
     public User(String name,int phone,int id,String address,String username,String password,String email,String db){
      super(name,phone,id,address,username,password,email,db);
   }
     
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
      public boolean login(String username,String password){
        if(username.equals(username)&&password.equals(password)){
        return true;
        }
           return false;
   }
   public void logout(){};
}


