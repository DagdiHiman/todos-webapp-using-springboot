<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	
    <head>
        <title>todos of ${name}</title>
    </head>
    
    <body>
    	<div class="container">
			<table class="table table-striped">
				<caption>Your todos are:-></caption>
				<thead>
					<tr>
						<th>Description</th>
						<th>Target Date</th>
						<th>Done?</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<!-- JSTL For Loop -->
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.desc}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">UPDATE</a></td>
							<td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">DELETE</a></td>
						</tr>
					</c:forEach>
	
				</tbody>
			</table>
		
			<a href="/add-todo">ADD todo</a>
			
			<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
			<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		</div>
    </body>
</html>