<%--
  Created by IntelliJ IDEA.
  User: Dinh Chuong
  Date: 3/7/2023
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Giỏ hàng</title>
</head>
<body>



<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <div class="breadcrumb__text">
          <h4>Shopping Cart</h4>
          <div class="breadcrumb__links">
            <a href="./index.html">Home</a>
            <a href="./shop.html">Shop</a>
            <span>Shopping Cart</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- Breadcrumb Section End -->

<!-- Shopping Cart Section Begin -->
<section class="shopping-cart spad">
  <div class="container">
    <div class="row">
      <div class="col-lg-8">
        <div class="shopping__cart__table">
          <table>
            <thead>
            <tr>
              <th>Product</th>
              <th>Quantity</th>
              <th>Total</th>
              <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td class="product__cart__item">
                <div class="product__cart__item__pic">
                  <img src="img/shopping-cart/cart-1.jpg" alt="">
                </div>
                <div class="product__cart__item__text">
                  <h6>T-shirt Contrast Pocket</h6>
                  <h5>$98.49</h5>
                </div>
              </td>
              <td class="quantity__item">
                <div class="quantity">
                  <div class="pro-qty-2">
                    <input type="text" value="1">
                  </div>
                </div>
              </td>
              <td class="cart__price">$ 30.00</td>
              <td class="cart__close"><i class="fa fa-close"></i></td>
            </tr>
            <tr>
              <td class="product__cart__item">
                <div class="product__cart__item__pic">
                  <img src="img/shopping-cart/cart-2.jpg" alt="">
                </div>
                <div class="product__cart__item__text">
                  <h6>Diagonal Textured Cap</h6>
                  <h5>$98.49</h5>
                </div>
              </td>
              <td class="quantity__item">
                <div class="quantity">
                  <div class="pro-qty-2">
                    <input type="text" value="1">
                  </div>
                </div>
              </td>
              <td class="cart__price">$ 32.50</td>
              <td class="cart__close"><i class="fa fa-close"></i></td>
            </tr>
            <tr>
              <td class="product__cart__item">
                <div class="product__cart__item__pic">
                  <img src="img/shopping-cart/cart-3.jpg" alt="">
                </div>
                <div class="product__cart__item__text">
                  <h6>Basic Flowing Scarf</h6>
                  <h5>$98.49</h5>
                </div>
              </td>
              <td class="quantity__item">
                <div class="quantity">
                  <div class="pro-qty-2">
                    <input type="text" value="1">
                  </div>
                </div>
              </td>
              <td class="cart__price">$ 47.00</td>
              <td class="cart__close"><i class="fa fa-close"></i></td>
            </tr>
            <tr>
              <td class="product__cart__item">
                <div class="product__cart__item__pic">
                  <img src="img/shopping-cart/cart-4.jpg" alt="">
                </div>
                <div class="product__cart__item__text">
                  <h6>Basic Flowing Scarf</h6>
                  <h5>$98.49</h5>
                </div>
              </td>
              <td class="quantity__item">
                <div class="quantity">
                  <div class="pro-qty-2">
                    <input type="text" value="1">
                  </div>
                </div>
              </td>
              <td class="cart__price">$ 30.00</td>
              <td class="cart__close"><i class="fa fa-close"></i></td>
            </tr>
            </tbody>
          </table>
        </div>
        <div class="row">
          <div class="col-lg-6 col-md-6 col-sm-6">
            <div class="continue__btn">
              <a href="#">Continue Shopping</a>
            </div>
          </div>
          <div class="col-lg-6 col-md-6 col-sm-6">
            <div class="continue__btn update__btn">
              <a href="#"><i class="fa fa-spinner"></i> Update cart</a>
            </div>
          </div>
        </div>
      </div>
      <div class="col-lg-4">
        <div class="cart__discount">
          <h6>Discount codes</h6>
          <form action="#">
            <input type="text" placeholder="Coupon code">
            <button type="submit">Apply</button>
          </form>
        </div>
        <div class="cart__total">
          <h6>Cart total</h6>
          <ul>
            <li>Subtotal <span>$ 169.50</span></li>
            <li>Total <span>$ 169.50</span></li>
          </ul>
          <a href="#" class="primary-btn">Proceed to checkout</a>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- Shopping Cart Section End -->

