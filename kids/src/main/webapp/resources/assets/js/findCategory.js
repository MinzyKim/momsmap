function getSafetyArr(){
  
    var message = { };
    $('input:checkbox[name=safety]:checked').each(function(i){
 	  // safety_arr.push($(this).val());
    	 var key = $(this).val()
    	  message[key]=  key;
    	//$.extend(message, object1);
    }); // 체크된 것만 뽑아 배열에 push
    

   /* function eventOpen()
    {
 	   $("input:checkbox[name='safety']:checked").each(function(){
 	   var checkList="";
 	   if($(this).prop('checked') == true){
 		   checkList += $(this).val()+", ";
 	   }
    });
 	   alert(checkList);
    }*/

  //  var message = { "safety": safety_arr };
    
 
//    var path = document.location.pathname;
//    var directory = path.substring(path.indexOf('/'), path.lastIndexOf('/'));
//    
//    console.log(directory);
    var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
    
    $.ajax({
        type: 'POST',
        url:'./search.do',
        dataType: 'json',
        contentType:'application/json',
        data: JSON.stringify(message), //메시지에 셀렉트 된 인자 정보를 받아서 컨트롤러단으로 넘김. 
        success: function(data) {
        	alert("connect success")
               $.each(data, function(key, value){	 
            	
                   var point_x = value["point_X"];
                   var point_y = value["point_Y"];
                  

                 

                
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
                   
                   function imageChange(n){
               		if(n=="공립(병설)") { markerImage = markerImage4; }
               		else if(n=="공립(단설)") { markerImage = markerImage3; }
               		else if(n=="사립(사인)") { markerImage = markerImage2; }
               		else if(n=="사립(법인)") { markerImage = markerImage1; }
               		return markerImage;
               	}

                   var marker = new kakao.maps.Marker({
                       map: map, // 마커를 표시할 지도
                       position: new kakao.maps.LatLng(point_x,point_y), // 마커를 표시할 위치
                       title :value["kindername"], // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
                       image :  imageChange(value["establish"]), // 마커 이미지 
                       clickable : true
                   });
               
               marker.setMap(map);
               markerList.push(marker);
               
               var point_x='';
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
               
               
               var iwContent =
             	  '<div style="padding:5px; width : 360px; height : 380px;">' +
                   '<table border=0 cellpadding=0 cellspacing=0>'+'<tr>'+'<td>'+
                   '<img src="resources/images/navi350.png" width = "350" id = "navi" >'+
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
            
              // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
               // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

              // 인포윈도우를 생성합니다
              var infowindow = new kakao.maps.InfoWindow({
                  content : iwContent,
                  removable : true
              });

              kakao.maps.event.addListener(marker, 'click', makeOverListener(map, marker, infowindow)); 


            //인포윈도우를 표시하는 클로저를 만드는 함수입니다 
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