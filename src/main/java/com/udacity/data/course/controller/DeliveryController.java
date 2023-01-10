package com.udacity.data.course.controller;


import com.udacity.data.course.enitites.Delivery;
import com.udacity.data.course.projection.RecipientAndPrice;
import com.udacity.data.course.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
//    @Autowired
//    DeliveryService deliveryService;
//
//    @PostMapping
//    public Long scheduleDelivery(@RequestBody Delivery delivery) {
//        return deliveryService.save(delivery);
//    }
//
//    @GetMapping("/bill/{deliveryId}")
//    public RecipientAndPrice getBill(@PathVariable Long deliveryId) {
//        return deliveryService.getBill(deliveryId);
//    }
}

//@Service
//public class DeliveryService {
//    @Autowired
//    DeliveryRepository deliveryRepository;
//
//    public RecipientAndPrice getBill(Long deliveryId){
//        return deliveryRepository.getBill(deliveryId);
//    }

//    public Long save(Delivery delivery) {
//        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
//        deliveryRepository.persist(delivery);
//        return delivery.getId();
//    }
//}