<!-- Footer Section Begin -->
<footer class="footer">
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-6 col-sm-6">
        <div class="footer__about">
          <div class="footer__logo">
            <a href="#"><img src="img/footer-logo.png" alt=""></a>
          </div>
          <p>The customer is at the heart of our unique business model, which includes design.</p>
          <a href="#"><img src="img/payment.png" alt=""></a>
        </div>
      </div>
      <div class="col-lg-2 offset-lg-1 col-md-3 col-sm-6">
        <div class="footer__widget">
          <h6>Shopping</h6>
          <ul>
            <li><a href="#">Clothing Store</a></li>
            <li><a href="#">Trending Shoes</a></li>
            <li><a href="#">Accessories</a></li>
            <li><a href="#">Sale</a></li>
          </ul>
        </div>
      </div>
      <div class="col-lg-2 col-md-3 col-sm-6">
        <div class="footer__widget">
          <h6>Shopping</h6>
          <ul>
            <li><a href="#">Contact Us</a></li>
            <li><a href="#">Payment Methods</a></li>
            <li><a href="#">Delivary</a></li>
            <li><a href="#">Return & Exchanges</a></li>
          </ul>
        </div>
      </div>
      <div class="col-lg-3 offset-lg-1 col-md-6 col-sm-6">
        <div class="footer__widget">
          <h6>NewLetter</h6>
          <div class="footer__newslatter">
            <p>Be the first to know about new arrivals, look books, sales & promos!</p>
            <form action="#">
              <input type="text" placeholder="Your email">
              <button type="submit"><span class="icon_mail_alt"></span></button>
            </form>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-12 text-center">
        <div class="footer__copyright__text">
          <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
          <p>Copyright ©
            <script>
              document.write(new Date().getFullYear());
            </script>2020
            All rights reserved | This template is made with <i class="fa fa-heart-o"
                                                                aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
          </p>
          <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
        </div>
      </div>
    </div>
  </div>
</footer>
<!-- Footer Section End -->

<!-- Search Begin -->
<div class="search-model">
  <div class="h-100 d-flex align-items-center justify-content-center">
    <div class="search-close-switch">+</div>
    <form class="search-model-form">
      <input type="text" id="search-input" placeholder="Search here.....">
    </form>
  </div>
</div>
<!-- Search End -->

    <script type="module" src="web/js/cart.js"></script>
    <script>
      const cart = {
        addToCart(id) {
          console.log(1)
          let listItem = JSON.parse(localStorage.getItem("listItem")) || []
          if (listItem.filter(item => item.id == id).length == 0){
            listItem.push({id, quantity: 1})
          }
          else
          {
            listItem.forEach(item => {
              if (item.id == id) {
                item.quantity+=1;
              }
            })
          }
          localStorage.setItem("listItem", JSON.stringify(listItem));
        },

        fetchMyCart() {
          let myCart = JSON.parse(localStorage.getItem("list")) || [];
          console.log("myCart.length == 0")

          //if (myCart.length == 0) return [];
          console.log("myCart.length != 0")
          fetch("http://localhost:8080/my-cart-info", {
            method: "post",
            body: {
              carts: JSON.stringify(myCart)
            },
            headers: {
              'Content-Type': 'application/json'
            }
          }).then(res => {
            console.log(res)
            return res.json()
          })
            .then(data => {
              console.log(data);
            })
        }
      }
      window.onload = function () {
        cart.fetchMyCart()
        console.log(1)
      };
    </script>
</body>
</html>
