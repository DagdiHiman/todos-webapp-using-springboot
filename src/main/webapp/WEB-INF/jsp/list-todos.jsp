<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>todos of ${name}</title>
    </head>
    <body>
		<H1>Ur todos-></H1>
		<table>
			<caption>Your todos are:</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Done?</th>
				</tr>
			</thead>
			<tbody>
				<!-- JSTL For Loop -->
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		
		<a href="/add-todo">ADD todo</a>
    </body>
</html>