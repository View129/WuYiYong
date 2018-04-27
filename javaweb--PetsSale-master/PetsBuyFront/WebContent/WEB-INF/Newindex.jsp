	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html>
	<head>
	     <%@include file="/WEB-INF/NewHeader.jsp" %>
	
	</head>
	<body>
		     <%@include file="/WEB-INF/NewNav.jsp" %>


		
					<div class="banner-slider">
						<div id="myCarousel" class="carousel slide" data-ride="carousel">
						  <!-- Indicators -->
						  <ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
						  </ol>
						  <!-- Wrapper for slides -->
						  <div class="carousel-inner" role="listbox">
							<div class="item active">
							 <img src="./images/2.jpg" alt="wolfdog" class="img-responsive">
							  <div class="carousel-caption ch">
								<%--<h3>Sed at ligula sed nibh rutrum pretium </h3>
								<p>Suspendisse ut ante eget ex maximus malesuada tincidunt eu ex.</p>--%>
							  </div>
							</div>
							<div class="item">
							  <img src="./images/4.jpg" alt="cat" class="img-responsive">
							  <div class="carousel-caption ch">
								<%--<h3>Praesent sit amet consequat ante.</h3>
								<p>Suspendisse ut ante eget ex maximus malesuada tincidunt eu ex.</p>--%>
							  </div>
							</div>
							<div class="item">
							   <img src="./images/1.jpg" alt="dog" class="img-responsive">
							  <div class="carousel-caption ch">
								<%--<h3>Lorem ipsum dolor adipiscing elit. </h3>
								<p>Suspendisse ut ante eget ex maximus malesuada tincidunt eu ex.</p>--%>
							  </div>
							 
							</div>
						  </div>
						  <!-- Controls -->
						  <a class="carousel-control left" href="#myCarousel" role="button" data-slide="prev">
							<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
							<span class="sr-only">Previous</span>
						  </a>
						  <a class="carousel-control right" href="#myCarousel" role="button" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
							<span class="sr-only">Next</span>
						  </a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--header-ends-->
		<!--content-->
		<div class="our-products">
			<div class="container">
				<div class="products-gallery">
					<h2>我们的宠物</h2>
					<div class="col-md-3 arr">
						<div class="bg">
						  <img src="./images/b.jpg" alt="pet" height="220px" class="img-responsive">
						  <span class="glyphicon glyphicon-heart pst" aria-hidden="true"></span>
						  <div class="caption">
							<h3>猫咪</h3>
							<p>全世界家庭中较为广泛的宠物，善于攀爬，性格温和. </p>
							<p><a href="<%=ctxPath%>/Index?action=show" class="btn btn-danger" role="button">More</a></p>
						</div>
						</div>
					</div>
					<div class="col-md-3 arr">
						<div class="bg">
						  <img src="./images/c.jpg" alt="pet" height="220px" class="img-responsive">
						  <span class="glyphicon glyphicon-heart pst" aria-hidden="true"></span>
						  <div class="caption">
							<h3>小犬</h3>
							<p>狗是人类最忠实的朋友，活泼，好动，十分的聪明</p>
							<p><a href="<%=ctxPath%>/Index?action=show" class="btn btn-danger" role="button">More</a> </p>
						  </div>
						</div>
					</div>
					<div class="col-md-3 arr">
						<div class="bg">
						  <img src="./images/13.jpg" alt="pet" style="height:220px;" class="img-responsive">
						  <span class="glyphicon glyphicon-heart pst" aria-hidden="true"></span>
						  <div class="caption">
							<h3>小狗</h3>
							<p>狗是人类最忠实的朋友，活泼，好动，十分的聪明 </p>
							<p><a href="<%=ctxPath%>/Index?action=show" class="btn btn-danger" role="button">More</a></p>
						  </div>
						</div>
					</div>
					<div class="col-md-3 arr">
						<div class="bg">
						  <img src="./images/7.jpg" alt="pet" style="height:220px;" class="img-responsive">
						  <span class="glyphicon glyphicon-heart pst" aria-hidden="true"></span>
						  <div class="caption">
							<h3>小猫</h3>
							<p>猫有9条命。世界各地有许多关于猫有九条命的故事和传说. </p>
							<p><a href="<%=ctxPath%>/Index?action=show" class="btn btn-danger" role="button">More</a></p>
						  </div>
						 </div>
					</div>
					<div class="clearfix"></div>
				</div>
					<div class="traits-technology">
						<div class="col-md-8 tt">
							<ul class="traits-text">
								<li><h3>关于我们</h3></li>
								<li><p><b style="font-weight:600;">我们成立于2018，因为对毛孩子们的那份爱，一步‌‌步拥有了自己的事业!</b></p></li>
								<li><p>　　我们的宠物都使用进口粮+优质国产粮食，目的是为了在进口粮货源不稳定的时候，
									孩子的肠胃依旧可以适应其他粮食;进口罐头，每天不同口味更换，只要是好的，我们的孩子都会吃到，
									绝无例外;新鲜肉类更是不间断供应;我们做到了连拉屎都要用最好——美国进口猫倍思猫砂，无尘无味，
									对宠物更健康。我们的加菲种猫全部拥有CFA血统证书。我们的猫咪价位并不美丽，因为我们对孩子们
									的付出都真实存在。请您记住，我们不是猫贩子，我们不是宠物流氓，我们是用心在做的宠物舍!并提倡未
									来的主人们如果爱，请深爱。</p></li>
							</ul>
							<%--<ol>
								<div class="col-md-6 brk">
								<li><a href="#">Lorem Ipsum is simply dummy text.</a></li>
								<li><a href="#">Lorem Ipsum is simply dummy text.</a></li>
								<li><a href="#">Lorem Ipsum is simply dummy text.</a></li>
								</div>
								<div class="col-md-6 brk">
								<li><a href="#">Lorem Ipsum is simply dummy text.</a></li>
								<li><a href="#">Lorem Ipsum is simply dummy text.</a></li>
								<li><a href="#">Lorem Ipsum is simply dummy text.</a></li>
								</div>
								<div class="clearfix"></div>
							</ol>
							<span><a href="#" class="btn btn-danger bt" role="button">More</a></span>--%>
						</div>
						<div class="col-md-4 tt">
							<div class="traits-logos">
								<div class="col-xs-6 col-md-6 tt brk2">
									<span class="glyphicon glyphicon-leaf bgtl" aria-hidden="true"></span>
								</div>
								<div class="col-xs-6 col-md-6 tt brk2">
									<span class="glyphicon glyphicon-grain bgtl" aria-hidden="true"></span>
								</div>
								<div class="col-xs-6 col-md-6 tt brk2">
									<span class="glyphicon glyphicon-fire bgtl" aria-hidden="true"></span>
								</div>	
								<div class="col-xs-6 col-md-6 tt brk2">
									<span class="glyphicon glyphicon-camera bgtl" aria-hidden="true"></span>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
			</div>
		</div>
		<!--content-ends-->
		<!--brand-logos-->
			<div class="brand-logo">
				<div class="container">
					<div class="col-xs-6 col-md-3 brk3">
						<a href=""><img src="./images/bd1.png" alt="" class="img-responsive"/></a>
					</div>
					<div class="col-xs-6 col-md-3 brk3">
						<a href=""><img src="./images/bd2.png" alt="" class="img-responsive"/></a>
					</div>
					<div class="col-xs-6 col-md-3 brk3">
						<a href=""><img src="./images/bd3.png" alt="" class="img-responsive"/></a>
					</div>
					<div class="col-xs-6 col-md-3 brk3">
						<a href=""><img src="./images/bd4.png" alt="" class="img-responsive"/></a>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			     <%@include file="/WEB-INF/NewFooter.jsp" %>
		
	</body>
</html>
