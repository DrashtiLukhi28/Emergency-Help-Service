public class Dial_manual {
String user_type;
String service_option;

void read_location(String location){
	
    
}

String[] search(String location){
	char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder(8);
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
    	char c = chars[random.nextInt(chars.length)];
    	sb.append(c);
			}
		String output = sb.toString();
		System.out.println("Nearby Help centre: " +output);

		int randomPin   =(int)(Math.random()*9999999999)+100000000;
		String contact_no  =String.valueOf(randomPin);	
		
		String st[]=new String[2];
		st[0]=output;
		st[1]=contact_no;

		return st;
}

void display(String[] details){
	System.out.println("Hospital name: "+st[0]+"   Hospital contact number: "+st[1]);
}

void send_captured_info(){
    System.out.println("Captured information is sent.");
}
}
