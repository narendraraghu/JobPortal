package src.com.app.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.app.POJO.CompanyLoginPOJO;
import com.app.POJO.JobPostPOJO;
import com.app.dao.CompanyImplDao;	
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")

public class CompanyAction2  extends ActionSupport implements SessionAware,
ModelDriven<JobPostPOJO>{
			// props
		private String email,jobid;
		private JobPostPOJO post, jobPost;
		private SessionMap<String, Object> sessMap;
		// constructor------>> 1
		public CompanyAction2() throws Exception {
			System.out.println("company Action2 constructor");
		}

		@Override//----------->> 3
		public JobPostPOJO getModel() {
			System.out.println("in model driven");
			post = new JobPostPOJO();//pojo instance
			//All setters are called
			return post;
		}

		public JobPostPOJO getPost() {
			return post;
		}

		public JobPostPOJO getJobPost() {
			return jobPost;
		}

		public void setJobid(String jobid) {
			this.jobid = jobid;
		}

		//------------>> 5
		public String jobPost() throws Exception {
			System.out.println("In post job ");
			HttpServletRequest request=ServletActionContext.getRequest();  
			HttpSession session=request.getSession();  
	  
			CompanyLoginPOJO c=(CompanyLoginPOJO)session.getAttribute("valid_company");
			System.out.println(c);
			jobPost = new CompanyImplDao().postJob(post);
			if (jobPost != null) {
				return SUCCESS;
			}
			return ERROR;
		}
		
		public String jobPosted() throws Exception{
			System.out.println("In jobPosted()");
			HttpSession session1=ServletActionContext.getRequest().getSession(false);  
		    CompanyLoginPOJO company = (CompanyLoginPOJO)session1.getAttribute("valid_company");
		    System.out.println("session is maintained : "+ company);
			this.email = company.toString();
			System.out.println("Email : "+email);
			
			ArrayList<JobPostPOJO> jobPosts = new CompanyImplDao().getAllJobs(email);
			System.out.println(jobPosts.size());
			if(jobPosts != null){
				sessMap.put("job_list", jobPosts);
				return SUCCESS;
			}
			return ERROR;
		}

		public JobPostPOJO getJopPost() {
			System.out.println("getValidComapny() called");
			return jobPost;
		}

		public String getEmail() {
			System.out.println("getter of email called");
			return email;
		}

		public void setEmail(String email) {
			System.out.println("setter of email called");
			this.email = email;
		}

		@Override
		public void setSession(Map<String, Object> sessMap) {
			this.sessMap = (SessionMap<String, Object>) sessMap;
		}
		
		//updatePOst
		public String updatePost(){
			System.out.println("In update post");
			HttpServletRequest req = ServletActionContext.getRequest();
			String jobid = req.getParameter("jobid");
			System.out.println("jobid is : "+jobid);
			JobPostPOJO job = new CompanyImplDao().updateCompany(jobid);
			sessMap.put("edit_job", job);
			return SUCCESS;
		}
		//delete post
		public String deletePost()throws Exception{
			System.out.println("In delete post");
			HttpServletRequest req = ServletActionContext.getRequest();
			String jobid = req.getParameter("jobid");
			System.out.println("jobid is : "+jobid);
			
			int delPosts = new CompanyImplDao().deleteJob(jobid);
			if(delPosts != 0){
				return this.jobPosted();
			}
			return ERROR;		
		}
		//update job
		public String updateJob() throws Exception{
			System.out.println("In update job");
			HttpServletRequest req = ServletActionContext.getRequest();
			String jobid = req.getParameter("jobid");
			String profile = req.getParameter("profile");
			String place = req.getParameter("place");
			int experience = Integer.parseInt(req.getParameter("experience"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			
			String date = req.getParameter("jobpostdate");
			date = date.substring(0,10);
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date jobpostdate = df.parse(date);
			
			String description = req.getParameter("description");
			String industry = req.getParameter("industry");
		
			System.out.println(jobid+profile+place+jobpostdate+salary+description+industry+experience);
			int updJob = new CompanyImplDao().updatedCompany(jobid,profile,place,experience,salary,jobpostdate,description,industry);
			if(updJob != 0)
				return this.jobPosted();
			return ERROR;
		}
		//getter of jobid
		public String getJobid() {
			return this.jobid;
		}
}

