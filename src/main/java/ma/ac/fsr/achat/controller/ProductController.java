package ma.ac.fsr.achat.controller;

import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.ProductDto;
import ma.ac.fsr.achat.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {

    private final IProductService service;

    @GetMapping("/")
    public List<ProductDto> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public ProductDto newProduct(@RequestBody ProductDto dto){
      return  service.newProduct(dto);
// Response entity to attach status code
        //or swagger annot
    }
}
