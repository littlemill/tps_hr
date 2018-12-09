package tps_hr;

import java.util.Map;
import java.util.Date;
import java.util.ArrayList;

import fxml.Main;

public class TPS {
	protected ArrayList<CEO> ceoList;
	protected ArrayList<EVP> evpList;
	protected ArrayList<Operation> operationList;
	protected ArrayList<Sales> salesList;
	protected ArrayList<GA> gaList;
	protected ArrayList<Finance> financeList;
	protected ArrayList<Project> projectList;
	protected ArrayList<Employee> resignedEmployee;
	protected ArrayList<Notification> notification;
	protected Map<String,String> loginInfo;
	public int latestProjectCode;
	
	private String[] type = {"Engineer","CEO","Engineer","Sales","GA","EVP","Sales","Finance"};
	private String[] nameL = {"Massimiliano","Romnalin","Shin","Lalida","Sutiwat","Pichaya","Methawee","Chalisa"};
	private String[] surnameL = {"Cristina na nan","Kitkasetsathaporn","Sripadungtham","Waura-angkura","Simtharakao","Karawawattana","Boonchana","Vaichiaranai"};
	private String[] nicknameL = {"Mass","Mill","Shin","Mywl","Mo","Pam","May","Amy"};
	private String[] telL = {"090-052-7325","082-497-1999","095-579-7596","088-002-4894","061-651-4199","084-300-3893","082-470-4115","095-478-1745"};
	private String[] addressL = {"Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering","Faculty of Engineering"};
	private int[] ageL = {20,19,19,19,20,19,19,19}; 
	private int[] salaryL = {25000,100000,35000,30000,20000,80000,30000,24000};
	private int[] bdayL = {17,12,16,24,31,19,6,8};
	private int[] bmonthL = {10,10,3,2,7,3,4,4};
	private int[] byearL = {1998,1999,1999,1999,1998,1999,1999,1999}; 
	private int[] sdayL = {1,2,3,4,5,6,7,8};
	private int[] smonthL = {6,3,3,4,5,6,9,10};
	private int[] syearL = {105,105,105,105,105,105,105,105};
	private String[] idL = {"30024","00120","30110","20341","42343","12345","28788","57778"};
	private String[] passwordL = {"12345","12121","11111","22222","33333","44444","55555","66666"};
	private String[] startTimeL = {"08:00","11:00","10:00","13:00","13:00","9:00","13:00","14:00"};
	private String[] endTimeL = {"10:00","12:00","11:00","15:00","14:00","15:00","15:00","16:00"};
	private String[] noteL = {"meeting at TPS office","project conference at PTT","implement project at Satriwithaya School","meeting at TPS","project conference at SCG","network conference at Mandarin Oriental Hotel BKK","project at Chula","finance member meeting at TPS"};
	private String[] notificationL = {"WELCOME","Welcome to TPS Application"};
	private int[] workYearsL = {2,9,9,2,3,4,5,6};
	private int[] usedHolidayL = {1,3,2,2,2,2,3,1};
	private int[] monthPayroll = {1,1,1,2,2,2,3,3};
	private int[] yearPayroll = {2018,2018,2018,2018,2018,2018,2018,2018};
	private int[] commissionPayroll = {0,0,0,30000,0,0,25000,0};
	private String[] project = {"00123","Engineering Data Center","Faculty of Engineering , Chulalongkorn University"};
	private int initialsize = 8;
	
	
	public TPS() {
		operationList = new ArrayList<Operation>();
		ceoList = new ArrayList<CEO>();
		evpList = new ArrayList<EVP>();
		salesList = new ArrayList<Sales>();
		gaList = new ArrayList<GA>();
		financeList = new ArrayList<Finance>();
		projectList = new ArrayList<Project>();
		resignedEmployee = new ArrayList<Employee>();
		notification = new ArrayList<Notification>();
		this.setLatestProjectCode(0);	
		//loginData = new login();
		
		for(int i=0;i<initialsize;i++) {
			EmployeeType etype = EmployeeType.valueOf(type[i]);
 			Employee employee;
 			ArrayList list = new ArrayList();
 			
 			switch (etype) {
 				case CEO: 
 					employee = new CEO();
 					list = (ArrayList<CEO>) ceoList;
 					break;
 				case EVP: 
 					employee = new EVP();
 					list = (ArrayList<EVP>) evpList;
 					break;
 				case Finance: 
 					employee = new Finance();
 					list = (ArrayList<Finance>) financeList;
 					break;
 				case GA: 
 					employee = new GA();
 					list = (ArrayList<GA>) gaList;
 					break;
 				case Sales: 
 					employee = new Sales();
 					list = (ArrayList<Sales>) salesList;
 					break;
 				case Engineer: 
 					employee = new Operation();
 					list = (ArrayList<Operation>) operationList;
 					break;
 				default:
 					employee = new CEO();
 					list = (ArrayList<CEO>) ceoList;
 			}
 			employee.setType(etype);
 			employee.setName(nameL[i]);
 			employee.setSurname(surnameL[i]);
 			employee.setNickname(nicknameL[i]);
 			employee.setTel(telL[i]);
 			employee.setAddress(addressL[i]);
 			employee.setAge(ageL[i]);
 			employee.setSalary(salaryL[i]);
 			employee.setBirthDate(byearL[i],bmonthL[i],bdayL[i]);
 			employee.setStartingDate(syearL[i],smonthL[i],sdayL[i]);
 			employee.setId(idL[i]);
 			employee.setPassword(passwordL[i]);
 			employee.getPayrollList().add(new Payroll(monthPayroll[i],yearPayroll[i],employee.getSalary(),commissionPayroll[i]));
 			employee.getTimeSheetList().add(new TimeSheet(startTimeL[i],endTimeL[i],noteL[i],employee));
 			if(employee.getType() == EmployeeType.valueOf("GA")) {
 				GA ga = (GA) employee;
 				this.getNotification().add(new Notification(notificationL[0],notificationL[1],ga));
 			}
 			employee.setWorkYears(workYearsL[i]);
 			employee.getHoliday().setMaxHolidays(employee.getWorkYears());
 			employee.getHoliday().setUsedHolidays(usedHolidayL[i]);
 			list.add(employee);
		}
		
		Sales sale = getSalesList().get(0);
		Operation eng = getOperationList().get(0);
		Project prj = new Project(project[1],sale,eng);
		GA ga = getGaList().get(0);
		prj.setProjectCode(project[0]);
		getCeoList().get(0).approveProject(prj);
		getEvpList().get(0).approveProject(prj);
		prj.setOrganization(project[2]);
		prj.setApprovedbyCEO(true);
		prj.setApprovedbyEVP(true);
		eng.getProjectHistory().add(prj);
		sale.getProjectHistory().add(prj);
		
		projectList.add(prj);
	}

