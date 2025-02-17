package sia.taco_cloud.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import sia.taco_cloud.Ingredient;
import sia.taco_cloud.data.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Optional<Ingredient>> {

    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Optional<Ingredient> convert(String id) {
        return ingredientRepo.findById(id);
    }
  }