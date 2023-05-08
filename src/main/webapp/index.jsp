<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        table {
            border-collapse: collapse;
        }

        /*이중선 제거*/
        th {
            font-size: 10px;
            font-family: cursive;

            width: 80px;
            height: 28px;
            text-align: center;
            /* <!-- border: 1px solid #000; --> */
            background-color: #3CB371;

            vertical-align: top; /* 위 */
            vertical-align: bottom; /* 아래 */
            vertical-align: middle; /* 가운데 */
        }

        td {
            font-size: 15px;
            width: 80px;
            height: 50px;
            text-align: center;
            border: 1px solid #3CB371;

        }
    </style>
</head>
<body>

<script>
    function success({coords, timestamp}) {
        const latitude = coords.latitude;   // 위도
        const longitude = coords.longitude; // 경도

    }

    function getUserLocation() {
        if (!navigator.geolocation) {
            throw "위치 정보가 지원되지 않습니다.";
        }
        navigator.geolocation.watchPosition(success);
    }
</script>
<h2>와이파이 정보 구하기</h2>

<p>홈 | </p>


<form>
    LAT : <input id='userid' type='text'/>
    LNT : <input id='pwd' type='password'/>
    <button type="button" onclick= getUserLocation()>내 위치 가져오기</button>
    <button type="button" onclick="alert('Hello World!')">근처 WIPI정보 보기</button>
</form>


<br>

<table>

    <tr>
        <th style="color:white">거리</td>
        <th style="color: white" scope :
        "col">관리번호</td>
        <th style="color: white" scope:
        "col">자치구</td>
        <th style="color: white" scope:
        "col">와이파이명</th>
        <th style="color: white" scope:
        "col">도로명주소</th>
        <th style="color: white" scope:
        "col">상세주소</th>
        <th style= "color: white" scope:
        "col" >설치위치</th>
        <th style="color: white" scope:
        "col">설치유형</th>
        <th style="color: white" scope:
        "col">설치기관</th>
        <th style="color: white" scope:
        "col">서비스구분</th>
        <th style="color: white" scope:
        "col">망종류</th>
        <th style="color: white" scope:
        "col">설치년도</th>
        <th style="color: white" scope:
        "col">실내외구분</th>
        <th style="color: white" scope:
        "col">WIFI접속환경</th>
        <th style="color: white" scope:
        "col">관리번호</th>
        <th style="color: white" scope:
        "col">X좌표</th>
        <th style="color: white" scope:
        "col">Y좌표</th>
        <th style="color: white">작업일자</th>
    </tr>


    <td colspan="18">위치 입력을 입력받고 조회 해주세요.</td>


</table>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>