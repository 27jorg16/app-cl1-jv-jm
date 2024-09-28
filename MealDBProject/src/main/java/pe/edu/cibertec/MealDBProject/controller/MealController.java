package pe.edu.cibertec.MealDBProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.MealDBProject.client.MealDbClient;
import pe.edu.cibertec.MealDBProject.model.MealResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private MealDbClient mealDbClient;

    @GetMapping("/search")
    public MealResponse searchMeal(@RequestParam String name) {
        return mealDbClient.searchMealByName(name);
    }
}