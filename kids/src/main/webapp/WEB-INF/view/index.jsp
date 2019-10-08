<%@page import="lab.spring.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html class="no-js" lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>엄마의지도</title>
<meta name="description" content="Sufee Admin - HTML5 Admin Template">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="apple-icon.png">
<link rel="shortcut icon" href="favicon.ico">

<link rel="stylesheet"
	href="resources/vendors/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="resources/vendors/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="resources/vendors/themify-icons/css/themify-icons.css">
<link rel="stylesheet"
	href="resources/vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="resources/vendors/selectFX/css/cs-skin-elastic.css">
<link rel="stylesheet"
	href="resources/vendors/jqvmap/dist/jqvmap.min.css">
<link rel="stylesheet" href="resources/assets/css/style.css">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="resources/vendors/bootstrap/bootstrap.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.15/js/bootstrap-multiselect.js"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.15/css/bootstrap-multiselect.css"
	type="text/css" />


<style>
.header{
   width:150%
   }

.main-menu {
	margin-top: 15px;
	width: 98%;
}
.menu-title {
	margin-top: -20px
}
.title_img {
	margin-top: 30px;
}
#hi {
	width: 360px;
	height: 300px;
}
#but {
	width: 100px;
	background-color: yellow;
	border: none;
	color: black;
	padding: 15px 0;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 4px;
	cursor: pointer;
}
.col-sm-7{
   max-width: 10%;
}
</style>

<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body>
	<!-- Left Panel -->

	<aside id="left-panel" class="left-panel">
		<nav class="navbar navbar-expand-sm navbar-default">
			<div id="main-menu" class="main-menu collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#" onclick=showMarkers();> 
					<img id="title_img"alt="엄마의 지도" src="resources/images/title.png" width ="130%" height="130%">
					</a>
					</li>
					
					<h3 class="menu-title">카테고리</h3>
					<!-- /.menu-title -->

