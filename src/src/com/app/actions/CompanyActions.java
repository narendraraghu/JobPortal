package src.com.app.actions;

import com.app.POJO.CompanyLoginPOJO;
import com.app.POJO.CompanyRegistrationPOJO;
import com.app.dao.CompanyImplDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

	@SuppressWarnings("serial")
	public class CompanyActions extends ActionSupport implements ModelDriven<CompanyRegistrationPOJO>{
		// props

		private CompanyRegistrationPOJO company, validCompany;
		private CompanyLoginPOJO companyLogin;

		// constructor------>> 1
		public CompanyActions() throws Exception {
			System.out.println("company Action constructor");
		}

		
		@Override//----------->> 3
		public CompanyRegistrationPOJO getModel() {
			System.out.println("in model driven");
			company = new CompanyRegistrationPOJO();//pojo instance
			//All setters are called
			return company;
		}

		//------------>> 5
		public String registerCompany() throws Exception {
			System.out.println("In register company " + company);
			// invoke dao layer method to supply persistence to transient pojo
			validCompany = new CompanyImplDao().registerCompany(company);
			if (validCompany != null) {
				companyLogin = new CompanyLoginPOJO();
				companyLogin.setEmail(validCompany.getEmail());
				companyLogin.setPassword(validCompany.getPassword());
				System.out.println(companyLogin);
				CompanyLoginPOJO compLogin = new CompanyImplDao().loginCompany(companyLogin);
				addActionMessage("Successful Registration");
				if(compLogin != null)
					return SUCCESS;
			}
			return ERROR;
		}
		
		public CompanyRegistrationPOJO getCompany() {
			System.out.println("getCompany() called");
			return company;
		}

		public void setCompany(CompanyRegistrationPOJO company) {
			System.out.println("setCompany() called");
			this.company = company;
		}

		public CompanyRegistrationPOJO getValidCompany() {
			System.out.println("getValidComapny() called");
			return validCompany;
		}
}
