package com.athttt.controller.web;


import com.athttt.dto.ProductDTO;
import com.athttt.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller(value = "shopControllerOfWeb")
public class ShopController {

    @Autowired
    ProductService productService ;


    @RequestMapping("/shop")
    public ModelAndView shopPage(@RequestParam Map<String, Object> searchMap ,
                                 @RequestParam(value = "page", defaultValue = "1", required = false) String page) {
        ModelAndView mav = new ModelAndView("web/shop");
        List<ProductDTO> productDTOS = productService.getProducts(searchMap, Integer.valueOf(page));
        mav.addObject("products", productDTOS);
        return mav;
    }
    @RequestMapping("/shop/{1}")
    public ModelAndView detailsPage() {
        ModelAndView mav = new ModelAndView("web/details");
        return mav;
    }
}
