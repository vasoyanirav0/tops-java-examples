<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="js/validation.js">
		
</script>
</head>
<body>
<form name="frm" method="get" action="">
	<table cellpadding="5px" cellspacing="5px">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" onblur="checkFname();"></td>
			<td><span id="fname"></span></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" onblur="checkEmail();"></td>
			<td><span id="email"></span></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" onblur="checkMobile();"></td>
			<td><span id="mobile"></span></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea rows="5" cols="18" name="address"></textarea></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="femmale">Female
			</td>
		</tr>
		<tr>
			<td>Hobby</td>
			<td>
				<input type="checkbox" name="hobby" value="music">Music<br>
				<input type="checkbox" name="hobby" value="cricket">Cricket<br>
				<input type="checkbox" name="hobby" value="traveling">Traveling<br>
				<input type="checkbox" name="hobby" value="reading">Reading
			</td>
		</tr>
		<tr>
			<td>Education</td>
			<td>
				<select name="education">
					<option>---Select Education---</option>
					<option value="10th">10th</option>
					<option value="10th">12th</option>
					<option value="10th">Diploma</option>
					<option value="10th">BE</option>
					<option value="10th">BCA</option>
					<option value="10th">ME</option>
					<option value="10th">MCA</option>
					<option value="10th">Msc IT</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Resume</td>
			<td><input type="file" name="resume"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="text" name="password" onblur="checkPassword();"></td>
			<td><span id="password"></span></td>
		</tr>
		<tr>
			<td>Confirm Password</td>
			<td><input type="text" name="cpassword" onblur="checkCPassword();"></td>
			<td><span id="cpassword"></span></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Sign Up">
			</td>
		</tr>
	</table>
</form>
</body>
</html>