<script>
function selectVal(n){
	if(n==1){
		  $('#drop_val').val('1')

	}else if(n==2){
		  $('#drop_val').val('2')

	}else if(n==3){
		  $('#drop_val').val('3')

	}else if(n==4){
		  $('#drop_val').val('4')

	}
}
</script>


			
					<li class="menu-item-has-children dropdown">
					<input id=drop_val type="hidden" value="" />
					<a href="#" onclick="selectVal(1)"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-table"></i>안전
					</a>
						<ul class="sub-menu children dropdown-menu">
							<form method="post" name="multiple_check">
								<ul style="font-family: 'Hanna'";>
									<li class="custom-control custom-checkbox mb-3"><input
										type="checkbox" class="custom-control-input" id="customCheck"
										value="fire_avd_dt" name="safety"> <label
										class="custom-control-label" for="customCheck"
										style="font-family: 'Hanna'";>소방 검사</label></li>
									<li class="custom-control custom-checkbox mb-3"><input
										type="checkbox" class="custom-control-input" id="customCheck2"
										value="gas_ck_dt" name="safety"> <label
										class="custom-control-label" for="customCheck2">가스 검사</label>
									</li>
									<li class="custom-control custom-checkbox mb-3"><input
										type="checkbox" class="custom-control-input" id="customCheck3"
										value="elect_ck_dt" name="safety"> <label
										class="custom-control-label" for="customCheck3">전기 검사</label>
									</li>
									<li class="custom-control custom-checkbox mb-3"><input
										type="checkbox" class="custom-control-input" id="customCheck4"
										name="safety" value="plyg_ck_dt"> <label
										class="custom-control-label" for="customCheck4">놀이 시설
											검사</label></li>
									<li class="custom-control custom-checkbox mb-3"><input
										type="checkbox" class="custom-control-input" id="customCheck5"
										name="safety" value="cctv여부"> <label
										class="custom-control-label" for="customCheck5">CCTV
											여부</label>
								</ul></li>
					</form>
				</ul>
				</li>

				<li class="menu-item-has-children dropdown">
				<input id=drop_val type="hidden" value="" />
				<a href="#" onclick="selectVal(2)"
					class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-table"></i>위생
				</a>
					<ul class="sub-menu children dropdown-menu">
						<form method="post" name="multiple_check">
							<ul style="font-family: 'Hanna'";>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck6"
									name="sanitary" value="arql_chk_dt"> <label
									class="custom-control-label" for="customCheck6">실내공기질</label></li>

								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck7"
									name="sanitary" value="fxtm_dsnf_chk_dt"> <label
									class="custom-control-label" for="customCheck7">정기소독</label></li>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck8"
									name="sanitary" value="mdst_chk_dt"> <label
									class="custom-control-label" for="customCheck8">미세먼지</label></li>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck9"
									name="sanitary" value=ilmn_chk_dt"> <label
									class="custom-control-label" for="customCheck9">조도관리</label></li>

							</ul>
						</form>

					</ul></li>
				<li class="menu-item-has-children dropdown">
				<input id=drop_val type="hidden" value="" />
				<a href="#" onclick="selectVal(3)"
					class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-table"></i>시설정보
				</a>
					<ul class="sub-menu children dropdown-menu">

						<form method="post" name="multiple_check">
							<ul style="font-family: 'Hanna'";>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck10"
									name="example1" value="crcnt"> <label
									class="custom-control-label" for="customCheck10">대규모 유치원</label></li>

								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck11"
									name="example1"> <label class="custom-control-label"
									for="customCheck11" value="hlsparea">소규모 유치원</label></li>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck12"
									name="example1" value="phgrindrarea"> <label
									class="custom-control-label" for="customCheck12">체육장</label></li>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck13"
									name="example1" value="ktchmssparea"> <label
									class="custom-control-label" for="customCheck13">조리실/급식공간</label></li>
									<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck14"
									name="example1" value="ktchmssparea"> <label
									class="custom-control-label" for="customCheck14">보건/위생공간</label></li>

							</ul></li>
				</form>

				</ul>
				</li>

				<li class="menu-item-has-children dropdown">
				<input id=drop_val type="hidden" value="" /><a href="#"
					class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-table"></i>교육환경
				</a>
					<ul class="sub-menu children dropdown-menu">

						<form method="post" name="multiple_check">
							<ul style="font-family: 'Hanna'";>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck15"
									name="example1" value="spcn_thcnt"> <label
									class="custom-control-label" for="customCheck15">특수 교사</label></li>

								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck16"
									name="example1" value="ntcnt"> <label
									class="custom-control-label" for="customCheck16">보건 교사</label></li>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck17"
									name="example1" value="ntrt_thcnt"> <label
									class="custom-control-label" for="customCheck17">영양 교사</label></li>
								<li class="custom-control custom-checkbox mb-3"><input
									type="checkbox" class="custom-control-input" id="customCheck18"
									name="example1" value="vhcl_oprn_yn"> <label
									class="custom-control-label" for="customCheck18">통학버스운영</label></li>
								
							</ul></li>
				</ul>
				</li>
				<h3 class="menu-title">유치원 순위</h3>
				<!-- /.menu-title -->
				<li class="menu-item-has-children dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-glass"></i>항목별
						순위
				</a>
					<ul class="sub-menu children dropdown-menu" /></li>

				<form action="/action_page.php">
					<ul style="font-family: 'Hanna'";>
						<li class="custom-control custom-checkbox mb-3"><input
							type="checkbox" class="custom-control-input" id="customCheck21"
							name="example1"> <label class="custom-control-label"
							for="customCheck21">안전</label></li>

						<li class="custom-control custom-checkbox mb-3"><input
							type="checkbox" class="custom-control-input" id="customCheck22"
							name="example1"> <label class="custom-control-label"
							for="customCheck22">위생</label></li>
						<li class="custom-control custom-checkbox mb-3"><input
							type="checkbox" class="custom-control-input" id="customCheck23"
							name="example1"> <label class="custom-control-label"
							for="customCheck23">시설</label></li>
						<li class="custom-control custom-checkbox mb-3"><input
							type="checkbox" class="custom-control-input" id="customCheck24"
							name="example1"> <label class="custom-control-label"
							for="customCheck23">교육환경</label></li>
					</ul>
				</form>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	</aside>

	<div id="right-panel" class="right-panel">
		<!--   왼쪽 메뉴 접는 버튼   -->
      <header id="header" class="header">
         <div  id="col-sm-7" class="col-sm-7" width="10%">
            <a id="menuToggle" class="menutoggle pull-left"><i
               class="fa fa fa-tasks"></i></a>
         </div>
            <div id = "LOL" align ="right"  style ="width: 85%; font-family:hanna; word-spacing:13px;">
               
               <c:if test="${authInfo.userid eq null}">
               <form action="login.do" method ="post">
                     <label class="legend">아이디</label>
                     <input name ="userid" type="text">
                     <label class="legend">패스워드</label>
                     <input name ="userpwd" type="password">
                       <input type="submit" id="login" value="로그인" />
                     
				</form>
				<a href="./page-register.do" class="btn btn-primary">회원가입</a>
				</c:if>
				
				<c:if test="${authInfo.userid ne null}">
				
					${authInfo.userid}님 환영합니다.
					
					<form action="logout.do" method ="post">
					<input type="submit" id="logout" value="로그아웃" />
					</form>
				</c:if>
				<a href="#" onclick="hideMarkers();">숨기기</a>
			</div>
      </header>


		<div class="content mt-3">
			<div id="map" style="width: 110%; height: 700px;"></div>
			<p>
				<em>지도를 클릭해주세요!</em>
			</p>
			<div id="clickLatlng"></div>
			<script type="text/javascript"
				src="//dapi.kakao.com/v2/maps/sdk.js?appkey=048d3839f2032025c0d6225330618498"></script>

