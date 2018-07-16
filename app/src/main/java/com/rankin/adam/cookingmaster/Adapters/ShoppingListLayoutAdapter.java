package com.rankin.adam.cookingmaster.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.rankin.adam.cookingmaster.Model.Ingredient;
import com.rankin.adam.cookingmaster.R;

import java.util.ArrayList;


/**
 * Created by Adam on 16-Jul-18.
 */

public class ShoppingListLayoutAdapter extends RecyclerView.Adapter<ShoppingListLayoutAdapter.ViewHolder> {

    private ArrayList<Ingredient> shoppingList;

    public ShoppingListLayoutAdapter(ArrayList<Ingredient> shoppingList, Context context) {
        super();
        this.shoppingList = new ArrayList<>();
        this.shoppingList.addAll(shoppingList);
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView ingredientName;
        private TextView ingredientAmount;
        private TextView ingredientUnit;
        private Button ingredientDeleteButton;

        public ViewHolder(View itemView) {
            super(itemView);
            ingredientName = itemView.findViewById(R.id.shoppingListRowLay_txt_ingredient);
            ingredientAmount = itemView.findViewById(R.id.shoppingListRowLay_txt_amount);
            ingredientUnit = itemView.findViewById(R.id.shoppingListRowLay_txt_unit);

            ingredientDeleteButton = itemView.findViewById(R.id.shoppingListRowLay_btn_delete);

        }

        @Override
        public void onClick(View view) {

        }
    }

    @Override
    public ShoppingListLayoutAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .shopping_list_row_layout, parent, false);
        return new ShoppingListLayoutAdapter.ViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ShoppingListLayoutAdapter.ViewHolder holder, final int position) {
        final Ingredient ingredient = shoppingList.get(position);

        holder.ingredientName.setText(ingredient.getName());

    }

    @Override
    public int getItemCount() {
        return shoppingList.size();
    }
}