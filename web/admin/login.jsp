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
		var password = document.forms["myform"]["password"].value;
		var confirmpassword = document.forms["myform"]["confirmpassword"].value;
		var email = document.forms["myform"]["email"].value;
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
<script language="" type="text/javascript">
window.history.forward();
</script>


</head>

<body>
	<div class="container">

		<audio src="Guitar.mp3" autoplay loop>
		<p>This audio tag is not supported on your browser</p>
		</audio>
		<audio src="Crunch.mp3" autoplay></audio>
		<audio src="Bass.mp3" autoplay></audio>
		<audio src="Drum.mp3" autoplay></audio>
		<audio src="Pizzicato.mp3" autoplay></audio>


		<img src="Untitled.png" />
		<div Style="margin-left: 130px;" class="header" style="z-index: 10">
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
		<div class="main" style="z-index: 1">
			<form action="admin_process_login" name="myform"
				onSubmit="return validationForm()" class="register"
				style="margin-left: 0px;">
            <h1>Login</h1>
            <fieldset class="row1">
                <legend>Account Details
                </legend>
				<p>
                    <label>User Name *
                    </label>
                    <input type="text" placeholder="First Name" name="adminEmail" autofocus required />
                    <label>Password*
                    </label>
                    <input type="password" placeholder="Password" name="adminPassword" required />
                </p>
            </fieldset>
            
 			<div><button type="submit" class="button">Login &raquo;</button></div>
			</form>
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
						style="text-decoration: none; color: #FFFFFF;">Infra Structure</a></li>
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
