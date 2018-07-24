<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="css/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/fonts.css" rel="stylesheet" type="text/css" media="all" />

<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<body>
<div id="header">
	<div id="menu" class="container">
		<ul>
			<li class="current_page_item"><a href="#page" accesskey="1" title="">Homepage</a></li>
			<li><a href="#portfolio-wrapper" accesskey="2" title="">API</a></li>
		</ul>
	</div>
</div>
<div id="logo" class="container">
	<h1><span>Guillermo Galiano</span></h1>
</div>
<div id="page" class="container">
	<div id="content">
		<div class="title">
			<h2>Welcome to our BMW API REST</h2>
			<span class="byline">Evaluation test for WBS</span>
		</div>
		<p>This is an<strong> API REST for BMW</strong>, where you can see curiosities about the most distinguished cars 
		of your favorite automotive brand. You can get all of them or only one by model.</p> 
		<p>We offer relevant information about our most emblematic models such as the model, the year of release, 
		best selling color and price. Have fun :) </p>
	</div>
	<div id="sidebar" class="image image-full"><img src="images/BMW-M3.png" alt="" /></div>
</div>
<div id="portfolio-wrapper">
	<div id="portfolio" class="container">
		<div class="major">
			<h2>API REST Features</h2>
			<span class="byline">Find your BMW detail</span>
		</div>
		<div class="column1">
			<a href="#" class="image image-full"><img src="images/BMW-Collection.jpg" height="220" alt="" /></a>
			<div class="box">
				<p>To find all our cars, you must acces the path "api/cars"" or click on the button below.</p>
				<a href="api/cars" class="button">Find all</a>
			</div>
		</div>			
		<div class="column2">
			<a href="#" class="image image-full"><img src="images/BMW-M1.jpg" height="220" alt="" /></a>
			<div class="box">
				<p>To find a specific car, you only have to access the following path "api/car?id=" <strong>indicating the car id</strong> or by clicking
				on the button below.</p>
				<input type="text" id="carId" />
				<a href="" onclick="this.href='api/car?id=' + document.getElementById('carId').value" class="button">Find this car</a>
			</div>
		</div>
	</div>
</div>
<div id="copyright" class="container">
	<p>&copy; Test for WBS by Guillermo Galiano.</p>
</div>
</body>
</html>
