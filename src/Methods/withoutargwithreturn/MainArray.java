package Methods.withoutargwithreturn;

public class MainArray {
	
	//method which returns a student object
	public Company getCompany() {
		
		Company companyRef = new Company(100,"Codegnan","Hyderabad",200,23540.37);
		return companyRef;
	}
	
	//A method returning a string array
	public String[] getEmployeeList() {
		
		//String[] emList= new empList[3];
		String [] empList = {"suman","kumar","lakshmi"};
		return empList;
	}
	
	public Company[] getCompaniesList() {
		
		Company[] companyArray = { new Company(100,"Codegnan","Hyderabad",200,23540.37)};
		
		return companyArray;
	}

	public static void main(String[] args) {
		

	}

}
