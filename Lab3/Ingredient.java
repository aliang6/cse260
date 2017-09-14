public class Ingredient{
	private String name, measuringUnit;
	private int caloriesPerUnit;

	public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}

	public String getName(){
		return name;
	}

	public String getUnit(){
		return measuringUnit;
	}

	public int getCalories(){
		return caloriesPerUnit;
	}
}