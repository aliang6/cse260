import java.util.ArrayList;

public class CookingRecipe{
	private String name;
	private ArrayList<RecipeIngredient> recipe;

	public CookingRecipe(String name){
		this.name = name;
		recipe = new ArrayList<RecipeIngredient>();
	}

	public String getName(){
		return name;
	}

	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
		for(RecipeIngredient ing : recipe){
			if(ing.getName().equals(ingredient.getName())){
				ing.updateQuantity(quantity);
				return;
			}
		}
		recipe.add(new RecipeIngredient(ingredient.getName(), ingredient.getUnit(), ingredient.getCalories(), quantity));
		return;
	}

	public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		return getRecipeIngredient(ingredient.getName());
	}

	public RecipeIngredient getRecipeIngredient(String ingredientName){
		for(RecipeIngredient ing : recipe){
			if(ing.getName().equals(ingredientName)){
				return ing;
			}
		}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
		return removeRecipeIngredient(ingredient.getName());
	}

	public RecipeIngredient removeRecipeIngredient(String ingredientName){
		for(RecipeIngredient ing : recipe){
			if(ing.getName().equals(ingredientName)){
				recipe.remove(ing);
				return ing;
			}
		}
		return null;
	}

	public float calculateCalories(){
		float totalCal = 0;
		for(RecipeIngredient ing : recipe){
			totalCal = ing.getCalories() * ing.getQuantity();
		}
		return totalCal;
	}

	public int getNumberOfIngredients(){
		return recipe.size();
	}

	public String toString(){
		String recipeString = name + "\n";
		for(RecipeIngredient ing : recipe){
			recipeString += ing.getName() + "\n";
		}
		return recipeString;
	}
}