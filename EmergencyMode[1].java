import java.util.*;
public class EmergencyMode {
	String status;
	void turn_ON(){
		this.status="ON";
	}
	void turn_OFF(){
		this.status="OFF";
	}
	String get_status(){
		return this.status;
	}
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);a
		System.out.println("Press Panic button for emergency mode: ");
		String s=in.nextLine();
		EmergencyMode em=new EmergencyMode();
		Confirm_emergency ce=new Confirm_emergency();
		if(s.equals("P")){
			ce.send_OTP();
			
		}

	}
}
