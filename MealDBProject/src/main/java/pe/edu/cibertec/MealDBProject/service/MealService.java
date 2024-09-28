package pe.edu.cibertec.MealDBProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.MealDBProject.client.MealDbClient;
import pe.edu.cibertec.MealDBProject.model.MealResponse;

@Service
public class MealService {

    @Autowired
    private MealDbClient mealDbClient;

    public MealResponse searchMealByName(String mealName) {
        return mealDbClient.searchMealByName(mealName);
    }
}