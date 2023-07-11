package basicpro.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringsA = Arrays.asList("a1", "b5", "a2", "b4");

        Set<String> firstElement = stringsA.stream().findFirst().stream().collect(Collectors.toSet());
        System.out.println(firstElement);
        //---
        List<Integer> numbers = Arrays.asList(1, 12, 3, 10, 12, 17);

        Set<Integer> oddNumbers = numbers.stream().filter(i -> i%2 != 0).collect(Collectors.toSet());
        System.out.println(oddNumbers);
        //---
        List<Integer> numbersOne = Arrays.asList(1, 12, 3, 10, 12, 17);

        List<Double> numbersOnePlusTwenty = numbersOne.stream().map(x -> x+(x*0.2)).toList();
        System.out.println(numbersOnePlusTwenty);
        //---
        List<String> stringBens = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        long howManyBig = stringBens.stream().filter(i->i.contains("Big")).count();
        System.out.println(howManyBig);
        //---
        List<String> stringsaOne = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        Set<String> sortedStrings = stringsaOne.stream().sorted(Collections.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(sortedStrings);
    }
}
