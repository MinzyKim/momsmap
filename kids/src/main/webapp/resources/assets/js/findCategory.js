$('#customCheck').multiselect({
       includeSelectAllOption: true,
       maxHeight: 300,
      onDropdownHide: function(event) {
         var map = new kakao.maps.Map(mapContainer, mapOption);
         var selected_fire = $("#customCheck input:selected");
       
           
           var safety_arr = [];
           selected_safety.each(function(i) {
        	   safety_arr.push($(this).val()); });
         

           var message = { "safety": facilty_arr};
           

           $.ajax({
               type: 'POST',
               url:'./search.do',
               data: message, //메시지에 셀렉트 된 인자 정보를 받아서 컨트롤러단으로 넘김. 
               success: function(data) {
                  alert("통신성공")
                      $.each(data, function(key,value){
                          var x_coordinate = value.point_x
                          var y_coordinate = value.point_y
                          
                         
                          var markerImageUrl = 'resources/images/사립(법인).png', 
                          markerImageUrl2 = 'resources/images/사립(사인).png',
                          markerImageUrl3 = 'resources/images/공립(단설)빨강.png',
                          markerImageUrl4 = 'resources/images/공립(병설)빨강.png';


                          
                          var imageSrc = null;
                          
                        		if(value.establish=="공립(병설)") { imageSrc = markerImage4; }
                        		else if(value.establish=="공립(단설)") { imageSrc = markerImage3; }
                        		else if(value.establish=="사립(사인)") { imageSrc = markerImage2; }
                        		else if(value.establish=="사립(법인)") { imageSrc = markerImage1; }
                        		
                        	

                          
                        
                        	var markerImageSize = new kakao.maps.Size(40, 42);
                           var markerImage = new kakao.maps.MarkerImage(imageSrc, markerImageSize);
                          
                          
                          var marker = new kakao.maps.Marker({
                              map: map, // 마커를 표시할 지도
                              position: new kakao.maps.LatLng(y_coordinate,x_coordinate), // 마커를 표시할 위치
                              title :value.kindername, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
                              image : markerImage, // 마커 이미지 
                              clickable : true
                          });
                      
                      marker.setMap(map);
                      
                      
                      var iwContent =
                    	  '<div style="padding:5px; width : 360px; height : 380px;">' +
                          '<table border=0 cellpadding=0 cellspacing=0>'+'<tr>'+'<td>'+
                          '<img src="resources/images/navi350.png" width = "350" id = "navi" >'+
                          '<table border=0 cellpadding=0 cellspacing=0>'+
                          '<tr>'+
                          '<td align=center bgcolor="E6ECDE" height="35">유치원명</td>'+
                          '<td align=center bgcolor="ffffff" >'+value.kindername+'</td>'+
                          '</tr>'+ 
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육청명</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.officeedu+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">교육지원청명</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.subofficeedu+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">설립일</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.edate+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">개원일</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.odate+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">주소</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.addr+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">전화번호</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.telno+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">홈페이지</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+'<a href='+value.hpaddr+'>'+value.hpaddr+'</a>'+'</td>'+
                          '</tr>'+
                          '<tr>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "E6ECDE" height ="35">운영시간</td>'+
                          '<td width=100 hegiht=500 align=center bgcolor= "ffffff" style="padding-left:10">'+value.opertime+'</td>'+
                          '</tr>'+
                           ' </table>'+ 
                          '</div>'
                   
                    , // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                      iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

                     // 인포윈도우를 생성합니다
                     var infowindow = new kakao.maps.InfoWindow({
                         content : iwContent,
                         removable : iwRemoveable
                     });
       
                     // 마커에 클릭이벤트를 등록합니다
                     kakao.maps.event.addListener(marker, 'click', function() {
                           // 마커 위에 인포윈도우를 표시합니다
                           infowindow.open(map, marker);  
                     });
                   });
        
           },
           error : onerror
       });
     }
   });