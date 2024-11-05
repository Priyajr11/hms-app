package com.hms.service;

import com.hms.entity.Property;
import com.hms.repository.PropertyRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PropertyService {
    private PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> searchHotels(String name) {
        List<Property> properties = propertyRepository.searchHotels(name);
        return properties;
    }
}
