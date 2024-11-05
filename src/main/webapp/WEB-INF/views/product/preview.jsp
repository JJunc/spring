<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ include file="../common/tags.jsp" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="../common/common.jsp" %>
<title>샘플 애플리케이션</title>
</head>
<body>
<!-- 헤더부 -->
<header>
	<c:set var="menu" value="home"/>
	<%@ include file="../common/nav.jsp" %>
</header>

<!-- 메인 컨텐츠부 -->
<main>
	<div class="container my-3">
		<div class="modal fade" id="modal-preview-product" tabindex="-1" aria-labelledby="modal-preview-product" aria-hidden="true">
   <div class="modal-dialog modal-lg">
      <div class="modal-content">
         <div class="modal-header">
            <h1 class="modal-title fs-5" id="modal-preview-product">상품정보 미리보기</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
         </div>
         <div class="modal-body">
            <table class="table">
               <colgroup>
                  <col width="15%">
                  <col width="35%">
                  <col width="15%">
                  <col width="35%">
               </colgroup>
               <tr>
                  <th>번호</th>
                  <td><span id="p-no" /></td>
                  <th>제조사</th>
                  <td><span id="p-maker" /></td>
               </tr>
               <tr>
                  <th>상품명</th>
                  <td colspan="3"><span id="p-name" /></td>
               </tr>
               <tr>
                  <th>가격</th>
                  <td><span id="p-price" /></td>
                  <th>할인가</th>
                  <td><span id="p-discountPrice" /></td>
               </tr>
               <tr>
                  <th>리뷰수</th>
                  <td><span id="p-review-cnt" /></td>
                  <th>평점</th>
                  <td></td>
               </tr>
            </table>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
         </div>
      </div>
   </div>
</div>
	</div>	
	
</main>

<!-- 푸터부 -->
<footer>

</footer>
<script>
	let pNo = document.getElementById("p-no").textContent = data.no;
</script>
</body>
</html>