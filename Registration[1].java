import java.util.Random;
public class Registration {
	String name;
	String username;
	String password;
}
class Reg_email extends Registration{
	String emailId;
	
	void store_info(String name, String uname, String password, String eID){
		this.name=name;
		this.username=uname;
		this.password=password;
		this.emailId=eID;
	}
	
	static void send_link(){
		
		
	}
}

class Reg_mob extends Registration{
	String mobNo;
	void store_info(String name, String uname, String password,String mNo){
		this.name=name;
		this.username=uname;
		this.password=password;
		this.mobNo=mNo;
	}
	static void sendOTP() {
		int randomPin   =(int)(Math.random()*9999)+1000;
		String otp  =String.valueOf(randomPin);
		System.out.print(otp);
	}
	
}
