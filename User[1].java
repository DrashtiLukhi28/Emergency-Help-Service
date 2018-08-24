public class User {
	String username;
	String bloodGroup;
	float blood_pressure;
	String healthProblems;
	
	void store(String uname, String bGroup, float bPressure,String hProblems ){
		this.username=uname;
		this.bloodGroup=bGroup;
		this.blood_pressure=bPressure;
		this.healthProblems=hProblems;
	}
}