<script>			
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 

mapOption = { 
    center: new kakao.maps.LatLng(37.53403829266374, 126.98904795128267), // 지도의 중심좌표
    level: 8 // 지도의 확대 레벨
};

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

var markerImageUrl = 'resources/images/사립(법인).png', 
markerImageUrl2 = 'resources/images/사립(사인).png',
markerImageUrl3 = 'resources/images/공립(단설)빨강.png',
markerImageUrl4 = 'resources/images/공립(병설)빨강.png',
markerImageSize = new kakao.maps.Size(40, 42), // 마커 이미지의 크기
markerImageOptions = { 
offset : new kakao.maps.Point(20, 42)// 마커 좌표에 일치시킬 이미지 안의 좌표
};

//마커 이미지를 생성한다
var markerImage1 = new kakao.maps.MarkerImage(markerImageUrl, markerImageSize, markerImageOptions);
var markerImage2 = new kakao.maps.MarkerImage(markerImageUrl2, markerImageSize, markerImageOptions);
var markerImage3 = new kakao.maps.MarkerImage(markerImageUrl3, markerImageSize, markerImageOptions);
var markerImage4 = new kakao.maps.MarkerImage(markerImageUrl4, markerImageSize, markerImageOptions);



var markerImage; // 마크 이미지 바꾸기


var markerList = []; // 마커 보이기,숨기기용 배열

//지도에 클릭 이벤트를 등록합니다
//지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
kakao.maps.event.addListener(map, 'click', function(mouseEvent) {        

// 클릭한 위도, 경도 정보를 가져옵니다 
var latlng = mouseEvent.latLng; 


var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
message += '경도는 ' + latlng.getLng() + ' 입니다';

var Map_x = latlng.getLat();
var Map_y = latlng.getLng();

var resultDiv = document.getElementById('clickLatlng'); 
resultDiv.innerHTML = message;


}); // 지도에서 클릭 이벤트 엔드



var markerPosition3;
var marker3;

// function alert200(){
// 	if(${authInfo eq null}){
// 		alert("로그인이 필요한 기능입니다.")	
// 	}
// }

