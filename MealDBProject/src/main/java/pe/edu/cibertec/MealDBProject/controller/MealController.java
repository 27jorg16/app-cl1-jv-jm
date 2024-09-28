package pe.edu.cibertec.MealDBProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.MealDBProject.model.MealResponse;
import pe.edu.cibertec.MealDBProject.service.MealService;

@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @GetMapping("/search")
    public MealResponse searchMeal(@RequestParam String name) {
        return mealService.searchMealByName(name);
    }
}