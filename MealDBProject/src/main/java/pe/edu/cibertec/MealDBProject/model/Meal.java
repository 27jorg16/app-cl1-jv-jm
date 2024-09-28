package pe.edu.cibertec.MealDBProject.model;

import lombok.Data;

@Data
public class Meal {
    private String idMeal;
    private String strMeal;
    private String strCategory;
    private String strInstructions;
    private String strMealThumb;
}
