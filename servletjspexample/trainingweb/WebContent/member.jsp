<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member</title>

<script src="resources/js/bootstrap.min.js"></script>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
						<form class="form-horizontal" action="memberServlet"
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Member Add</legend>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="memberid">Member Id</label>
									<div class="col-md-4">
										<input id="memberid" name="name" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="membername">Member Name</label>
									<div class="col-md-4">
										<input id="membername" name="membername" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
							<!-- 	<div class="form-group">
									<label class="col-md-4 control-label" for="salary">Salary</label>
									<div class="col-md-4">
										<input id="salary" name="salary" type="number" placeholder=""
											class="form-control input-md">

									</div>
								</div> -->

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Add Member">
									</div>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-6">
					<legend>Member List</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">							
							<thead>
								<tr>
									<th>Member Id</th>
									<th>Member Name</th>
									<!--  <th>Salary</th>-->
									<th>Action</th>
								</tr>
							</thead>
							<tbody>


								<c:forEach items="${allMembers}" var="member">
									<tr>
										<td><c:out value="${member.id}" /></td>
										<td><c:out value="${member.memberName}" /></td>
										<!-- <td><c:out value="${employee.salary}" /></td> -->
										<td><a href="memberServlet?id=${member.id}"
											class="btn btn-danger" type="button">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						</div>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>