package maxByComp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class comparatorMax {
	public static void main(String[] args)
	{
		empleados();
	}
	
	
	public static void maxB(){
		// creating a Stream of strings
		Double rest = 0.00;
		Stream<Integer> s = Stream.of(2,3,4,5);
        List<String> stringList = Arrays.asList("zducative", "io", "edpresso");
        
        System.out.println("Stream before modification - " + stringList);
        Stream<String> stringStream = stringList.stream();
        Optional<String> maxElement = stringStream.collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println("Maximum element of the stream - " + (maxElement.orElse("null")));


		// using Collectors maxBy(Comparator comparator)
		// and finding the maximum element
		// in reverse order
		Optional<Integer> obj = s.collect(Collectors.minBy(Comparator.reverseOrder()));

		// if present, print the element
		// else print the message
		if (obj.isPresent()) {
			System.out.println(obj.get());
		}
		else {
			System.out.println("no value");
		}
	}
	
	public static void empleados(){
		Pagos p1 = new Pagos("Empleado1", 155000);
        Pagos p2 = new Pagos("Empleado2", 100000);
        Pagos p3 = new Pagos("Empleado3", 120000);
 
        List<Pagos> salarios = Arrays.asList(p1, p2, p3);
 
        // get a person with the minimum income
        Pagos min = salarios.stream()
                            .collect(Collectors.minBy(
                                Comparator.comparingInt(Pagos::getIngreso))).
                            get();
        System.out.println("Empleado con salario minimo " + min);
 
        // get a person with the maximum income
        Pagos max = salarios.stream()
                            .collect(Collectors.maxBy(
                                Comparator.comparingInt(Pagos::getIngreso)))
                            .get();
        System.out.println("Empleado con salario maximo" + max);
	}

}
