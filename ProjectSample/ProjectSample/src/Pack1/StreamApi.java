package Pack1;

import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
		//create a stream
		Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
		stream.forEach(System.out::println);
	}

}
