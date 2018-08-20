<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	$(document).ready(function(){
		$('button').click(function(){
			var date = $('#searchDate').val();
			/* for(var i = 0; i < 2; i++){
				date = date.replace('-','');
			} */
			while(date.indexOf('-') != -1){
				date = date.replace('-','');
			}
			$.ajax({
				url : "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json",
				data : {
					key : "f2904c73a7dd3a504891f83a242f5f32",
				//	targetDt : "20180816"
					tergetDt : date
				},
				//dataType : "jsonp", //크로스도메인 정책에 위배되는것을 막기위해 p를붙임
				dataType : "json",
				success : callback
				
			});
		});
		function callback(data){
			//console.log(data.boxOfficeResult.dailyBoxOfficeList);
			
			var boxOfficeList = data.boxOfficeResult.dailyBoxOfficeList;
			$('#view').empty();
			$('#view').append("<h3>&lt;" + $('#searchDate').val() + "박스오피스 순위 &gt;</h3>");
			for(var i = 0; i < boxOfficeList.length; i++){
				var rank = boxOfficeList[i].rank;
				var movieName = boxOfficeList[i].movieNm;
				
				$('#view').append("<b>" + rank + "위</b>&nbsp; " + movieName + "<br>");
				$('#view').append('<button type="button" class="btn btn-outline-secondary btn-sm">상세보기</button><br>');
			}
		}
	});
</script>
</head>
<body>
	<h2>일일 박스 오피스 조회</h2>
	검색날짜 : <input type="date" id="searchDate">
	<button>검색</button><br>
	
	<div id="view" style="width:400px; height:300px; border: 1px solid red;"></div>
</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script>
	$(document).ready(function() {
		$('button').click(function() {
			var date = $('#searchDate').val();
			/* 
			for(var i = 0; i < 2; i++) {
				date = date.replace('-', '');
			} 
			*/
			while(date.indexOf('-') != -1) {
				date = date.replace('-', '');
			}
			
			$.ajax({
				url : "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json",
				data : {
					key : "a81b41c63e131f95e52a0e22a3ba55f5",
				//	targetDt : "20180816"
					targetDt : date
				},
				dataType : "json",
				success : callback
			});
		});
		
		function callback(data) {
			console.log(data.boxOfficeResult.dailyBoxOfficeList);
			
			var boxOfficeList = data.boxOfficeResult.dailyBoxOfficeList;
			$('#view').empty();
			$('#view').append("<h3>&lt;" + $('#searchDate').val() + " 박스오피스 순위&gt;</h3>");
			for(var i = 0; i < boxOfficeList.length; i++) {
				var rank = boxOfficeList[i].rank;
				var movieName = boxOfficeList[i].movieNm;
				
				$('#view').append("<b>" + rank + "위</b>&nbsp; " + movieName + "&nbsp;&nbsp;");
				$('#view').append('<button type="button" class="btn btn-outline-secondary btn-sm">상세보기</button><br>');
			}
		}
	});
</script>
</head>
<body>
	<h2>일일 박스오피스 조회</h2>
	검색날짜 : <input type="date" id="searchDate">
	<button>검색</button><br><br>
	<div id="view" style="width:400px; height:400px; border: 1px solid red;"></div>
</body>
</html>



