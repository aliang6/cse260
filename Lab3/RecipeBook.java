import java.util.ArrayList;

public class RecipeBook{
	private String bookName;
	private ArrayList<CookingRecipe> recipes;

	public RecipeBook(String bookName){
		this.bookName = bookName;
		recipes = new ArrayList<CookingRecipe>();
	}

	public CookingRecipe removeRecipe(String name){
		for(CookingRecipe recipe : recipes){
			if(recipe.getName().equals(name)){
				recipes.remove(recipe);
				return recipe;
			}
		}
		return null;
	}

	public ArrayList<CookingRecipe> findRecipes(ArrayList<RecipeIngredient> ingredients){
		ArrayList<CookingRecipe> ret = new ArrayList<CookingRecipe>();
		for(CookingRecipe recipe : recipes){
			for(RecipeIngredient ing : ingredients){
				if(recipe.getRecipeIngredient(ing.getName()) != null){
					ret.add(recipe);
					break;
				}
			}
		}
		return ret;
	}

	public ArrayList<CookingRecipe> findRecipesWithFewIngredients(int numberOfIngredients){
		ArrayList<CookingRecipe> ret = new ArrayList<CookingRecipe>();
		for(CookingRecipe recipe : recipes){
			if(recipe.getNumberOfIngredients() < numberOfIngredients){
				ret.add(recipe);
			}
		}
		return ret;
	}

	public ArrayList<CookingRecipe> findRecipesLowCalories(){
		float calories = 0;
		ArrayList<CookingRecipe> ret = new ArrayList<CookingRecipe>();
		for(CookingRecipe recipe : recipes){
			if(calories == 0 || recipe.calculateCalories() <= calories){
				ret.add(recipe);
				calories = recipe.calculateCalories();
				for(CookingRecipe lowCalRec : ret){
					if(lowCalRec.calculateCalories() > calories){
						ret.remove(lowCalRec);
					}
				}
			}
		}
		return ret;
	}

	public String toString(){
		String bookString = bookName + "\n";
		for(CookingRecipe recipe : recipes){
			bookString += recipe.getName() + "\n";
		}
		return bookString;
	}

}