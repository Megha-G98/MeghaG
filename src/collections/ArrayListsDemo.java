package collections;

import java.util.HashSet;

public class ArrayListsDemo {

	public static void main(String[] args) {
		
		HashSet<String> books =new HashSet<String>();{
			books.add("Red Book");
			books.add("Blue Book");
			books.add("Orange Book");
			books.add("Purple Book");
			System.out.println(books);
			
			if(books.contains("Red Book")){
				System.out.println("Book is Present");
			}
			else {
				System.out.println("Book is Present");
			}
			
		}

	}

}

