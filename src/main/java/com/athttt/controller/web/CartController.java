package com.athttt.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "cartControllerOfWeb")

public class CartController {
    @RequestMapping("/cart")
    public ModelAndView cartPage() {
        ModelAndView mav = new ModelAndView("web/shopping-cart");
        return mav;
    }
    @RequestMapping("/checkout")
    public ModelAndView checkoutPage() {
        ModelAndView mav = new ModelAndView("web/checkout");
        return mav;
    }
}
