package hashCode;

import java.util.ArrayList;
/**
 * This class is used to create the hash table with chaining.
 * @author RuotongXu 16935995
 *
 * @param <E>
 */



public class HashTableWithChaining<E> {
	private double loadf = 0;
	public int capacity = 0;
	private int element = 0;
	private ArrayList<E> []table;
	/**
	 * Initialize the default table size is 5, max load factor is 0.75 and make the table as a array of arraylist(the arraylist can store the collisions).
	 */
	public HashTableWithChaining() {
		this.capacity = 5;
		this.loadf = 0.75;
		table = new ArrayList[this.capacity];
	}
	/**
	 * This is the add method which can get the input object then use convert to index to get the index which is the place in the table, when the 
	 * number of items in this table achieve the capacity*load factor, it will call resize method to resize the table.
	 * @param input
	 */
	public void add(E input) {
		int code = convertToIndex(input.hashCode());
		if(table[code]!=null) {
			table[code].add(input);
		} else {
			table[code] = new ArrayList<>();
			table[code].add(input);
			if(++element > capacity*loadf) 
				resizeTable();
		}
		System.out.println(input.toString()+" has been added");
	}
	/**
	 * This is the remove method which first get the index of the input method then call the remove method in arraylist class, to remove that object.
	 * @param input
	 * @return
	 */
	public E remove(E input) {
		if(contains(input)) {
			table[convertToIndex(input.hashCode())].remove(input);
			--element;
			return input;
		} else {
			return null;
		}
	}
	/**
	 * This is the contain method which first get the index of input method, if the arraylist is exist in this place, then it use contain method in arraylist to find that object.
	 * @param input
	 * @return
	 */
	public boolean contains(E input) {
		int code = convertToIndex(input.hashCode());
		try {
			if(table[code].isEmpty()) {
				return false;
			} else {
				if(table[code].contains(input)) {
					
					return true;
				} else {
					return false;
				}
			}
			
		} catch(Exception e){
			return false;
		}
	}
	/**
	 * This is the size method which get how many element in this table.(The collisions are not included)
	 * @return
	 */
	public int size() {
		return element;
	}
	/**
	 * This is the tostring method of this class which display the table.
	 */
	public String toString() {
		String output = "";
		for(int i =0;i<table.length;i++) {
			if(table[i] == null||table[i].isEmpty()) {
			} else {
				output = output+"\nIndex: "+convertToIndex(table[i].get(0).hashCode());
				for(E temp:table[i]) {
					output = output+" "+temp.toString()+" |";
				}
			}
		}
		return output;
	}
	/**
	 * This is the convertToIndex method which modulo the hashcode of the object and return the index number.
	 * @param input
	 * @return
	 */
	private int convertToIndex(int input) {
		int temp = input%capacity;
		if(temp<0) {
			temp = -temp;
		}
		return temp;
	}
	/**
	 * This is the method which make the table expand 2 times capacity. basically, it just copy the old table elements into the new table
	 * and also get the new index number because the capacity number changes.
	 */
	private void resizeTable() {
		this.capacity = capacity*2;
		ArrayList<E>[] newTable = new ArrayList[capacity];
		for(int i =0;i<table.length;i++) {
			if(table[i]!=null) {
				int code = convertToIndex(table[i].get(0).hashCode());
				newTable[code] = new ArrayList<>();
				for(E e:table[i]) {
					newTable[code].add(e);
				}
				table[i].clear();
				table[i] = null;
			}
		}
		table = newTable;
	}
}
