<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<button type="button" class="btn btn-primary">새로고침</button>
<button type="button" class="btn btn-primary" onclick="boan()" >보안센터</button>


<div class="container">
  <h2>관리자 페이지</h2>
  <table class="table">
    <thead>
      <tr>
        <th>No</th>
        <th>아이디</th>
        <th>이메일</th>
        <th>유저명</th>
        <th>Role</th>
        <th>가입경로</th>
        <th>providerId</th>
        <th>가입일자</th>


      </tr>
    </thead>
    <tbody>
<c:forEach  var="userLists" items="${userLists}">
      <tr class="danger">


        <td>${userLists.id}</td>
        <td>${userLists.username}</td>
        <td>${userLists.email}</td>
        <td>${userLists.name}</td>
        <td>${userLists.role}</td>
        <td>${userLists.provider}</td>
        <td>${userLists.providerId}</td>
        <td>${userLists.createDate}</td>

      </tr>


</c:forEach>
     
    </tbody>
  </table>
</div>

</body>
<script>
setTimeout(function(){
	location.reload();
	},1000);
function boan(){

	console.log('보안센터에갑니다');
	location.href="/boan";
}
</script>
</html>

