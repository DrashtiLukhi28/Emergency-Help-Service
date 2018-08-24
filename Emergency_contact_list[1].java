public class Emergency_contact_list {
String contact_name;
String contact_number;
int priority;

void delete(String contact_number){
	System.out.println(contact_number+ " Contact Number is delected.");
    
}
 
void change_priority(String contact_number,int priority){
	if(this.contact_number=contact_number){
		this.priority=priority;
	}
	System.out.priority("Priority of contact number "+contact_number+" is change from "+priority+ "to " this.priority);
}

String send_contact(){
	int randomPin   =(int)(Math.random()*9999999999)+100000000;
		String contact_number  =String.valueOf(randomPin);	
	return contact_number;
}

void update(String contact_name,String contact_number){
	if(this.contact_name=contact_name){
		this.contact_number=contact_number;
	}
	System.out.println(contact_name+" "+contact_number+" is updated.");
	}
	
	
}
