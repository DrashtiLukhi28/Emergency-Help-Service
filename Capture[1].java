public class Capture {
String capture_status;

String capture_location(){
	char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder(8);
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
    	char c = chars[random.nextInt(chars.length)];
    	sb.append(c);
			}
		String location = sb.toString();
		System.out.println("Your location: " +location);
    return location;
}

void capture_photos(){
    System.out.println("Capturing photos....");
}

void store(){
    System.out.println("Photos are stored.");
}
}
