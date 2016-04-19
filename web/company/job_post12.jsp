<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sd" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style1.css" />
<link rel="stylesheet" type="text/css" href="stylemenu.css" />
<link rel="stylesheet" type="text/css" href="default.css"/>
<title>Sun BeamInfo</title>
 
</head>
<body>
<%
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Expires", "0"); 
%>
	<h3>Welcome to Job Post</h3>
	<h3>Session : <s:property value="#session.valid_company"/></h3>
	
<div class="container">

	<audio src="Guitar.mp3" autoplay loop>
		<p>This audio tag is not supported on your browser</p>
	</audio>
	<audio src="Crunch.mp3" autoplay ></audio>
	<audio src="Bass.mp3" autoplay ></audio>
	<audio src="Drum.mp3" autoplay ></audio>
	<audio src="Pizzicato.mp3" autoplay ></audio>


<img src="Untitled.png" />
<div class="header">
 <div id='cssmenu'>
<ul>
   <li ><a href='deepaksunbeam/index.jsp'><span>About us</span></a></li>
   <li class='has-sub'><a href='#'><span>JobSeekers</span></a>
      <ul>
         <li><a href='#'><span>Freshers</span></a></li>
         <li class='last'><a href='#'><span>Expirenced</span></a></li>
		 
      </ul>
   </li>
   <li><a href='#'><span>clients</span></a></li>
   <li><a href='#'><span>Corporate Traning</span></a></li>
   <li class='has-sub'><a href='login.jsp'><span>Employeer Zone</span></a>
     
   </li>
   <li class='has-sub'><a href='#'><span>Jobs</span></a>
      <ul>
         <li><a href='#'><span>IT</span></a></li>
         <li><a href='#'><span>Sales Jobs</span></a></li>
         <li><a href='#'><span>Markiting Jobs</span></a></li>
         <li><a href='#'><span>Finance jobs</span></a></li>
         <li><a href='#'><span>Engineering jobs</span></a></li>
         <li class='last'><a href='#'><span>Course Schedule</span></a></li>
      </ul>
   </li>
   <li class='has-sub last'><a href='#'><span>Admissions</span></a>
      <ul>
         <li><a href='#'><span>Procedure</span></a></li>
         <li><a href='#'><span>Eligibility</span></a></li>
         <li><a href='#'><span>Documents</span></a></li>
         <li><a href='#'><span>Course Contents</span></a></li>
         <li><a href='#'><span>Batch Timings and Fees</span></a></li>
         <li><a href='#'><span>Rules</span></a></li>
         <li><a href='#'><span>FAQs</span></a></li>
         <li class='last'><a href='studregistration.jsp'><span>Registration</span></a></li>
      </ul>
   </li>
</ul>
</div>
  </div>
      <div class="main">
      <table>
		<tr>
		<th><h3><s:property value="#session.valid_Student.firstname"/></h3></th>
		<th><h3><s:property value="#session.valid_Student.lastname"/></h3></th>
		<th><h3><s:property value="#session.valid_Student"/></h3></th>
		
		</tr>
		</table>
		
	     <s:form method="post" action="update_job" name="myform" onSubmit="return validationForm()" class="register" style="margin-left:0px;">
            <h1>Post Job Here</h1>
            <sd:head/>
            
            <fieldset class="row1">
                <legend>Job Details
                </legend>
				<p>
					<label>Job Profile*
                    </label>
                    <input type="text" placeholder="job profile" name="profile" value="<s:property value="#session.edit_job.profile"/>"/>
                    <label>Job Id*
                    </label>
                    <input readonly="readonly" style="background-color: aqua;" type="text" placeholder="job id" name="jobid" value="<s:property value="jobid"/>"/> 
                </p>
                <p>
                <label>Job Industry*
                </label>
                  	<select name="industry">
                  		<option value="<s:property value="#session.edit_job.industry"/>">${sessionScope.edit_job.industry}</option>
                  		<option value="BPO">BPO</option>
                  		<option value="IT SOftware">IT Software</option>
                  		<option value="IT Hardware">IT Hardware</option>
                  		<option value="KPO">KPO</option>
                  		<option value="Banking">Banking</option>
                  		<option value="Banking">Finance</option>
                  	</select>
                    <label>Place*
                    </label>
                    <select name="place" required="true" >
                    	<option value="<s:property value="#session.edit_job.place"/>">${sessionScope.edit_job.place}</option>
                  		<option value="Delhi">Delhi</option>
                  		<option value="Pune">Pune</option>
                  		<option value="Hyderabad">Hyderabad</option>
                  		<option value="Mumbai">Mumbai</option>
                  		<option value="Bangalore">Bangalore</option>
                  		<option value="Indore">Indore</option>
                  		<option value="Nagpur">Nagpur</option>
                  		<option value="Noida">Noida</option>
                    </select>
                      
                 </p>
                <p>
                    <label>Experience Required*
                    </label>
                    <input type="text" placeholder="Experience Required" name="experience" value="<s:property value="#session.edit_job.experience"/>" required />
                    <label>Date Of Posting*
                    </label>
                    <sd:datetimepicker name="jobpostdate" displayFormat="dd-MMM-yyyy" value="#session.edit_job.jobpostdate" />
                </p>
                <p>
                	<label>Salary*
                    </label>
                    <input type="text" placeholder="Salary" name="salary" value="<s:property value="#session.edit_job.salary"/>" required />
                    <label>Description*
                    </label>
                    <textarea rows="8" cols="30"  placeholder="job description" name="description" value="<s:property value="#session.edit_job.description"/>"  required ></textarea>
                </p>
            </fieldset>          
 			<div><s:submit value="Update" /> &raquo;</button></div>
        </s:form>
		<div class="main1">
		
		</div>
  </div>
      <div >
      <fieldset>
      <table border="2">
      <tr><th><s:a href="companyloginSuccess.jsp" ><h1>Profile</h1></s:a></th></tr>
      <tr><td>--------------------------------</th></tr>
      <tr><th><s:a action="job_post">Post a Job</s:a></th></tr>
      <tr><th><s:a action="job_posted">Jobs Posted</s:a></th></tr>
      <tr><th><s:a action="log_out">logout</s:a></th></tr>
      </table>
      </fieldset>
      </div>
		 
		 <div class="footer">
		 <div class="f1">
		 <ul>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">About Us</a></li>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">Branches</a></li>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">clients</a></li>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">Corporate Training</a></li>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">Infra Structure</a></li> 
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">Courses</a></li> 
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;">Admissions </a></li> 		 		 
		 </ul>
		 </div>
		 <div class="f2">
		 <p class="para"><h3>Follow Us:</h3><br /></p>
		 <ul>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;"><img src="images/icon1.jpg" /> Facebook</a></li>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;"><img src="images/icon2.jpg" />twitter</a></li>
		 <li><a href="index.html" style="text-decoration:none; color:#FFFFFF;"><img src="images/icon3.jpg" />linked in</a></li>
		 </ul>
	     </div>	
		 <div class="f3">
		 <p class="para"><h3>Address:</h3><br />
		 Market-yard<br />
		 Pune<br />
		 0000-000000<br/>
		 </p>
		 </div>
  </div>
		 <div class="cop" align="center">
		 <p class="para"><h4>Copyright Reserved at@ www.Sunbeam info.com</h4></p>
  </div> 
</div>
		
				 
</body>
</html>
