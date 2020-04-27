import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pipelining {

	public static void main(String[] args) {
		IntStream.range(0, 5)
				.filter(s -> {
					System.out.println("filter - " + s);
					return s >= 2;
					})
				.map(s -> {
					System.out.println("map - " + s);
					return s;
					})
				.boxed()
				.collect(Collectors.toCollection(ArrayList::new));


	}

}
