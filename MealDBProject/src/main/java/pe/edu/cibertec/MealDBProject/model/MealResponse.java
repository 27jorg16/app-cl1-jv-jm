package pe.edu.cibertec.MealDBProject.model;

import lombok.Data;
import java.util.List;

@Data
public class MealResponse {
    private List<Meal> meals;
}