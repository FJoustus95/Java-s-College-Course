
package main.java.com.mycompany.examples.Inheritance;

import java.util.*;

public final class Customer extends Person {

    public static int getCostumerCount() {
        return costumerCount;
    }

    public static void setCostumerCount(int aCostumerCount) {
        costumerCount = aCostumerCount;
    }
   
   Date date = new Date();
   StringBuilder sb = new StringBuilder();
   
   private int costumerID;
   private String creatindDate;
   private boolean costumerVIP;
   private static int costumerCount;
   
    public Customer(String name, String surname,char genre, int age, String address, int costumerID, boolean costumerVIP) {
        
        super(name, surname, genre, age, address);
        this.costumerID = Customer.costumerCount++;
        this.currentDate();
        

    }
   public void currentDate(){
       System.out.println(date);
       
   }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public String getCreatindDate() {
        return creatindDate;
    }

    public void setCreatindDate(String creatindDate) {
        this.creatindDate = creatindDate;
    }

    public boolean isCostumerVIP() {
        return costumerVIP;
    }

    public void setCostumerVIP(boolean costumerVIP) {
        this.costumerVIP = costumerVIP;
    }

    @Override
    public String toString() {
      
        sb.append("Customer { ");
        sb.append("\nCostumer´s name : ").append(this.name);
        sb.append("\nCostumer´s surname : ").append(this.surname);
        sb.append("\nCostumer´s genre : ").append(this.genre);
        sb.append("\nCustomer´s age : ").append(this.age);
        sb.append("\nCustomer´s address : " ).append(this.address);
        sb.append("\nCustomer´s registration date : ").append(this.date);
        sb.append("\ncostumerID : ").append(this.costumerID);
        sb.append("\ncostumerVIP : ").append(costumerVIP);
        sb.append('}');
        return sb.toString();
    }
  
   
}
