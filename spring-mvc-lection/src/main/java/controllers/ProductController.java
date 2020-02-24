package controllers;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import services.ProductService;


@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService service;

    @Autowired
    public void setService(ProductService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String listProducts(Model model) {
        model.addAttribute("products", service.getProducts());
        return "product";
    }


    @GetMapping("/description/{id}")
    public String description(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", service.getProductById(id));
        return "product_description";
    }

   @PostMapping("/addProduct")
   public String add(@ModelAttribute("product1") Product product) {
        service.save(product);
        return "redirect:/product/list";
   }



    @GetMapping("/addForm")
    public ModelAndView addForm() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("product1", new Product());
        modelAndView.setViewName("product_form");

        return modelAndView;
    }
}
