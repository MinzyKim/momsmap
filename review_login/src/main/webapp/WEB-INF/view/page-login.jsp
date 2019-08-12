<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 화면</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
<link rel="icon" type="image/png" href="resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/assets/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/assets/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/vendor/animate.css/animate.css">
<!--===============================================================================================-->	
<link rel="stylesheet" type="text/css" href="resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
<link rel="stylesheet" type="text/css" href="resources/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/assets/css/util.css">
<link rel="stylesheet" type="text/css" href="resources/assets/css/main.css">
<!--===============================================================================================-->
</head>
<script type="text/javascript">
function moveJoin(){
	document.form1.submit();
}
</script>
<body>
    <div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-50 p-b-90">
				<form class="login100-form validate-form flex-sb flex-w">
					<span class="login100-form-title p-b-51">

<h4>로그인</h4>
</span>
<form method='post' action='./login.do'>
<div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
    <input class="input100" type="text" id="userid" name="userid" placeholder="Userid">
    <span class="focus-input100"></span>
</div>
<br>
<div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
    <input class="input100" type="password" id="userpwd" name="userpwd" placeholder="Password">
    <span class="focus-input100"></span>
</div>
    <div class="container-login100-form-btn m-t-17">
      <input type="submit" id="login" value="로그인" name="login" class="login100-form-btn">
    </div>
<div class="flex-sb-m w-full p-t-3 p-b-24">
    <div class="contact100-form-checkbox">
        <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
        <label class="label-checkbox100" for="ckb1">
          아이디 저장
        </label>
    </div>
</form>
<form name="form1" method="get" action="page-register.jsp">
<input type="hidden" name="select" value="1"/>
<input type="button" value="회원가입" onclick="moveJoin()">
</form>

<!--===============================================================================================-->
<script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/bootstrap/js/popper.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="resources/assets/js/main.js"></script>



</body>
</html>