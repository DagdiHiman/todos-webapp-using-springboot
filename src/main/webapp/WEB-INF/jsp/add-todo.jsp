<html>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <head>
        <title>add-todo</title>
    </head>
    <body>
    	<div class="container">
    		<br>
			Hey ${name}, add a new todo->
			<br>
			<form method="post">
				<fieldset class="form-goup" >
					<label >Desciption:</label>
					<input type ="text" class="form-control" name="desc" required="required"/>
				</fieldset>
				<br>
				<input type="submit" class="btn btn-success" value="Submit">
			</form>
		</div>
		
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>