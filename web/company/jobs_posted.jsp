<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sd" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<h3>From Session Scope<s:property value="#session.valid_company"/></h3>
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
      <table>
		<tr>
		<th><h3><s:property value="#session.valid_Student.firstname"/></h3></th>
		<th><h3><s:property value="#session.valid_Student.lastname"/></h3></th>
		<th><h3><s:property value="#session.valid_Student"/></h3></th>
		
		</tr>
		</table>
		
	     <table>
		<tr>
			<th bgcolor="lightgray">Job Id</th>
			<th bgcolor="lightgray">Profile</th>
			<th bgcolor="lightgray">Description</th>
			<th bgcolor="lightgray">Place</th>
			<th bgcolor="lightgray">Experience</th>
			<th bgcolor="lightgray">Job Post Date</th>
			<th bgcolor="lightgray">Industry</th>
		</tr>
		<c:forEach var="job" items="${sessionScope.job_list}">
			<tr>
				<td>${job.jobid}</td>
				<td>${job.profile} </td>
				<td>${job.description} </td>
				<td>${job.place} </td>
				<td>${job.experience} </td>
				<td>${job.jobpostdate} </td>
				<td>${job.industry} </td>
				<c:url var="url" value="update_post?jobid=${job.jobid}" />
 				<td><a href="${url}"><font color="blue">Update</font></a></td>
 				<c:url var="url" value="delete_post?jobid=${job.jobid}" />
 				<td><a href="${url}"><font color="red">Delete</font></a></td>
  			</tr>
		</c:forEach>
 	</table>	
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

