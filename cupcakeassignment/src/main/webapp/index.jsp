<%-- 
    Document   : index
    Created on : March 01, 2017, 1:57:46 PM
    Author     : peter
--%>

<%@page import="Presentation.RenderUtils"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Business Casual - Start Bootstrap Theme</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/business-casual.css" rel="stylesheet">

        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <%=RenderUtils.title()%>

        <!-- Navigation -->
        <nav class="navbar navbar-default" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                    <a class="navbar-brand" href="index.html">Cupcake Assignment</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->

                <%=RenderUtils.navBar()%>

                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <div class="container">

            <div class="row">
                <div class="box">
                    <div class="col-lg-12 text-center">
                        <div id="carousel-example-generic" class="carousel slide">
                            <!-- Indicators -->
                            <ol class="carousel-indicators hidden-xs">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner">
                                <div class="item active">
                                    <img class="img-responsive img-full" src="img/slide-1.jpg" alt="">
                                </div>
                                <div class="item">
                                    <img class="img-responsive img-full" src="img/slide-2.jpg" alt="">
                                </div>
                                <div class="item">
                                    <img class="img-responsive img-full" src="img/slide-3.jpg" alt="">
                                </div>
                            </div>

                            <!-- Controls -->
                            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                <span class="icon-prev"></span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                <span class="icon-next"></span>
                            </a>
                        </div>
                        <h2 class="brand-before">
                            <small>Welcome to</small>
                        </h2>
                        <h1 class="brand-name">Cupcake E-shop Assignment</h1>
                        <hr class="tagline-divider">
                        <h2>
                            <small>By
                                <strong>Peter Mihok</strong>
                            </small>
                        </h2>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="box">
                    <div class="col-lg-12">
                        <hr>
                        <h2 class="intro-text text-center">About 
                            <strong>our cupcakes</strong>
                        </h2>
                        <hr>
                        <img class="img-responsive img-border img-left" src="img/intro-pic.jpg" alt="">
                        <hr class="visible-xs">
                        <p>I love pie sugar plum jujubes muffin. Gummi bears sesame snaps caramels. I love cookie jelly macaroon.</p>
                        <p>Wafer I love marshmallow danish sugar plum bonbon I love bear claw pastry. Lemon drops sugar plum bonbon icing pie chocolate cake pie macaroon muffin. Cupcake marshmallow lemon drops bonbon sesame snaps pudding dessert icing halvah.</p>
                        <p>Marshmallow dragée halvah gummi bears I love I love sugar plum. Croissant pie sesame snaps donut icing pie cheesecake gummi bears chocolate bar. Sweet I love jelly powder I love gummies gingerbread.</p>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="box">
                    <div class="col-lg-12">
                        <hr>
                        <h2 class="intro-text text-center">About
                            <strong>our cupcake team</strong>
                        </h2>
                        <hr>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas eget elit non mi pretium feugiat. Praesent non urna imperdiet, dictum nunc eget, ultricies magna. Ut tellus est, vestibulum ut lacinia scelerisque, dignissim vel lorem. Nulla dapibus erat id consequat hendrerit. Sed eu lacinia elit. Maecenas vitae quam et lorem tincidunt pellentesque. Pellentesque et massa purus. Curabitur sapien quam, bibendum sed vehicula ut, blandit eget ipsum. Nunc auctor imperdiet augue et efficitur. Quisque in turpis risus. Aliquam nec pharetra felis.</p>
                        <p>Praesent at nisl in sapien aliquam fermentum. Nullam vestibulum vulputate tempus. Vivamus a sem pellentesque, viverra mauris vel, viverra eros. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed iaculis nunc sit amet justo vehicula elementum. Donec nec libero nisi. Pellentesque dictum non mi quis porttitor. Donec egestas libero in dolor aliquet, et sodales purus tristique. Aliquam eu ipsum orci.</p>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.container -->

        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <p>Copyright &copy; AP Cakes <%=LocalDate.now().getYear()%></p>
                    </div>
                </div>
            </div>
        </footer>

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Script to Activate the Carousel -->
        <script>
            $('.carousel').carousel({
                interval: 5000 //changes the speed
            })
        </script>

    </body>

</html>
