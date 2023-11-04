package graph.service;

import graph.dto.SimpleResponse;
import graph.dto.request.CarRequest;
import graph.dto.response.CarResponse;
import graph.entity.Car;
import graph.repo.CarRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * author: Ulansky
 */
@RequiredArgsConstructor
@Service
@Slf4j
public class CarService {

    private final CarRepo carRepo;

    public SimpleResponse save(CarRequest request) {
        carRepo.save(Car.builder()
                .name(request.getName())
                .email(request.getEmail())
                .color(request.getColor())
                .model(request.getModel())
                .price(request.getPrice())
                .build());
        SimpleResponse simpleResponse = new SimpleResponse();
        simpleResponse.setMessage("ok");
        return simpleResponse;
    }

    public CarResponse getById(Long id) {
        return carRepo.findCarById(id);
    }
}
