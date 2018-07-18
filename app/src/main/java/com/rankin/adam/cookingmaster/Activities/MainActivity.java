package com.rankin.adam.cookingmaster.Activities;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rankin.adam.cookingmaster.Controllers.RecipeController;
import com.rankin.adam.cookingmaster.Controllers.SaveLoadController;
import com.rankin.adam.cookingmaster.Controllers.ShoppingListController;
import com.rankin.adam.cookingmaster.Model.RecipeList;
import com.rankin.adam.cookingmaster.Model.ShoppingList;
import com.rankin.adam.cookingmaster.R;

public class MainActivity extends AppCompatActivity {

    public static final RecipeList recipeList = new RecipeList();
    public static final RecipeController recipeController = new RecipeController();

    public static final ShoppingList shoppingList = new ShoppingList();
    public static final ShoppingListController shoppingListController = new ShoppingListController();
    private final SaveLoadController saveLoadController = new SaveLoadController(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveLoadController.loadRecipesFromFile();
        saveLoadController.loadShoppingListFromFile();

        Button recipesButton = (Button) findViewById(R.id.btn_recipe_book);
        recipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recipeBookIntent = new Intent(MainActivity.this, RecipeBookActivity.class);
                startActivity(recipeBookIntent);
            }
        });

        Button spiceButton = (Button) findViewById(R.id.btn_spices);
        spiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent spiceIntent = new Intent(MainActivity.this, Activity.class);
                //startActivity(spiceIntent);

            }
        });
        Button shoppingButton = (Button) findViewById(R.id.btn_shopping);
        shoppingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingListActivity.class);
                startActivity(shoppingIntent);
            }
        });

        Button optionsButton = (Button) findViewById(R.id.btn_options);
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent optionsIntent = new Intent(MainActivity.this, Activity.class);
                //startActivity(optionsIntent);

            }
        });
    }


}
