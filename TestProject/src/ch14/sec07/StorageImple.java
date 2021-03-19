package ch14.sec07;

public class StorageImple<T> implements Storage<T> {

	private T[] array;
	
	
	public StorageImple(int capacity) {
		this.array= (T[])(new Objcet[capcity]);
	}

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		array[index]=item;

	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
