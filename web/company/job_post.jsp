<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sd" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="style1.css" />
<link rel="stylesheet" type="text/css" href="stylemenu.css" />
<link rel="stylesheet" type="text/css" href="default.css"/>
<title>Sun BeamInfo</title>
	<script type="text/javascript">
		function validationForm() {
			var password = document.forms["myform"]["studPassword"].value;
			var confirmpassword = document.forms["myform"]["confirmpassword"].value;
			var email = document.forms["myform"]["studEmail"].value;
			var confirmemail = document.forms["myform"]["confirmemail"].value;						
			if(document.forms["myform"]["password"].value != document.forms["myform"]["confirmpassword"].value)
			{
			alert("password didnot matched");
			return false;
			}
			if(document.forms["myform"]["email"].value != document.forms["myform"]["confirmemail"].value)
			{
			alert("email didnot matched");
			return false;
			}
            return true;
		}	
 
 	</script>
 
</head>
<sd:head/>

<body>
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
   <li ><s:a action="index" namespace="/" ><span>Home</span></s:a></li>
<%--    <li ><a href='index.jsp'><span>About us</span></a></li>
 --%></li>
   <li class='has-sub'><a href='#'><span>client</span></a>
   </li>
   <li class='has-sub'><a href='#'><span>Corporate Training</span></a>
   </li>
     <!-- <li><a href='company/companylogin.jsp'><span>Company Login</span></a></li>
         <li><a href='company/companyregistration.jsp'><span>Company Registration</span></a></li> -->
   <li class='has-sub last'><a href='#'><span>Details</span></a>
      <ul>
         <li><a href='#'><span>Contact US</span></a></li>
         <li><a href='#'><span>FAQ</span></a></li>
         <li><a href='#'><span>About US</span></a></li>
      </ul>
   </li>
   <li ><s:a action="log_out"><span>Logout</span></s:a></li>
</ul>
</div>
  </div>
      <div class="main">
	     <form method="post" action="post_the_job" name="myform" onSubmit="return validationForm()" class="register" style="margin-left:0px;">
            <h1>Post Job Here</h1>
            <fieldset class="row1">
                <legend>Job Details
                </legend>
								<p>
					<label>Job Profile*
                    </label>
                    <input type="text" placeholder="job profile" name="profile" autoFocus required />
                    <label>Job Id*
                    </label>
                    <input type="text" placeholder="job id" name="jobid" value="<s:property value="#session.valid_Student.academicPojo.yearOfPassing"/>" required />   
                </p>
                <p>
                  	<s:select name="industry" label="Job Industry" list="#{'IT Software':'IT Hardware','BPO':'KPO','Banking':'R&D','Mobile':'DBA','System Programming':'Finance' }" required="true" ></s:select>
                    <s:select name="place" label="Place" list="#{'Delhi':'Pune','Bangalore':'Indore','Nagpur':'Hyderabad','Noida':'Haryana','Mumbai':'Chennai' }" required="true" value="Select"></s:select>  
                 </p >
                <p>
                    <label>Experience Required*
                    </label>
                    <input type="text" placeholder="Experience Required" name="experience" value="<s:property value="#session.valid_Student.academicPojo.schoolCollegeName"/>" required />
                    <label>Date Of Posting*
                    </label>
                    <sd:datetimepicker name="jobpostdate" displayFormat="dd-MMM-yyyy"/>
                </p>
                <p>
                	<label>Salary*
                    </label>
                    <input type="text" placeholder="Salary" name="salary" value="<s:property value="#session.valid_Student.academicPojo.schoolCollegeName"/>" required />
                    <label>Description*
                    </label>
                    <textarea rows="8" cols="30"  placeholder="job description" name="description" value="<s:property value="#session.valid_Student.academicPojo.percentage"/>"  required ></textarea>
                    <label class="obinfo">* obligatory fields
                    </label>
                </p>
                <p>
                	<input type="hidden" name="email" value="${sessionScope.valid_company.email}" required />
               	</p>
            </fieldset>
            
            
 			<div><button type="submit" class="button">Post Job &raquo;</button></div>
        </form>
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