function infoFunction(n){//정보보기
	var C1 = document.getElementById("clean")
	C1.innerHTML=
	'<table border=0 cellpadding=0 cellspacing=0>'+
    '<tr>'+
    '<td align=center bgcolor="E6ECDE" height="35">유치원명</td>'+
    '<td align=center bgcolor="ffffff" >'+NameList[n]+'</td>'+
    '</tr>'+ 
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육청명</td>'+
    '<td width=240 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+EduList[n]+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육지원청명</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+SubEduList[n]+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">설립일</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+EdateList[n]+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">개원일</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+OdateList[n]+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">주소</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+AddList[n]+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">전화번호</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+TelList[n]+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">홈페이지</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10"><a href='+HomeList[n] +'>'+HomeList[n] +'</a>'+'</td>'+
    '</tr>'+
    '<tr>'+
    '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">운영시간</td>'+
    '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+TimeList[n]+'</td>'+
    '</tr>'+
     ' </table>'
	
}

function reviewAddFunction(n){//리뷰등록
	
	var C1 = document.getElementById("clean")
	
	C1.innerHTML='<br><form id="commentForm" name="commentForm" method="post"><div id = "hi" >' +
	"<table width='95%' align=center><tr><td><textarea id='contents' name='contents' cols='45' rows='8' onFocus='edit()' align=center>" +
	"댓글을 작성해주세요</textarea></td></tr><tr><td align=right>" +
	"<input type=button onclick=addComment("+n+"); value=등록 id = but style=font-family: Hanna;>" +
	"<input type='hidden' value='kdid'>"+
	"</td></tr></table></div></form>"
	
	
	
}
function addComment(n){
	if(${authInfo eq null}){
		alert("로그인이 필요한 기능입니다.");	
	}
	else{
		var contents = $('#contents').val();
		var kdid = IDList[n];
		
		
	$.ajax({
		url:"addCommnet.do",
		method:"GET",
		async:false,
		traditional : true,
		data:{
			'kdid':kdid,
			'contents':contents
		},
		success:function(data){
			
			reviewFunction(n);
			},
		 	error:function(request,status,error){
		        alert("code = "+ request.status + " message = " + request.responseText + " error = " + error); // 실패 시 처리
		    }
	});
	
	}
}
function reviewFunction(n){	//리뷰
	
	SearchID(IDList[n],n)
}


function scoreFunction(n){	//점수
	var C1 = document.getElementById("clean")
	C1.innerHTML=NameList[n]
}
function SearchID (n,count){//리뷰보기를 누르면 목록을 받아오는 부분
	
	var C1 = document.getElementById("clean")
	C1.innerHTML= "<br>"
	
	$.ajax({
			url:"commentList.do",
			method:"GET",
			async:false,
			traditional : true,
			data:{
				'kdid':n
			},
			success:function(data){
				var obj = JSON.parse(data);
				
				
				
				for(var i = 0;i<Object.keys(obj.result).length;i++){

		 		var $div = $('<span> '+ obj.result[i][1]["Writer"]+' ('+obj.result[i][2]["Score"]+'점):'+obj.result[i][0]["Contents"]+'</span><hr>');
		 		$('#clean').append($div);
				};
				},
			 	error:function(request,status,error){
			        alert("code = "+ request.status + " message = " + request.responseText + " error = " + error); // 실패 시 처리
			    }
		});
	var $div = $("<input type='button' value='등 록' id = but style='font-family: Hanna;' onclick='reviewAddFunction(" + count + ");' >");
		$('#clean').append($div);
}

var count = 0;
var NameList= [];
var IDList =[];
var EduList=[];
var SubEduList=[];
var EdateList=[];
var OdateList=[];
var AddList=[];
var TelList=[];
var HomeList=[];
var TimeList=[];

<c:forEach items="${kinders}" var="kinder">

NameList.push("${kinder.kindername}")
IDList.push("${kinder.kinderinfoId}")
EduList.push("${kinder.officeedu}")
SubEduList.push("${kinder.subofficeedu}")
EdateList.push("${kinder.edate}")
OdateList.push("${kinder.odate}")
AddList.push("${kinder.addr}")
TelList.push("${kinder.telno}")
HomeList.push("${kinder.hpaddr}")
TimeList.push("${kinder.opertime}")

