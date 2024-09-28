package pe.edu.cibertec.MealDBProject.model;

import java.util.List;

public class MealResponse {
    private List<Meal> meals;

    // Getters y Setters
    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}