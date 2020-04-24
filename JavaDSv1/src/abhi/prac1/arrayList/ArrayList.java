package abhi.prac1.arrayList;

public class ArrayList {
	private int[] arr;
	private int size = 0;
	
	public ArrayList() {
		this(5);
	}
	
	public ArrayList(int size) {
		arr = new int[size];
	}
	
	public void add(int data) {
		if(isFull()) {
			int temp[] = arr;
			arr = new int[arr.length + (arr.length >> 1)];
			System.arraycopy(temp, 0, arr, 0, temp.length);
		}
		
		arr[size++] = data;
	}
	
	public int remove(int index) {
		if(isEmpty() || (index >= size))
			throw new IllegalStateException("Invalid Operation");
		
		int data = arr[index];
		System.arraycopy(arr, index+1, arr, index, size-index);
		size--;
		return data;
		
	}
	
	public boolean contains(int data) {
		for(int i = 0; i < size; i++) {
			if (arr[i] == data)
				return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private boolean isFull() {
		return size == arr.length - 1;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for(int i = 0; i < size; i++) {
			str.append(arr[i] + ", ");
		}
		str.delete(str.length()-2, str.length());
		str.append("]");
		return str.toString();
	}
	
	

}
