<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>
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

    <link rel="stylesheet" href="resources/vendors/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/vendors/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/vendors/themify-icons/css/themify-icons.css">
    <link rel="stylesheet" href="resources/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="resources/vendors/selectFX/css/cs-skin-elastic.css">
    <link rel="stylesheet" href="resources/vendors/jqvmap/dist/jqvmap.min.css">
    <link rel="stylesheet" href="resources/assets/css/style.css">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>

</head>

<body>


    <!-- Left Panel -->

    <aside id="left-panel" class="left-panel">
        <nav class="navbar navbar-expand-sm navbar-default">
            <div id="main-menu" class="main-menu collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <!-- <a href="index.html"> <i class="menu-icon fa fa-dashboard"></i>엄마의 지도 </a> -->
                    	<a href="#" onclick="showMarkers();"> <i class="menu-icon fa fa-dashboard"></i>엄마의 지도 </a>
                    
                    
                    </li>
                    <h3 class="menu-title">카테고리</h3><!-- /.menu-title -->
               
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>안전</a>
                        <ul class="sub-menu children dropdown-menu">
	                        <li><i class="fa fa-table"></i><a href="tables-basic.html">소방 안전검사</a></li>
	                        <li><i class="fa fa-table"></i><a href="tables-data.html">감스 검사</a></li>
	                        <li><i class="fa fa-table"></i><a href="tables-data.html">전기 검사</a></li>
	                        <li><i class="fa fa-table"></i><a href="tables-data.html">놀이시설검사</a></li>
	                        <li><i class="fa fa-table"></i><a href="tables-data.html">CCTV 여부</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>위생</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">공기 질 검사</a></li>
                            <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">소독 여부</a></li>
                            <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">수질 검사</a></li>
                            <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">미세지먼지</a></li>
                     
                        </ul>
                    </li>

                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-tasks"></i>교직원</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-fort-awesome"></i><a href="font-fontawesome.html">Font Awesome</a></li>
                            <li><i class="menu-icon ti-themify-logo"></i><a href="font-themify.html">Themefy Icons</a></li>
                        </ul>
                    </li>
                        <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-bar-chart"></i>시설</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-line-chart"></i><a href="charts-chartjs.html">Chart JS</a></li>
                            <li><i class="menu-icon fa fa-area-chart"></i><a href="charts-flot.html">Flot Chart</a></li>
                            <li><i class="menu-icon fa fa-pie-chart"></i><a href="charts-peity.html">Peity Chart</a></li>
                        </ul>
                    </li>

           
                    <h3 class="menu-title">유치원 순위</h3><!-- /.menu-title -->
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-glass"></i>항목별 순위</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-sign-in"></i><a href="page-login.html">Login</a></li>
                            <li><i class="menu-icon fa fa-sign-in"></i><a href="page-register.html">Register</a></li>
                            <li><i class="menu-icon fa fa-paper-plane"></i><a href="pages-forget.html">Forget Pass</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </aside><!-- /#left-panel -->

    <!-- Left Panel -->



          
    <!-- Right Panel -->


                  	

    <div id="right-panel" class="right-panel">
		
		<!--   왼쪽 메뉴 접는 버튼	-->
			<header id="header" class="header">
                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                </div>
			</header>

        <div class="content mt-3">

		<div id="map" style="width:110%;height:700px;"></div>
<p><em>지도를 클릭해주세요!</em></p>

 
<div id="clickLatlng"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=048d3839f2032025c0d6225330618498"></script>
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


<c:forEach items="${kinders}" var="kinder">

markerPosition3 = new kakao.maps.LatLng(${kinder.POINT_X},
		${kinder.POINT_Y});
marker3 = new kakao.maps.Marker({
	position : markerPosition3,
	image : imageChange("${kinder.establish}"), // 마커의 이미지
	map : map
});
marker3.setMap(map);
markerList.push(marker3);		


/// 인포윈도우생성
var iwContent = '<div style="padding:5px; width : 360px; height : 380px;">' +
'<table border=0 cellpadding=0 cellspacing=0><tr><td><img src="resources/images/navi350.png" width = "350" id = "navi" ><table border="0" cellpadding="0" cellspacing="1" width="350" hegiht="500" bgcolor="BBBBBB"> <tr><td align=center bgcolor="E6ECDE" height="35">유치원명</td><td align=center bgcolor="ffffff" >ㅁㄴㅇㅁㄴㅇ</td> </tr> <tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육청명</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육지원청명</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">설립일</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">개원일</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">주소</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">전화번호</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">홈페이지</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">운영시간</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr  </table> </div>',
  iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다
 
  //인포윈도우를 생성합니다
  var infowindow = new kakao.maps.InfoWindow({
  content : iwContent,
  removable : iwRemoveable
  });

  //마커에 클릭이벤트를 등록합니다
  kakao.maps.event.addListener(marker3, 'click', function() {
    // 마커 위에 인포윈도우를 표시합니다
    infowindow.open(map, marker3); 
  });
  
  hideMarkers(); // 클릭해서 생성한것들 숨기기
  
</c:forEach>  	




//배열에 추가된 마커들을 지도에 표시하거나 삭제하는 함수입니다
function setMarkerList(map) {
    for (var i = 0; i < markerList.length; i++) {
        markerList[i].setMap(map);
    }            
}

// "마커 보이기" 버튼을 클릭하면 호출되어 배열에 추가된 마커를 지도에 표시하는 함수입니다
function showMarkers() {
    setMarkerList(map)    
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

</script>
                            </div>
          
                </div>
            </div>

  
          


        </div> <!-- .content -->
    </div><!-- /#right-panel -->

    <!-- Right Panel -->

    <script src="vendors/jquery/dist/jquery.min.js"></script>
    <script src="vendors/popper.js/dist/umd/popper.min.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="assets/js/main.js"></script>


    <script src="vendors/chart.js/dist/Chart.bundle.min.js"></script>
    <script src="assets/js/dashboard.js"></script>
    <script src="assets/js/widgets.js"></script>
    <script src="vendors/jqvmap/dist/jquery.vmap.min.js"></script>
    <script src="vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <script src="vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
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

</body>

</html>
