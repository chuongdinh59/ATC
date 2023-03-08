package com.athttt.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller(value = "shopControllerOfWeb")
public class ShopController {


    @RequestMapping("/shop")
    public ModelAndView shopPage() {
        ModelAndView mav = new ModelAndView("web/shop");

        return mav;
    }
    @RequestMapping("/shop1")
    public ModelAndView detailsPage() {
        ModelAndView mav = new ModelAndView("web/details");
        return mav;
    }
}
