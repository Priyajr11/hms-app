package com.hms.controller;

import com.hms.entity.Property;
import com.hms.repository.PropertyRepository;
import com.hms.service.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/properties")
public class propertyController {
    private PropertyRepository propertyRepository;
    private PropertyService propertyService;

    public propertyController(PropertyRepository propertyRepository, PropertyService propertyService) {
        this.propertyRepository = propertyRepository;
        this.propertyService = propertyService;
    }

    @GetMapping("/search-hotels")
    public List<Property> searchHotels(@RequestParam String name ){
        List<Property> properties = propertyService.searchHotels(name);
        return new ResponseEntity<>(properties,HttpStatus.OK).getBody();
    }
}
