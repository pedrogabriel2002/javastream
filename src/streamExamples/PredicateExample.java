package streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
	List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "C", "Go", "Ruby");
	
	Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
	
	palavras.stream()
	.filter(p -> p.length() < 5)
	.forEach(p -> System.out.println(p));
	}
}
