<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	href="vendors/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="vendors/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="vendors/themify-icons/css/themify-icons.css">
<link rel="stylesheet"
	href="vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet" href="vendors/selectFX/css/cs-skin-elastic.css">
<link rel="stylesheet" href="vendors/jqvmap/dist/jqvmap.min.css">
<link rel="stylesheet" href="assets/css/style.css">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>

</head>

<body>


	<!-- Left Panel -->

	<aside id="left-panel" class="left-panel">
		<nav class="navbar navbar-expand-sm navbar-default">
			<div id="main-menu" class="main-menu collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.html"> <i
							class="menu-icon fa fa-dashboard"></i>엄마의 지도
					</a></li>
					<h3 class="menu-title">카테고리</h3>
					<!-- /.menu-title -->

					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-table"></i>안전
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="fa fa-table"></i><a href="tables-basic.html">소방
									안전검사</a></li>
							<li><i class="fa fa-table"></i><a href="tables-data.html">감스
									검사</a></li>
							<li><i class="fa fa-table"></i><a href="tables-data.html">전기
									검사</a></li>
							<li><i class="fa fa-table"></i><a href="tables-data.html">놀이시설검사</a></li>
							<li><i class="fa fa-table"></i><a href="tables-data.html">CCTV
									여부</a></li>
						</ul></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-th"></i>위생
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="menu-icon fa fa-th"></i><a
								href="forms-basic.html">공기 질 검사</a></li>
							<li><i class="menu-icon fa fa-th"></i><a
								href="forms-basic.html">소독 여부</a></li>
							<li><i class="menu-icon fa fa-th"></i><a
								href="forms-basic.html">수질 검사</a></li>
							<li><i class="menu-icon fa fa-th"></i><a
								href="forms-basic.html">미세지먼지</a></li>

						</ul></li>

					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-tasks"></i>교직원
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="menu-icon fa fa-fort-awesome"></i><a
								href="font-fontawesome.html">Font Awesome</a></li>
							<li><i class="menu-icon ti-themify-logo"></i><a
								href="font-themify.html">Themefy Icons</a></li>
						</ul></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-bar-chart"></i>시설
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="menu-icon fa fa-line-chart"></i><a
								href="charts-chartjs.html">Chart JS</a></li>
							<li><i class="menu-icon fa fa-area-chart"></i><a
								href="charts-flot.html">Flot Chart</a></li>
							<li><i class="menu-icon fa fa-pie-chart"></i><a
								href="charts-peity.html">Peity Chart</a></li>
						</ul></li>


					<h3 class="menu-title">유치원 순위</h3>
					<!-- /.menu-title -->
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-glass"></i>항목별 순위
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="menu-icon fa fa-sign-in"></i><a
								href="page-login.html">Login</a></li>
							<li><i class="menu-icon fa fa-sign-in"></i><a
								href="page-register.html">Register</a></li>
							<li><i class="menu-icon fa fa-paper-plane"></i><a
								href="pages-forget.html">Forget Pass</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	</aside>
	<!-- /#left-panel -->

	<!-- Left Panel -->




	<!-- Right Panel -->




	<div id="right-panel" class="right-panel">

		<!--   왼쪽 메뉴 접는 버튼	-->
		<header id="header" class="header">
			<div class="col-sm-7">
				<a id="menuToggle" class="menutoggle pull-left"><i
					class="fa fa fa-tasks"></i></a>
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
					center : new kakao.maps.LatLng(37.50139779506931,
							127.03967257789479), // 지도의 중심좌표
					level : 3
				// 지도의 확대 레벨
				};

				var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

				var markerImageUrl = './images/사립(법인).png', markerImageUrl2 = './images/사립(사인).png', markerImageUrl3 = './images/공립(단설)빨강.png', markerImageUrl4 = './images/공립(병설)빨강.png', markerImageSize = new kakao.maps.Size(
						40, 42), // 마커 이미지의 크기
				markerImageOptions = {
					offset : new kakao.maps.Point(20, 42)
				// 마커 좌표에 일치시킬 이미지 안의 좌표
				};

				//마커 이미지를 생성한다
				var markerImage1 = new kakao.maps.MarkerImage(markerImageUrl,
						markerImageSize, markerImageOptions);
				var markerImage2 = new kakao.maps.MarkerImage(markerImageUrl2,
						markerImageSize, markerImageOptions);
				var markerImage3 = new kakao.maps.MarkerImage(markerImageUrl3,
						markerImageSize, markerImageOptions);
				var markerImage4 = new kakao.maps.MarkerImage(markerImageUrl4,
						markerImageSize, markerImageOptions);

				var markerImage;

				function Random(n) {
					if (n == 1) {
						markerImage = markerImage1;
					} else if (n == 2) {
						markerImage = markerImage2;
					} else if (n == 3) {
						markerImage = markerImage3;
					} else if (n == 4) {
						markerImage = markerImage4;
					}
					console.log(markerImage);
					return markerImage;
				}

				//지도를 클릭한 위치에 표출할 마커입니다
				var marker = new kakao.maps.Marker({
					// 지도 중심좌표에 마커를 생성합니다 
					position : map.getCenter(),
					image : markerImage1, // 마커의 이미지
					map : map
				// 마커를 표시할 지도 객체
				});
				//지도에 마커를 표시합니다
				marker.setMap(map);

				//지도에 클릭 이벤트를 등록합니다
				//지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
				kakao.maps.event
						.addListener(
								map,
								'click',
								function(mouseEvent) {

									var number = Math
											.floor((Math.random() * 4) + 1);

									// 클릭한 위도, 경도 정보를 가져옵니다 
									var latlng = mouseEvent.latLng;

									// 마커 위치를 클릭한 위치로 옮깁니다
									marker.setPosition(latlng);

									var message = '클릭한 위치의 위도는 '
											+ latlng.getLat() + ' 이고, ';
									message += '경도는 ' + latlng.getLng()
											+ ' 입니다';

									var Map_x = latlng.getLat();
									var Map_y = latlng.getLng();

									var resultDiv = document
											.getElementById('clickLatlng');
									resultDiv.innerHTML = message;

									var markerPosition = new kakao.maps.LatLng(
											Map_x, Map_y);

									// 마커를 생성
									Random(number);

									var marker2 = new kakao.maps.Marker({
										position : markerPosition,
										image : markerImage, // 마커의 이미지
										map : map
									// 마커를 표시할 지도 객체
									});
									marker2.setMap(map);

									/// 인포윈도우생성
									var iwContent = '<div style="padding:5px; width : 360px; height : 380px;">'
											+ '<table border=0 cellpadding=0 cellspacing=0><tr><td><img src="navi350.png" width = "350" id = "navi" ><table border="0" cellpadding="0" cellspacing="1" width="350" hegiht="500" bgcolor="BBBBBB"> <tr><td align=center bgcolor="E6ECDE" height="35">유치원명</td><td align=center bgcolor="ffffff" >ㅁㄴㅇㅁㄴㅇ</td> </tr> <tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육청명</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육지원청명</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">설립일</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">개원일</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">주소</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">전화번호</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">홈페이지</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr><tr><td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">운영시간</td><td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">456</td></tr  </table> </div>', iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

									//인포윈도우를 생성합니다
									var infowindow = new kakao.maps.InfoWindow(
											{
												content : iwContent,
												removable : iwRemoveable
											});

									//마커에 클릭이벤트를 등록합니다
									kakao.maps.event.addListener(marker2,
											'click', function() {
												// 마커 위에 인포윈도우를 표시합니다
												infowindow.open(map, marker2);
											});

								});

				var markerPosition3 = new kakao.maps.LatLng(37.50393015990904,
						127.03803403247034);

				var marker3 = new kakao.maps.Marker({
					position : markerPosition3,
					image : markerImage4, // 마커의 이미지
					map : map
				// 마커를 표시할 지도 객체
				});
				marker3.setMap(map);

				var markerPosition4 = new kakao.maps.LatLng(37.50338090534929,
						127.0369028067005);

				var marker3 = new kakao.maps.Marker({
					position : markerPosition4,
					image : markerImage3, // 마커의 이미지
					map : map
				// 마커를 표시할 지도 객체
				});
				marker3.setMap(map);
			</script>
		</div>

	</div>
	</div>





	</div>
	<!-- .content -->
	</div>
	<!-- /#right-panel -->

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
				map : 'world_en',
				backgroundColor : null,
				color : '#ffffff',
				hoverOpacity : 0.7,
				selectedColor : '#1de9b6',
				enableZoom : true,
				showTooltip : true,
				values : sample_data,
				scaleColors : [ '#1de9b6', '#03a9f5' ],
				normalizeFunction : 'polynomial'
			});
		})(jQuery);
	</script>

</body>

</html>
