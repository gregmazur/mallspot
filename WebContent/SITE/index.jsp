<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/holder.min.js"></script>

	<title>easyWalk</title>

</head>
<body>

	<div class="container">
		<!-- Меню -->
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.jsp">easyWalk</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#"><span class="glyphicon glyphicon-move"></span> Карта центра</a>
						</li>
						<li>
							<a href="#"><span class="glyphicon glyphicon-list"></span> Каталог</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-home"></span>
								Выбор торгового цетра <b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Торговый центр 1</a>
								</li>
								<li>
									<a href="#">Торговый центр 2</a>
								</li>
								<li>
									<a href="#">Торговый центр 3</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="#">Отдельная ссылка</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="#">Еще одна отдельная ссылка</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-right visible-xs visible-lg" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Введите запрос..."></div>
							<button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span> Найти</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
						<!-- <li>
							<a href="#">Ссылка</a>
						</li> -->
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" title="Вход / Регистрация">Вход / Регистрация
								<span class="glyphicon glyphicon-log-in"></span> <b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li role="presentation" class="dropdown-header">Вход</li>
								<li>
									<form role="form" id="reg">
										<div class="form-group">
											<label for="exampleInputEmail1">Email</label>
											<input type="email" class="form-control" id="exampleInputEmail1" placeholder="Введите email"></div>
											<div class="form-group">
												<label for="exampleInputPassword1">Пароль</label>
												<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Введите пароль"></div>
												<div class="checkbox"></div>
												<a href="account.jsp" class="btn btn-primary">Войти</a>
												<a href="#">Забыли пароль?</a>
											</form>
										</li>
										<li class="divider"></li>
										<li>
											<a href="reg.jsp" align="center"> <strong>Регистрация</strong>
											</a>
										</li>
									</ul>
								</li>
							</ul>
						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container-fluid -->
				</nav>
				<!-- Меню -->

				<!-- Слайдер -->
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
									<li data-target="#carousel-example-generic" data-slide-to="1"></li>
									<li data-target="#carousel-example-generic" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner">
									<div class="item active">
										<img data-src="holder.js/100%x200/lava/text:First slide" alt="First slide">
									</div>
									<div class="item">
										<img data-src="holder.js/100%x200/sky/text:Second slide" alt="Second slide">
									</div>
									<div class="item">
										<img data-src="holder.js/100%x200/social/text:Third slide" alt="Third slide">
									</div>
								</div>
								<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
									<span class="glyphicon glyphicon-chevron-left"></span>
								</a>
								<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
									<span class="glyphicon glyphicon-chevron-right"></span>
								</a>
							</div>
						</div>
					</div>
				</div>
				<!-- Слайдер -->

				<!-- Контент -->
				<div class="col-md-12" id="content">
					<p>
						Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda non enim voluptatum perspiciatis, impedit amet. Iure aliquam et accusantium fugit dicta? Eos illo odit officiis, enim veritatis voluptas exercitationem similique provident reiciendis officia assumenda fugiat, magnam ipsum delectus ad dicta qui et optio sapiente iste nesciunt beatae quos eveniet neque. Nesciunt commodi et, ab, repellat, nostrum corporis quam maxime aperiam obcaecati nisi nihil! Mollitia sit accusamus odio, quos perferendis ratione assumenda, iste eligendi eaque ipsam facilis maxime voluptatibus? Autem rem laudantium repudiandae molestias, odio ad, ut, labore blanditiis maxime recusandae laboriosam voluptate tempore quidem. Eaque voluptatum iusto asperiores nemo repellat natus blanditiis labore, consequuntur rem id vitae quae cumque ullam nam quos laudantium harum, ipsum distinctio odio aliquid iure impedit. Maxime perferendis pariatur quisquam explicabo, dolor culpa cum ab odit distinctio laudantium vitae alias sit libero quibusdam dicta, labore dignissimos magni. Eligendi quod suscipit voluptatum animi cumque libero a officiis, ipsam quibusdam quae explicabo, praesentium error consectetur tempora at natus fugit placeat in! Explicabo temporibus odit possimus architecto sint perferendis, nam non molestias. Odio, neque, totam! Neque, maxime, dolor. Ex eligendi, placeat. Ipsam aliquam, deleniti voluptatum voluptas voluptates, quidem necessitatibus atque, rem, amet laudantium quis animi vero molestias. Cupiditate, eius.
					</p>
				</div>
				<!-- Контент -->

				<!-- Логотипы -->
				<div class="row">
					<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
						<a href="#" class="thumbnail">
							<img data-src="holder.js/100%x100/sky" alt="Generic placeholder thumbnail"></a>
						</div>
						<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
							<a href="#" class="thumbnail">
								<img data-src="holder.js/100%x100/vine" alt="Generic placeholder thumbnail"></a>
							</div>
							<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
								<a href="#" class="thumbnail">
									<img data-src="holder.js/100%x100/lava" alt="Generic placeholder thumbnail"></a>
								</div>
								<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
									<a href="#" class="thumbnail">
										<img data-src="holder.js/100%x100/gray" alt="Generic placeholder thumbnail"></a>
									</div>
									<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
										<a href="#" class="thumbnail">
											<img data-src="holder.js/100%x100/industrial" alt="Generic placeholder thumbnail"></a>
										</div>
										<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
											<a href="#" class="thumbnail">
												<img data-src="holder.js/100%x100/social" alt="Generic placeholder thumbnail"></a>
											</div>
											<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
												<a href="#" class="thumbnail">
													<img data-src="holder.js/100%x100/sky" alt="Generic placeholder thumbnail"></a>
												</div>
												<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
													<a href="#" class="thumbnail">
														<img data-src="holder.js/100%x100/vine" alt="Generic placeholder thumbnail"></a>
													</div>
													<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
														<a href="#" class="thumbnail">
															<img data-src="holder.js/100%x100/lava" alt="Generic placeholder thumbnail"></a>
														</div>
														<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
															<a href="#" class="thumbnail">
																<img data-src="holder.js/100%x100/gray" alt="Generic placeholder thumbnail"></a>
															</div>
															<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
																<a href="#" class="thumbnail">
																	<img data-src="holder.js/100%x100/industrial" alt="Generic placeholder thumbnail"></a>
																</div>
																<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
																	<a href="#" class="thumbnail">
																		<img data-src="holder.js/100%x100/social" alt="Generic placeholder thumbnail"></a>
																	</div>
																</div>
																<!-- Логотипы -->

																<!-- Футер -->
																<div class="row" id="footer">
																	<div class="col-md-12">Copyright © easyWalk 2015.</div>
																</div>
																<!-- Футер -->

															</div>
														</body>
														</html>