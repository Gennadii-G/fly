<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>

    <!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>jh3</title>

    <!-- Mobile Specific Metas
	================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
	================================================== -->
	<link rel="stylesheet" href="/resources/css/style.css">

	<!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

	<script src="js/jquery1111.min.js" type="text/javascript"></script>
	<script src="/resources/js/scripts.js" type="text/javascript"></script>
</head>
<body>
<div class="login-page">
  <div class="form">
    <form:form method="POST" commandName="user" action="check-user">
        <fieldset>

            <form:label path="name">Name-></form:label>
            <form:input path="name"/>
            <form:label path="password">Password-></form:label>
            <form:input path="password"/>
        </fieldset>
    </form:form>
  </div>
</div>
</body>