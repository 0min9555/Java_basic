package ch14.sec07;

// 제네릭 인터페이스
public interface Storage<T> {
	
	public void add(T item, int index);
	public T get(int index);
}
