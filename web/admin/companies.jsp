<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:property value="#session.company_list" />
	<table>
		<tr>
			<th bgcolor="lightgray">Email-Id</th>
			<th bgcolor="lightgray">Name</th>
			<th bgcolor="lightgray">Address</th>
			<th bgcolor="lightgray">Industry</th>
			<th bgcolor="lightgray">Option</th>
		</tr>
		<c:forEach var="company" items="${sessionScope.company_list}">
			<tr>
				<td>${company.email}</td>
				<td>${company.companyName}</td>
				<td>${company.city}</td>
				<td>${company.industry}</td>
				<td><a href="delete_company?id=${company.email}">Delete</a></td>
			</tr>
		</c:forEach>
		</table>
	

</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="style1.css" />
<link rel="stylesheet" type="text/css" href="stylemenu.css" />
<link rel="stylesheet" type="text/css" href="default.css" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
<title>Sun BeamInfo</title>
<script language="" type="text/javascript">
window.history.forward();
</script>
</head>
<body>
	<div class="container">
<img src="Untitled.png" />
<div Style="margin-left: 130px;" class="header">
 <div id='cssmenu'>
				<ul>
   <li ><s:a action="index" namespace="/" ><span>Home</span></s:a></li>
					<li><a href='#'><span>clients</span></a></li>
					<li><a href='#'><span>Corporate Training</span></a></li>
					<li class='has-sub'><a href='login.jsp'><span>Employer
								Zone</span></a></li>
   <li class='has-sub last'><a href='#'><span>Details</span></a>
      <ul>
         <li><a href='#'><span>Contact US</span></a></li>
         <li><a href='#'><span>FAQ</span></a></li>
         <li><a href='#'><span>About US</span></a></li>
      </ul>
   </li>
				</ul>
</div>
  </div>
		<div class="main">
			<div>
				<fieldset>
					<legend>Profile Details</legend>
					<table border="2">
						<tr>
							<th></th>
						</tr>
						<tr>
							<td>--------------------------------</td>
						</tr>
						<tr>
							<th><s:a action="students">Manage Students</s:a></th>
						</tr>
						<tr>
						<th><s:a action="companies">Manage Companies</s:a></th>
						</tr>
						<tr>
						<th>
						<s:a action="admin_home">Admin Home</s:a>
						</th>
						</tr>
						<tr>
						<th>
						<s:a action="logout">Logout</s:a>
						</th>
						</tr>
					</table>
				</fieldset>
			</div>
	<div style="margin-left: 230px; margin-top: -100px;" id="content">
            <a class="back" href=""></a>
            <span class="scroll"></span>
           
            <table class="table1">
                <thead>
                    <tr>
                        <th scope="col" abbr="Starter">Email-Id</th>
                        <th scope="col" abbr="Medium">Name</th>
                        <th scope="col" abbr="Business">Address</th>
                        <th scope="col" abbr="Deluxe">Industry</th>
                        <th scope="col" abbr="Starter">Option</th>
                    </tr>
                </thead>
                
                <tbody>
		<c:forEach var="company" items="${sessionScope.company_list}">
			<tr>
				<td>${company.email}</td>
				<td>${company.companyName}</td>
				<td>${company.city}</td>
				<td>${company.industry}</td>
				<td><a href="delete_company?id=${company.email}">Delete</a></td>
			</tr>
		</c:forEach>
                    
                </tbody>
            </table>      
	
			<div class="main1">
				
			</div>
		</div>

		<div class="footer">
			<div class="f1">
				<ul>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">About Us</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">Branches</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">clients</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">Corporate
							Training</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">Infrastructure</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">Courses</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;">Admissions </a></li>
				</ul>
			</div>
			<div class="f2">
				<p class="para">
				<h3>Follow Us:</h3>
				<br />
				</p>
				<ul>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;"><img
							src="images/icon1.jpg" />Facebook</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;"><img
							src="images/icon2.jpg" />twitter</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;"><img
							src="images/icon3.jpg" />linked-in</a></li>
				</ul>
			</div>
			<div class="f3">
				<p class="para">
				<h3>Address:</h3>
				<br /> Market-yard<br />Pune<br /> 0000-000000<br />
				</p>
			</div>
		</div>
		<div class="cop" align="center">
			<p class="para">
			<h4>Copyright Reserved at www.Sunbeam info.com</h4>
			</p>
		</div>
	</div>
</body>
</html>
