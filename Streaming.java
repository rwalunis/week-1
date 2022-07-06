package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.RepeatingName;
import service.RepeatService;

public class Streaming {
	
	private RepeatService repeatService = new RepeatService();

	public static void main(String[] args) {
		new Streaming().run();

	}
	
	
	
//your repeating characters will be placed inside of a map (so
	private void run() {
		Map <String, List<RepeatingName>> names = repeatService.findRepeatingNames();
		System.out.println(names);
//instead of "System.out.println(names)" call method "entryset" on names which returns a list on entry objects with a 
//key and value. and forEach method which requires a lambda expression. for each entry, we want to print the key(a) 
//and the list of lastNames	that were in the repeatingcharacters. remember that "getValue" is a list so you can stream it
//and now you can map it to a list of string of the name itself. at the end we have a stream of string
//last name and you use a collector		
//@formatter:off		
		names.entrySet().forEach(entry ->
		System.out.println(entry.getKey() + "! " +
				entry.getValue().stream()
				.map(RepeatingName::getName)
		        .collect(Collectors.toList())));
//at the very end, your result should look like: a! [Baak, Baar, Baaz]
//		b! [Babb]
//		e! [Peek]
//		f! [Luff]
//		l! [Gill, Pell]
//		n! [Lunn, Penn, Unni, Unno]

		
//@formatter:on		
	}

}
