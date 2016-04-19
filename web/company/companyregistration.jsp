<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <style type="text/css">
 
            body {font-family:Arial, Sans-Serif;}
 
            #container {width:300px; margin:0 auto;}
 
            /* Nicely lines up the labels. */
            form label {display:inline-block; width:140px;}
 
            /* You could add a class to all the input boxes instead, if you like. That would be safer, and more backwards-compatible */
            form input[type="text"],
            form input[type="password"],
            <!--form input[type="email"] {width:160px;}-->
 
            form .line {clear:both;}
            form .line.submit {text-align:right;}
 
        </style>
    </head>
    <body>
        <div id="container">
        
            <s:form action="process_register" method="post" namespace="/company">
                <h1>Register Here</h1>
                <div class="line"><s:textfield label="Email *" name="email" /></div>
                <div class="line"><s:textfield label="Password *" type="password" name="password" /></div>
                <!-- You may want to consider adding a "confirm" password box also -->
                <div class="line"><s:textfield label="Company Name *" type="text" name="companyName" /></div>
                <div class="line"><s:textfield label="City *" name="city" /></div>
                <div class="line"><s:textfield label="State *" name="state" /></div>
                <div class="line"><s:textfield label="Contact Person *" type="text" name="contactPerson" /></div>
                <div class="line"><s:textfield label="Contact Number *" name="contactNumber" /></div>
                <!-- Valid input types: http://www.w3schools.com/html5/html5_form_input_types.asp -->
                <div class="line"><s:textfield label="Industry *" type="text" name="industry" /></div>
                <div class="line submit"><s:submit value="Register" /></div>
                
 
                <p>Note: Please make sure your details are correct before submitting form and that all fields marked with * are completed!.</p>
            </s:form>
        </div>
    </body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
 --%>
   <li class='has-sub'><a href='#'><span>client</span></a>
   </li>
   <li class='has-sub'><a href='#'><span>Corporate Training</span></a>
   </li>
     <!-- <li><a href='company/companylogin.jsp'><span>Company Login</span></a></li>
         <li><a href='company/companyregistration.jsp'><span>Company Registration</span></a></li> -->
   <li class='has-sub'><s:a action="list_all_jobs" namespace="/stud"><span>Job Search</span></s:a></a>
   </li>
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
	     <form action="process_register" method="post" namespace="/company" class="register" style="margin-left:0px;">
            <h1>Company Registration</h1>
            <fieldset class="row1">
                <legend>Details
                </legend>
				<p>
                    <label>Email *
                    </label>
                    <input type="email" placeholder="email" name="email" autofocus required />
                    <label>Password*
                    </label>
                    <input type="password"  placeholder="password" name="password" required/>
                </p>
                <p>
                    <label>Company Name *
                    </label>
                    <input type="text" placeholder="company name" name="companyName"  required />
                     </p>
                     <p>
                    <label>City *
                    </label>
                    <input type="text" placeholder="city" name="city" required />
                    <label>State *
                    </label>
                    <input type="text" placeholder="state" name="state" required />
                 </p>
                     <p>
                    <label>Contact Person *
                    </label>
                    <input type="text" placeholder="contact person" name="contactPerson" required />
                    <label>Contact Number *
                    </label>
                    <input type="text" placeholder="contact Number" name="contactNumber" required />
                 </p>
                <p>
                    <label>Industry *
                    </label>
                    <input type="text" placeholder="industry" name="industry" required />
                    <label class="obinfo">* obligatory fields
                    </label>
                </p>
            </fieldset>
            
            
 			<div><button type="submit" class="button">Register &raquo;</button></div>
        </form>
		<div class="main1">
		
		</div>
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
