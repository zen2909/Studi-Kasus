package Admin;

public class Staff {
   private String username;
   private int pin ;
   
   public Staff (){
       this.username = getUsername();
       this.pin = getPin() ;

   }
    public void setUsername(String username){

       this.username = username;
    }
    public void setPin(int pin){
       this.pin = pin;
    }
    public String getUsername(){

       return this.username;
    }
    public int getPin(){

       return this.pin;
    }

}
