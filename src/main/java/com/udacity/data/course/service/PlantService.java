package com.udacity.data.course.service;

import com.udacity.data.course.enitites.Plant;
import com.udacity.data.course.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PlantService {
    @Autowired
    PlantRepository plantRepository;

    public Long save(Plant plant){
        return plantRepository.save(plant).getId();
    }

    public Boolean delivered(Long id){
        // return plantRepository.deliveryCompleted(id);
        return plantRepository.existsPlantByIdAndDeliveryCompleted(id, true);
    }

    public List<Plant> findPlantsBelowPrice(BigDecimal price) {
        return plantRepository.findByPriceLessThan(price);
    }
}