var positions = [
    {
        content:'<div style="padding:5px; width : 360px; height : 380px;">' +
        '<table border=0 cellpadding=0 cellspacing=0>'+'<tr>'+'<td>'+
        '<img src="resources/images/navi350.png" alt="" usemap="#Map1"/> '+
		'<map name="Map1">' +
		'<area shape = "rect" coords = "7,10,110,40" onclick="infoFunction(' + count+ ');" border = "0" />' +
		'<area alt = "카페" onclick="reviewFunction(' + count+ ');" shape = "rect" border = "0" coords="125,10,230,40" />' +//리뷰보기
		'<area alt = "블로그" onclick="scoreFunction(' + count+ ');" shape = "rect" border = "0" coords="245,10,342,40" />' +//정보보기
		'</map>'+  
		'<div id = "clean">'+
		'<table border=0 cellpadding=0 cellspacing=0>'+
        '<tr>'+
        '<td align=center bgcolor="E6ECDE" height="35">유치원명</td>'+
        '<td align=center bgcolor="ffffff" >'+'${kinder.kindername}'+'</td>'+
        '</tr>'+ 
        '<tr>'+	
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육청명</td>'+
        '<td width=240 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.officeedu}'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육지원청명</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.subofficeedu}'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">설립일</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.edate}'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">개원일</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.odate}'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">주소</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.addr}'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">전화번호</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.telno}'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">홈페이지</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'<a href='+'${kinder.hpaddr}>'+'${kinder.hpaddr}'+'</a>'+'</td>'+
        '</tr>'+
        '<tr>'+
        '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">운영시간</td>'+
        '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'${kinder.opertime}'+'</td>'+
        '</tr>'+
         ' </table>'+
         '</div>' +
        '</div>', 
        latlng:new kakao.maps.LatLng(${kinder.POINT_X},
        		${kinder.POINT_Y})
    }
]
count++;
    // 마커를 생성합니다
    var marker3 = new kakao.maps.Marker({
    	position : positions[0].latlng,
    	image : imageChange("${kinder.establish}"), // 마커의 이미지
    	map : map
    });

marker3.setMap(map);
markerList.push(marker3);



  
  var infowindow = new kakao.maps.InfoWindow({
      content : positions[0].content, // 인포윈도우에 표시할 내용
      removable : true
  });
  
  kakao.maps.event.addListener(marker3, 'click', makeOverListener(map, marker3, infowindow)); 


//인포윈도우를 표시하는 클로저를 만드는 함수입니다 
  function makeOverListener(map, marker3, infowindow) { 
  	return function() {
  		infowindow.open(map, marker3);
  	};
  }
</c:forEach>  	

//배열에 추가된 마커들을 지도에 표시하거나 삭제하는 함수입니다
function setMarkerList(map) {
		for (var i = 0; i < markerList.length; i++) {
	        markerList[i].setMap(map);
	    }   		
}

// "마커 보이기" 버튼을 클릭하면 호출되어 배열에 추가된 마커를 지도에 표시하는 함수입니다
function showMarkers() {
	hideMarkers();
	markerList = getSafetyArr(map);
}

// "마커 감추기" 버튼을 클릭하면 호출되어 배열에 추가된 마커를 지도에서 삭제하는 함수입니다
function hideMarkers() {
    setMarkerList(null);    
}

function imageChange(n){
	if(n=="공립(병설)") { markerImage = markerImage4; }
	else if(n=="공립(단설)") { markerImage = markerImage3; }
	else if(n=="사립(사인)") { markerImage = markerImage2; }
	else if(n=="사립(법인)") { markerImage = markerImage1; }
	return markerImage;
}


