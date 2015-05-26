<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
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
								Выбор торгового центра <b class="caret"></b>
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

				<!-- Регистрация -->
				<div class="container">
					<h2>Регистрация</h2>
					<div class="row">
						<div class="alert alert-danger">
							<p><% out.println(session.getAttribute("errorText"));  %></p>
						</div>
						<form class="form-horizontal" action="registration.jsp" method="POST">
							<div class="form-group">
								<label for="inputName" class="col-sm-3 control-label">Имя</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="inputName" name="inputName" placeholder="Введите имя" required>
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail" class="col-sm-3 control-label">Email</label>
								<div class="col-sm-9">
									<input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="Введите email" required>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Пароль</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Введите пароль" required>
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword2" class="col-sm-3 control-label">Повторите пароль</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="inputPassword2" name="inputPassword2" placeholder="Повторите пароль" required>
								</div>
							</div>
							<div class="form-group">
								<label for="optionsRadios1" class="col-sm-3 control-label">Обычный пользователь</label>
								<div class="col-sm-9">
									<input type="radio" name="optionsRadios1" id="optionsRadios1" value="user" checked>
								</div>
							</div>
							<div class="form-group">
								<label for="optionsRadios2" class="col-sm-3 control-label">Администратор</label>
								<div class="col-sm-9">
									<input type="radio" name="optionsRadios2" id="optionsRadios2" value="storeAdmin">
								</div>
							</div>
							<div class="btnReg">
								<input type="submit" class="btn btn-primary btn-lg" value="Зарегистрироваться"></input>
							</div>
						</form>
						
					</div>
				</div>
				
				
				<!-- Регистрация -->

				<!-- Футер -->
				<!-- <div class="row" id="footer">
					<div class="col-md-12">Copyright © easyWalk 2015.</div>
				</div> -->
				<!-- Футер -->

			</div>
		</body>
		</html>