	public Project projectCodeToProject(String projectCode) {
		for(int i=0;i<projectList.size();i++) {
			if(projectList.get(i).getProjectCode().equals(projectCode)) {
				return projectList.get(i);
			}
		}
		return projectList.get(projectList.size()-1);
	}
	
	public void addCEO(CEO ceo) {
		this.ceoList.add(ceo);
	}
	
	public void addEVP(EVP evp) {
		this.evpList.add(evp);
	}
	
	public void addOperation(Operation operation) {
		this.operationList.add(operation);
	}
	
	public void addSales(Sales sales) {
		this.salesList.add(sales);
	}
	
	public void addGA(GA ga) {
		this.gaList.add(ga);
	}
	
	public void addFinance(Finance finance) {
		this.financeList.add(finance);
	}
	
	public void addProject(Project projectName) {
		this.projectList.add(projectName);
		this.setLatestProjectCode(this.latestProjectCode +1);
	}

	//getter&setter for project code
	public int getLatestProjectCode() {
		return latestProjectCode;
	}

	public void setLatestProjectCode(int latestProjectCode) {
		this.latestProjectCode = latestProjectCode;
	}

	public Map<String, String> getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(Map<String, String> loginInfo) {
		this.loginInfo = loginInfo;
	}

	public ArrayList<CEO> getCeoList() {
		return ceoList;
	}

	public void setCeoList(ArrayList<CEO> ceoList) {
		this.ceoList = ceoList;
	}

	public ArrayList<EVP> getEvpList() {
		return evpList;
	}

	public void setEvpList(ArrayList<EVP> evpList) {
		this.evpList = evpList;
	}

	public ArrayList<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(ArrayList<Operation> operationList) {
		this.operationList = operationList;
	}

	public ArrayList<Sales> getSalesList() {
		return salesList;
	}

	public void setSalesList(ArrayList<Sales> salesList) {
		this.salesList = salesList;
	}

	public ArrayList<GA> getGaList() {
		return gaList;
	}

	public void setGaList(ArrayList<GA> gaList) {
		this.gaList = gaList;
	}

	public ArrayList<Finance> getFinanceList() {
		return financeList;
	}

	public void setFinanceList(ArrayList<Finance> financeList) {
		this.financeList = financeList;
	}

	public ArrayList<Notification> getNotification() {
		return notification;
	}

	public void setNotification(ArrayList<Notification> notification) {
		this.notification = notification;
	}

	public ArrayList<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(ArrayList<Project> projectList) {
		this.projectList = projectList;
	}
	
}
