
public class Student {
	public String name = "";

	public boolean freshman = false;

	public boolean freshValedictorianOrSalutatorian = false;
	public boolean fromRTULHS = false;
	public boolean fresh100Graduates = false;
	public boolean freshCertified = false;
	
	public boolean undergraduate = false;
	public String undergradGWA = "1.00";
	
	public boolean graduate = false;
	public boolean gradFromRTU = false;
	public boolean gradWithHonors = false;
	public boolean gradMeetUnitsRequirements = false;
	public String gradAverageGWA = "1.00";
	
	public boolean entranceScholarship = false;
	public boolean collegeScholarship = false;
	public boolean universityScholarship = false;
	public boolean graduateScholarship = false;
	
	
	public Student() {};
	
	public Student(String name) {
		this.name = name;
	}

}
