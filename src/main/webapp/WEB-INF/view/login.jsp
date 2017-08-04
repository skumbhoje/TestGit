<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="option6">
<%@include file="topBar.jsp" %>

<!-- page wapper-->
<div class="columns-container">
    <div class="container" id="columns">
        <!-- breadcrumb -->
        <div class="breadcrumb clearfix">
            <a class="home" href="#" title="Return to Home">Home</a>
            <span class="navigation-pipe">&nbsp;</span>
            <span class="navigation_page">Authentication</span>
        </div>
        <!-- ./breadcrumb -->
        <!-- page heading-->
        <h2 class="page-heading">
            <span class="page-heading-title2">Authentication</span>
        </h2>
        <!-- ../page heading-->
        <div class="page-content">
            <div class="row">
                <div class="col-sm-6">
                    <div class="box-authentication">
                        <h3 style="color:black">Create an account</h3>
                        <p>Please enter your email address to create an account.</p>
                        <label for="emmail_register">Email address</label>
                        <input id="emmail_register" type="text" class="form-control">
                        <button class="button"><i class="fa fa-user"></i> Create an account</button>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="box-authentication">
                        <h3 style="color:black">Already registered?</h3>
                        <label for="emmail_login">Email address</label>
                        <input id="emmail_login" type="text" class="form-control">
                        <label for="password_login">Password</label>
                        <input id="password_login" type="password" class="form-control">
                        <p class="forgot-pass"><a href="#">Forgot your password?</a></p>
                        <button class="button"><i class="fa fa-lock"></i> Sign in</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- ./page wapper-->

<%@include file="footer.jsp" %> 

</body>
</html>