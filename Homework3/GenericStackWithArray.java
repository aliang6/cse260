public class GenericStackWithArray{
	private E[] list = new E[10];
	private int pointer = 0;

	public int getSize() {
		return pointer;
	}
	public E peek() {
		return list.[getSize() - 1];
	}
	public void push(E o) {
		list[pointer++] = o;
		if(pointer == list.length){
			E[] newList = new E[pointer*2];
			System.arrayCopy(list, 0, newList, 0, pointer - 1);
			list = newList;
		}
	}
	public E pop() {
		if(getSize() == 0){
			return null;
		}
		E o = list[--pointer];
		list[pointer] = null;
		return o;
	}
	public boolean isEmpty() {
		return list.getSize() == 0;
	}
	@Override // Java annotation: also used at compile time to
	public String toString() { // detect override errors
		return "stack: " + list.toString();
	}
}