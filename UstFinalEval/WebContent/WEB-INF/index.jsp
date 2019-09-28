<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body>
	<h1 align="center">
		<b>CLINIC MANAGEMENT SYSTEM</b>
	</h1>
	<table border ="2" width = "40%" cellpadding = "2" style="border: 1px solid black"; align="center">
	<tr>
	<td>
	<div style="text-align: center">
	<br>
		<form action="login" method="post">
			<b>Enter the credentials</b><br> <b>Enter UserName:</b> <input
				type="text" name="un" placeholder="username"><br /> <b>
				EnterPassword :</b> <input type="password" name="pw"
				placeholder="********"><br /> <input type="submit"
				value="submit"><br /> <input type="reset" value="Cancel"><br />
		</form>
	</div>
	</td>
	</tr>
	</table>
</body>
</html>