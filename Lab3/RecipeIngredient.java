public class RecipeIngredient extends Ingredient{
	private float quantity;

	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity){
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}

	public RecipeIngredient(Ingredient ingredient, float quantity){
		super(ingredient.getName(), ingredient.getUnit(), ingredient.getCalories());
		this.quantity = quantity;
	}

	public float getQuantity(){
		return quantity;
	}

	public void updateQuantity(float quantity){
		this.quantity = quantity;
	}

}