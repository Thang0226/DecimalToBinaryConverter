public class MyStack<E> {
	private Object[] arr;
	private int capacity;
	private final int DEFAULT_CAPACITY = 10;
	private int size = 0;

	public MyStack() {
		this.capacity = DEFAULT_CAPACITY;
		arr = new Object[capacity];
	}

	public MyStack(int capacity) {
		if (capacity < DEFAULT_CAPACITY) {
			this.capacity = DEFAULT_CAPACITY;
		} else {
			this.capacity = capacity;
		}
		arr = new Object[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity(int minCapacity) {
		if (minCapacity >= capacity) {
			capacity += capacity / 2;
			Object[] newArr = new Object[capacity];
			for (int i = 0; i < size; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
	}

	public int size() {
		return size;
	}

	public void push(E element) {
		ensureCapacity(size + 1);
		arr[size] = element;
		size++;
	}

	public E pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is null");
		}
		return (E) arr[--size];
	}
}
