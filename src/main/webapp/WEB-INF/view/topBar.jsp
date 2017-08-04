
   <%--  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/lib/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/lib/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/lib/jquery-ui/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/lib/owl.carousel/owl.carousel.css" />
   	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/css/param-reset.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/css/param-master.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/css/param-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/css/param-color.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/enduser/assets/css/param-animate.css" />
     --%>
    
    
<div id="header" class="header">
    <div class="top-header">
        <div class="container">
            <div id="user-info-top" class="user-info pull-left">
                <div class="dropdown">
                    <a href="login.jsp"><span>Login</span></a>
                    
                </div>
            </div>
            <div class="support-link">
                <a href="aboutUs.jsp">Abount Us</a>
                <a href="contactUS.jsp">Contact Us</a>
            </div>
           
        </div>
    </div>
    <!--/.top-header -->
    <!-- MAIN HEADER -->
    <div class="container main-header">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-3 logo">
                <a href="index.jsp"><img alt="Kute Shop" src="${pageContext.request.contextPath}/resources/enduser/assets/images/cardlove_logo.png" /></a>
            </div>
            <div class="col-xs-7 col-sm-8 col-md-7 header-search-box">
                <form class="form-inline">
                     
                      <div class="form-group input-serach">
                        <input type="text"  placeholder="Search${pageContext.request.contextPath}.">
                      </div>
                      <button type="submit" class="pull-right btn-search"></button>
                </form>
               
            </div>
            <div class="col-xs-5 col-sm-3 col-md-2 group-button-header">
              <!--   <a title="Compare" href="#" class="btn-compare">compare</a> -->
                <a title="My wishlist" href="#" class="btn-heart">wishlist</a>
                <div class="btn-cart" id="cart-block">
                    <a title="My cart" href="cart.html">Cart</a>
                    <span class="notify notify-right">2</span>
                    <div class="cart-block">
                        <div class="cart-block-content">
                            <h5 class="cart-title">2 Items in my cart</h5>
                            <div class="cart-block-list">
                                <ul>
                                <li class="product-info">
                                    <div class="p-left">
                                        <a href="#" class="remove_link"></a>
                                        <a href="#">
                                        <img class="img-responsive" src="${pageContext.request.contextPath}/resources/enduser/assets/images/cart-img.jpg" alt="p10">
                                        </a>
                                    </div>
                                    <div class="p-right">
                                        <p class="p-name">Dress</p>
                                        <p class="p-rice">Rs 1000</p>
                                        <p>Qty: 1</p>
                                    </div>
                                </li>
                                <li class="product-info">
                                    <div class="p-left">
                                        <a href="#" class="remove_link"></a>
                                        <a href="#">
                                        <img class="img-responsive" src="${pageContext.request.contextPath}/resources/enduser/assets/images/cart-img.jpg" alt="p10">
                                        </a>
                                    </div>
                                    <div class="p-right">
                                        <p class="p-name">Shirt</p>
                                        <p class="p-rice">Rs 10000</p>
                                        <p>Qty: 1</p>
                                    </div>
                                </li>
                            </ul>
                            </div>
                            <div class="toal-cart">
                                <span>Total</span>
                                <span class="toal-price pull-right">122.38 </span>
                            </div>
                            <div class="cart-buttons">
                                <a href="order.html" class="btn-check-out">Checkout</a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!-- END MANIN HEADER -->
        <div id="nav-top-menu" class="nav-top-menu">
        <div class="container">
            <div class="row">
                
                <div id="main-menu" class="col-sm-9 main-menu">
                    <nav class="navbar navbar-default">
                        <div class="container-fluid">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                                    <i class="fa fa-bars"></i>
                                </button>
                                <a class="navbar-brand" href="#">MENU</a>
                            </div>
                            <div id="navbar" class="navbar-collapse collapse">
                                <ul class="nav navbar-nav">
                                    <li class="active dropdown">
                                        <a class="dropdown-toggle" data-toggle="dropdown" href="index.jsp">Home</a>
                                        
                                    </li>
                                    <li class="dropdown">
                                        <a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Fashion</a>
                                                   <ul class="mega_dropdown dropdown-menu" style="width: 830px;">
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="productPage.jsp">Men</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="productPage.jsp">Shirt</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="productPage.jsp">Shirt</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="productPage.jsp">Shirt</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="productPage.jsp">Shirt</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Shirt</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Shirt</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="productPage.jsp">Women</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Sari</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Dress</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Sari</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Dress</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Sari</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Dress</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="productPage.jsp">Childrens</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Baby Boy</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Baby girl</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Baby Boy</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Baby Boy</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Baby Boy</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Baby Boy</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="img_container">
                                                        <img src="assets/data/banner-topmenu.jpg" alt="Banner">
                                                    </li>
                                                </ul>
                                            </li>

                                        </ul>
                                    </li>
                                    <li class="dropdown">
                                        <a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Sport</a>
                                                   <ul class="mega_dropdown dropdown-menu" style="width: 830px;">
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Criket</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="#">European</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Greek Potatoes</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Famous Spaghetti</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Famous Spaghetti</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Chicken</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Italian Pizza</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">French Cakes</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="#">FAST</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Hamberger</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Pizza</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Noodles</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Sandwich</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Salad</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Paste</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="img_container">
                                                        <img src="assets/data/banner-topmenu.jpg" alt="Banner">
                                                    </li>
                                                </ul>
                                            </li>

                                        </ul>
                                    </li>
                                    <li class="dropdown">
                                        <a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Foods</a>
                                            <ul class="mega_dropdown dropdown-menu" style="width: 830px;">
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="#">Asian</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Vietnamese Pho</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Noodles</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Seafood</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Sausages</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Meat Dishes</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Desserts</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="#">European</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Greek Potatoes</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Famous Spaghetti</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Famous Spaghetti</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Chicken</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Italian Pizza</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">French Cakes</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="link_container group_header">
                                                        <a href="#">FAST</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Hamberger</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Pizza</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Noodles</a>
                                                    </li>
                                                    <li class="link_container group_header">
                                                        <a href="#">Sandwich</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Salad</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Paste</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                    <li class="link_container">
                                                        <a href="#">Tops</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li class="block-container col-sm-3">
                                                <ul class="block">
                                                    <li class="img_container">
                                                        <img src="assets/data/banner-topmenu.jpg" alt="Banner">
                                                    </li>
                                                </ul>
                                            </li>

                                        </ul>
                                    </li>
                                    <li class="dropdown">
                                        <a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Digital</a>
                                        
                                    </li>
                                    <li class="dropdown"><a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Furniture</a></li>
                                    <li class="dropdown"><a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Jewelry</a></li>
                                    <li class="dropdown">
                                        <a href="productPage.jsp" class="dropdown-toggle" data-toggle="dropdown">Pages</a>
                                            
                                    </li>
                                </ul>
                               
                            </div><!--/.nav-collapse -->
                        </div>
                    </nav>
                </div>
            </div>
            <!-- userinfo on top-->
            <div id="form-search-opntop">
            </div>
          
            <!-- CART ICON ON MMENU -->
            <div id="shopping-cart-box-ontop">
                <i class="fa fa-shopping-cart" style="margin-left: -49px"></i>
                <div class="shopping-cart-box-ontop-content"></div>
            </div>
        </div>
    </div>
</div>
<!-- end header --><a href="#" class="scroll_top" title="Scroll to Top" style="display: inline;">Scroll</a>
<!-- Script-->

