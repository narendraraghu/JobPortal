package src.com.app.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.app.POJO.CompanyLoginPOJO;
import com.app.dao.CompanyImplDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

	@SuppressWarnings("serial")
	public class CompanyAction1 extends ActionSupport implements SessionAware,
			ModelDriven<CompanyLoginPOJO>{
		// props
		private String email;
		private CompanyLoginPOJO company, validCompany;
		private Map<String, Object> sessMap;
		
		// constructor------>> 1
		public CompanyAction1() throws Exception {
			System.out.println("company Action1 constructor");
		}

		@Override//----->> 2
		public void setSession(Map<String, Object> sessMap) {
			System.out.println("setSession()");
			this.sessMap = sessMap;
		}
		
		@Override//----------->> 3
		public CompanyLoginPOJO getModel() {
			System.out.println("in model driven");
			company = new CompanyLoginPOJO();//pojo instance
			//All setters are called
			return company;
		}

		// B.L
		//------------>> 5
		public String validateCompany() throws Exception {
			System.out.println("in validate company " + company);
			String email = company.getEmail();
			String password = company.getPassword();
			// dao based validations...
			validCompany = new CompanyImplDao().validationCompany(email, password);
			this.setEmail(validCompany.getEmail());
			
			if (validCompany != null) {
				sessMap.put("valid_company", validCompany);//Using session
				return SUCCESS;
			}
			return ERROR;
		}
		
		private void setEmail(String email) {
			this.email = email;
		}
		
		private String getEmail(){
			return this.email;
		}
		
		public CompanyLoginPOJO getValidCompany() {
			System.out.println("getValidCompany() called...");
			return validCompany;//<s:property value="validCompany"/>
		}
		
		public String logout(){
			System.out.println("in logout action");
			validCompany = (CompanyLoginPOJO) sessMap.get("valid_company");
			((SessionMap<String, Object>) sessMap).invalidate();
			return SUCCESS;
			
		}
}

