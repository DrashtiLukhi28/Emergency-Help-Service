public class AutoDial {
	int contact_number;
	int help_centre_contact;
	
	String auto_search(String location){
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
		return contact_no;
	}
	void call(String help_contact_number){
		System.out.println(" Call made to "+help_contact_number);
		
	}
	void send_SMS(String contact_number){
		System.out.println("SMS send to "+help_contact_number);
	}
}
