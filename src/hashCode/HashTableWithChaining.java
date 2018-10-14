package hashCode;

import java.util.LinkedList;



public class HashTableWithChaining<E> {
	private double loadf = 0;
	private int capacity = 0;
	private int element = 0;
	private LinkedList<E> []table;
	
	public HashTableWithChaining() {
		this.capacity = 5;
		this.loadf = 0.75;
		table = new LinkedList[this.capacity];
	}
	
	public void add(E input) {
		int code = convertToIndex(input.hashCode());
		if(contains(input)) {
			table[code] = new LinkedList<>();
			table[code].add(input);
		} else {
			table[code] = new LinkedList<>();
			table[code].add(input);
			if(++element > capacity*loadf) 
				resizeTable();
		}
		
	}
	
	public E remove(E input) {
		
	}
	public boolean contains(E input) {
		int code = convertToIndex(input.hashCode());
		if(table[code].isEmpty()) {
			return false;
		}
		return false;
	}
	public int size() {
		return element;
	}
	public String toString() {
		
	}
	private int convertToIndex(int input) {
		return input%capacity;
	}
	private void resizeTable() {
		capacity = capacity*2;
		LinkedList<E>[] newTable = new LinkedList[capacity];
		for(int i =0;i<table.length;i++) {
			if(table[i]!=null) {
				for(E e:table[i]) {
					int code = convertToIndex(table[i].hashCode());
					newTable[code] = new LinkedList<>();
					newTable[code].add(e);
				}
				table[i].clear();
				table[i] = null;
			}
		}
		table = newTable;
	}
}
