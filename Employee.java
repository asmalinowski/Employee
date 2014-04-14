public class Employee {
     
     String number;
     String name;
     int hoursWorked;
     double payRate;
     double totalPay;
     
     public String getNumber() {
        return number;
     }
        
     public void setNumber(String num) {
        number = num;
     }
     
     public String getName() {
         return name;
     }   
     
     public void setName (String nam) {
         name = nam;
     }
     
     public int getHoursWorked() {
         return hoursWorked;
     }
     
     public void setHoursWorked (int hours) {
         hoursWorked = hours;
     }
     
     public double getPayRate() {
         return payRate;
     }
     
     public void setPayRate (double pay) {
         payRate = pay;
     }
     
     public void getTotalPay (double pay, int hours) {
         totalPay = pay * hours;
     }
}
