package com.athttt.controller.web;


import com.athttt.dto.ProductDTO;
import com.athttt.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
                                 @RequestParam(value = "page", defaultValue = "1", required = false) String page,
                                 @RequestParam(value = "id", required = false) String id) {
        ModelAndView mav = new ModelAndView();

       if(id != null) {
           mav.setViewName("web/details");
       }
       else {
           mav.setViewName("web/shop");
           Long pages = (long) Math.ceil(productService.count()/9.0);
           if (Long.parseLong(page) > pages) {
               page = "1";
           }
           List<ProductDTO> productDTOS = productService.getProducts(searchMap, Integer.valueOf(page));
           mav.addObject("products", productDTOS);
           mav.addObject("totalPage", pages);
       }
        return mav;
    }
    @RequestMapping("/shop/{id}")
    public ModelAndView detailsPage(@PathVariable(value = "id") int id) {
        ModelAndView mav = new ModelAndView("web/details");
        return mav;
    }
}
