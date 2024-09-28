package pe.edu.cibertec.MealDBProject.client;

import pe.edu.cibertec.MealDBProject.model.MealResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "mealdb-client", url = "https://www.themealdb.com/api/json/v1/1")
public interface MealDbClient {

    // Búsqueda de comidas por nombre
    @GetMapping("/search.php")
    MealResponse searchMealByName(@RequestParam("s") String mealName);
}