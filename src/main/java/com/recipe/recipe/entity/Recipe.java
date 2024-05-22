package com.recipe.recipe.entity;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Recipe {
    private UUID recipeId;
    private String title;
    private String description;
}