function getSafetyArr(map) {
	
	hideMarkers();
	
	var message={};
	
if($('#drop_val').val()==1){
    $('input:checkbox[name=safety]:checked').each(function(i){
      
        var key = $(this).val()
         message[key]=  key;
        
       
    }); // 체크된 것만 뽑아 배열에 push
    }
    else  if($('#drop_val').val()==2){
    	 $('input:checkbox[name=sanitary]:checked').each(function(i){
    	      
    	        var key = $(this).val()
    	         message[key]=  key;
    	        
    	       
    	    }); // 체크된 것만 뽑아 배열에 push
    }
   else  if($('#drop_val').val()==3){
	   $('input:checkbox[name=environment]:checked').each(function(i){
		      
	        var key = $(this).val()
	         message[key]=  key;
	        
	       
	    }); // 체크된 것만 뽑아 배열에 push
       }
   else  if($('#drop_val').val()==4){
	   $('input:checkbox[name=teacher]:checked').each(function(i){
		      
	        var key = $(this).val()
	         message[key]=  key;
	        
	       
	    }); // 체크된 것만 뽑아 배열에 push
   }

    $.ajax({
        type: 'POST',
        url:'./search.do',
        dataType: 'json',
        contentType:'application/json',
        data: JSON.stringify(message), //메시지에 셀렉트 된 인자 정보를 받아서 컨트롤러단으로 넘김. 
        success: function(data) {
        	alert("connect success")
        	console.log(message)
        	count = 0;
        	markerList = []; // 마커 보이기,숨기기용 배열
        	
               $.each(data, function(key, value){	 
            	   
            	
                   var point_x = value["point_X"];
                   var point_y = value["point_Y"];
                   
				console.log(point_x, point_y)
                   var markerImageUrl = 'resources/images/사립(법인).png', 
                   markerImageUrl2 = 'resources/images/사립(사인).png',
                   markerImageUrl3 = 'resources/images/공립(단설)빨강.png',
                   markerImageUrl4 = 'resources/images/공립(병설)빨강.png',
                   
                   markerImageSize = new kakao.maps.Size(40, 42), // 마커 이미지의 크기
                   
                   markerImageOptions = { 
                   offset : new kakao.maps.Point(20, 42)// 마커 좌표에 일치시킬 이미지 안의 좌표
                   };

                   var markerImage; // 마크 이미지 바꾸기
                 
                   
                   
                   var marker = new kakao.maps.Marker({
                       map: map, // 마커를 표시할 지도
                       position: new kakao.maps.LatLng(point_x,point_y), // 마커를 표시할 위치
                       title :value["kindername"], // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
                       image :  imageChange(value["establish"]), // 마커 이미지 
                       clickable : true
                   });
               
               marker.setMap(map);
               markerList.push(marker);
               
               count++;
               var point_x='';
              
               if($('#drop_val').val()==1){
             
                    var fire_avd_dt='';
                    var gas_ck_dt='';
                    var elect_ck_dt='';
                    var plyg_ck_dt='';
                    
             
                    
                    if(value["fire_avd_dt"] = 'null'){
                       fire_avd_dt='준비중입니다.';
                    } else {
                       fire_avd_dt = value["fire_avd_dt"];
                    }
                    
                    if(value["gas_ck_dt"] = 'null'){
                       gas_ck_dt='준비중입니다.';
                    } else {
                       gas_ck_dt = value["gas_ck_dt"];
                    }
                    
                    if(value["elect_ck_dt"] = 'null'){
                       elect_ck_dt='준비중입니다.';
                    } else {
                       elect_ck_dt = value["elect_ck_dt"];
                    }
                    if(value["plyg_ck_dt"] = 'null'){
                       plyg_ck_dt='준비중입니다.';
                    } else {
                       plyg_ck_dt = value["plyg_ck_dt"];
                    }
                }
                
                else  if($('#drop_val').val()==2){
                
                    var arql_chk_dt='';
                    var fxtm_dsnf_chk_dt='';
                    var mdst_chk_dt='';
                    var ilmn_chk_dt='';
                    
                    
                    if(value["arql_chk_dt"] = 'null'){
                    	arql_chk_dt='준비중입니다.';
                    } else {
                    	arql_chk_dt = value["arql_chk_dt"];
                    }
                    
                    if(value["fxtm_dsnf_chk_dt"] = 'null'){
                    	fxtm_dsnf_chk_dt='준비중입니다.';
                    } else {
                    	fxtm_dsnf_chk_dt = value["fxtm_dsnf_chk_dt"];
                    }
                    
                    if(value["mdst_chk_dt"] = 'null'){
                    	mdst_chk_dt='준비중입니다.';
                    } else {
                    	mdst_chk_dt = value["mdst_chk_dt"];
                    }
                    if(value["ilmn_chk_dt"] = 'null'){
                    	ilmn_chk_dt='준비중입니다.';
                    } else {
                    	ilmn_chk_dt = value["ilmn_chk_dt"];
                    }
                }
                 
                  else  if($('#drop_val').val()==3){
                         
                      }
                  else  if($('#drop_val').val()==4){
                     
                  }
                

               
               
               var iwContent =
             	  '<div style="padding:5px; width : 360px; height : 380px;">' +
                   '<table border=0 cellpadding=0 cellspacing=0>'+'<tr>'+'<td>'+
                   '<img src="resources/images/navi350.png" width = "350" id = "navi" >'+
                   
                   '<map name="Map1">' +
	           		'<area shape = "rect" coords = "7,10,110,40" onclick="infoFunction(' + count+ ');" border = "0" />' +
	           		'<area alt = "카페" onclick="reviewFunction(' + count+ ');" shape = "rect" border = "0" coords="125,10,230,40" />' +//리뷰보기
	           		'<area alt = "블로그" onclick="scoreFunction(' + count+ ');" shape = "rect" border = "0" coords="245,10,342,40" />' +//정보보기
	           		'</map>'+
	           		
                   '<table border=0 cellpadding=0 cellspacing=0>'+
                   '<tr>'+
                   '<td align=center bgcolor="E6ECDE" height="35">유치원명</td>'+
                   '<td align=center bgcolor="ffffff" >'+value["kindername"]+'</td>'+
                   '</tr>'+ 
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육청명</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["officeedu"]+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육지원청명</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["subofficeedu"]+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">설립일</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["edate"]+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">개원일</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["odate"]+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">주소</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["addr"]+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">전화번호</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["telno"]+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">홈페이지</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'<a href='+value["hpaddr"]+'>'+value["hpaddr"]+'</a>'+'</td>'+
                   '</tr>'+
                   '<tr>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">운영시간</td>'+
                   '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value["opertime"]+'</td>'+
                   '</tr>'+
                    ' </table>'+ 
                   '</div>'
                    
              var infowindow = new kakao.maps.InfoWindow({
                  content : iwContent,
                  removable : true
              });

              kakao.maps.event.addListener(marker, 'click', makeOverListener(map, marker, infowindow)); 
              function makeOverListener(map, marker, infowindow) { 
              	return function() {
              		infowindow.open(map, marker);
              	};
              }
              
            });
        	
        	
        	
    },
    error :function(){
 	   alert('errrrrrrrror');
}
    });
    }
</script>
		</div>

	</div>
	</div>
	</div>
	<!-- .content -->
	</div>
	<!-- /#right-panel -->

	<!-- Right Panel -->

	<script src="resources/vendors/jquery/dist/jquery.min.js"></script>
	<script src="resources/vendors/popper.js/dist/umd/popper.min.js"></script>
	<script src="resources/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="resources/assets/js/main.js"></script>


	<script src="resources/vendors/chart.js/dist/Chart.bundle.min.js"></script>
	<script
		src="resources/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
	<script src="resources/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
	<script>
        (function($) {
            "use strict";

            jQuery('#vmap').vectorMap({
                map: 'world_en',
                backgroundColor: null,
                color: '#ffffff',
                hoverOpacity: 0.7,
                selectedColor: '#1de9b6',
                enableZoom: true,
                showTooltip: true,
                values: sample_data,
                scaleColors: ['#1de9b6', '#03a9f5'],
                normalizeFunction: 'polynomial'
            });
        })(jQuery);
        
        
    </script>
</script>

</body>

</html>
