<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>상품정보</h3>
<!-- EL (Expression Language) -->
<table class="table">
	<thead>
		<tr>
			<th>회원아이디</th>
			<th>비밀번호</th>
			<th>회원이름</th>
			<th>회원레벨</th>
		</tr>
	</thead>
	<tbody>
		<!--for(BoardVO vo : list ){  -->
		<c:forEach var="vo" items="${memberList}">
			<tr>
				<!-- 목록 보여주는 부분 -->
				<td><a href="product.do?id=${vo.id}">${vo.id}</a></td>
				<td>${vo.pw}</td>
				<td>${vo.name}</td>
				<td>${vo.responsibility}</td>
			</tr>
			<!-- } -->
		</c:forEach>
	</tbody>
</table>
=======
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<section class="py-5">
	<div class="container px-4 px-lg-5 mt-5">
		<div
			class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center" >

			<c:forEach var="vo" items="${productList}">
				<div class="col mb-5">
					<div class="card h-100">
						<!-- Sale badge-->
						<div class="badge bg-dark text-white position-absolute"
							style="top: 0.5rem; right: 0.5rem">Sale</div>

						<c:if test="${!empty vo.image}">
							<!-- Product image-->
							<img class="card-img-top" src="images/${vo.image}" alt="..." />
						</c:if>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->

								<h5 class="fw-bolder">
									<a href="productInfo.do?productCode=${vo.productCode}">${vo.productName}</a>
								</h5>
								<!-- Product reviews-->
								<div
									class="d-flex justify-content-center small text-warning mb-2">
									<c:forEach begin="1" end="${vo.likeIt}">
										<div class="bi-star-fill"></div>
									</c:forEach>
								</div>
								<!-- Product price-->
								<span class="text-muted text-decoration-line-through">${vo.originPrice}원</span>
								${vo.salePrice}원
							</div>
						</div>
						<!-- Product actions-->
						<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
							<div class="text-center">
								<a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</section>
>>>>>>> branch 'master' of https://github.com/heriong93/java_master.git
