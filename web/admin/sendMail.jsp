<%-- 
    Document   : sendMail
    Created on : 22 Jul, 2010, 9:25:46 PM
    Author     : Smita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<form action="send" method="POST">
            <table border="0" align="center" cellpadding="5">
                <tbody>
                    <thead><tr> <td colspan="3" align="center">
                    <b> Send Mail </b> </td> </tr> </thead>
                    <tr>
                        <td> To </td> <td> : </td>
                        <td> <input type="text" name="to" value="" /> </td>
                    </tr>
                    <tr>
                        <td> Subject </td> <td> : </td>
                        <td> <input type="text" name="subject" value="" /> </td>
                    </tr>
                    <tr>
                        <td> Message </td> <td> : </td>
                        <td> <textarea name="message" rows="8" cols="30">
                        </textarea></td>
                    </tr>
                    <tr>
                        <td colspan="3" align="center">
                        <input type="submit" value="Send Mail" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="Reset" />
                        <td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
