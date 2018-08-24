import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Confirm_emergency {
boolean status;

int sent_OTP;

void send_OTP(){
    int max = 9999;
    int min = 1000;
    
      Random randomNum = new Random();
      sent_OTP = min + randomNum.nextInt(max);
      System.out.println("Sent OTP: "+sent_OTP);
}

void check(int sent_OTP){
    String otp=Integer.toString(sent_OTP);
    String entered_OTP="";
    entered_OTP= scan.nextLine();
    
    while(entered_OTP.equals("")){
   	 TimeUnit.MINUTES.sleep(1);
    if(entered_OTP.equals("")){
   	 status = true;
   	 System.out.println("Emergency mode confirmed");
    }
    else{
   	 status = false;
   	 System.out.println("No Emergency");
    }
}
}

public static void main(String[] args) throws InterruptedException{
    confirm_emergency ce = new confirm_emergency();
    ce.send_OTP();
    ce.check();
}
}
