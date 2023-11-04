package graph.dto.api;

import graph.dto.SimpleResponse;
import graph.dto.request.CarRequest;
import graph.dto.response.CarResponse;
import graph.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: Ulansky
 */

@Controller
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarApi {

    private final CarService carService;

    @MutationMapping
    public SimpleResponse save(@Argument CarRequest carRequest){
        return carService.save(carRequest);
    }
    @QueryMapping
    public CarResponse getById(@Argument Long id){
        return carService.getById(id);
    }


}
