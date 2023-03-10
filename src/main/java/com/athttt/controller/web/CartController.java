package com.athttt.controller.web;

import com.athttt.dto.CartRequestBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller(value = "cartControllerOfWeb")

public class CartController {
    @RequestMapping(value = "/my-cart")
    @ResponseBody
    public ModelAndView cartPage(@RequestBody(required = false) List<CartRequestBody> carts){
        ModelAndView mav = new ModelAndView("web/shopping-cart");
        return mav;
    }
    @RequestMapping(value = "my-cart-info", method = {RequestMethod.POST, RequestMethod.GET})
    public Object getCartDetail(@RequestBody(required = false) List<CartRequestBody> carts){
        System.out.println(carts);
        return null;
    }
    @RequestMapping("/checkout")
    public ModelAndView checkoutPage() {
        ModelAndView mav = new ModelAndView("web/checkout");
        return mav;
    }
}
