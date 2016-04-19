<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" type="text/css" href="style1.css" />
<link rel="stylesheet" type="text/css" href="stylemenu.css" />
<link rel="stylesheet" type="text/css" href="default.css" />
<title>Sun BeamInfo</title>
<script type="text/javascript">
	function validationForm() {
		var password = document.forms["myform"]["studPassword"].value;
		var confirmpassword = document.forms["myform"]["confirmpassword"].value;
		var email = document.forms["myform"]["studEmail"].value;
		var confirmemail = document.forms["myform"]["confirmemail"].value;

		if (password != confirmpassword) {
			alert("password didnot matched");
			return false;
		}

		if (email != confirmemail) {
			alert("email didnot matched");
			return false;
		}
		return true;
	}
</script>

</head>

<body>
	<div class="container">

		<p>This audio tag is not supported on your browser</p>
		<img src="Untitled.png" />
		<div class="header">
			<div id='cssmenu'>
				<ul>
					<li><a href='index.jsp'><span>About us</span></a></li>
					<li class='has-sub'><a href='#'><span>JobSeekers</span></a>
						<ul>
							<li><a href='#'><span>Freshers</span></a></li>
							<li class='last'><a href='#'><span>Experienced</span></a></li>

						</ul></li>
					<li><a href='#'><span>clients</span></a></li>
					<li><a href='#'><span>Corporate Training</span></a></li>
					<li class='has-sub'><a href='login.jsp'><span>Employer
								Zone</span></a></li>
					<li class='has-sub'><a href='#'><span>Jobs</span></a>
						<ul>
							<li><a href='#'><span>IT</span></a></li>
							<li><a href='#'><span>Sales Jobs</span></a></li>
							<li><a href='#'><span>Marketing Jobs</span></a></li>
							<li><a href='#'><span>Finance jobs</span></a></li>
							<li><a href='#'><span>Engineering jobs</span></a></li>
							<li class='last'><a href='#'><span>Course
										Schedule</span></a></li>
						</ul></li>
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
						</ul></li>
				</ul>
			</div>
		</div>
		<div class="main">
			<s:form action="admin_process_registration" name="myform"
				onSubmit="return validationForm()" class="register"
				style="margin-left: 0px;">
				<h1>Registration</h1>
				<div>
					<fieldset class="row1">
						<legend>Account Details</legend>
						<s:textfield type="text" label="Email*" placeholder="Email"
							name="adminEmail" required="true" />
						<s:textfield type="text" label="Repeat Email*"
							placeholder="Confirm Email" name="confirmemail" required="true" />
						<s:textfield type="password" label="Password*"
							placeholder="Password" name="adminPassword" required="true" />
						<s:textfield type="password" label="Repeat Password*"
							placeholder="Confirm Password" name="confirmpassword"
							required="true" />
						<s:label class="obinfo">*
							obligatory fields </s:label>			
					<s:submit label="Register" />
					</fieldset>
				</div>
			</s:form>
			<div class="main1"></div>
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
						style="text-decoration: none; color: #FFFFFF;">InfraStructure</a></li>
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
							src="images/icon1.jpg" /> Facebook</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;"><img
							src="images/icon2.jpg" />twitter</a></li>
					<li><a href="index.html"
						style="text-decoration: none; color: #FFFFFF;"><img
							src="images/icon3.jpg" />linked in</a></li>
				</ul>
			</div>
			<div class="f3">
				<p class="para">
				<h3>Address:</h3>
				<br /> Market-yard<br /> Pune<br /> 0000-000000<br />
				</p>
			</div>
		</div>
		<div class="cop" align="center">
			<p class="para">
			<h4>Copyright Reserved at@ www.Sunbeam info.com</h4>
			</p>
		</div>
	</div>


</body>
</html>
