import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Person;


public class LazyLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Person> streamOfNames = SampleData.getPersonData().stream()
				.map(student -> {
					System.out.println("In Map - " + student.getName());
					return student;
				});
				//Just to add some delay
				for (int i = 1; i <= 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(i + " sec");
				}
				//Called a terminal operation on the stream
				streamOfNames.collect(Collectors.toList());

		
	}

}
