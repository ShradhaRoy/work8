<html>
<head>
<style>
.error {
	color: red;
	font-weight: bold
}
</style>
</head>
<body>
	<div align="center">
		<form action="associateDetails" method="post">
			<table>
				<tr>
					<td>AssociateId</td>
					<td><input type="text" name="associateId"></td>
					<td><input type="submit" value="click"></td>
					<td><a href="index">||Home||</a></td>
				</tr>
			</table>
		</form>
	</div>
	<div align="center" class="error">${errorMessge }</div>
	<br>
	<br>
	<div align="center">
		<table>
			<tr>
				<th>AssociateId</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>EmailId</th>
			</tr>
			<tr>
				<td>${associate.associateId }</td>
				<td>${associate.firstName }</td>
				<td>${associate.lastName }</td>
				<td>${associate.emailId }</td>
			</tr>
		</table>
	</div>
</body>
</html>