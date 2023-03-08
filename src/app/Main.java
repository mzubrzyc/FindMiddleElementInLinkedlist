package app;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getSimpleName());
    private static final int RANGE_TO_EXPLICIT = 6;

    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = IntStream.range(1, RANGE_TO_EXPLICIT)
                .mapToObj(String::valueOf)
                .collect(Collectors.toCollection(LinkedList::new));
        log.info("Input linkedList: " + inputLinkedList);
        List<String> middleElementOfLinkedListInOnePass =
                ListMiddleElementFinder.findMiddleElementOfListInOnePass(inputLinkedList);
        log.info("Middle element of linkedList " + inputLinkedList + " in one pass is: " + middleElementOfLinkedListInOnePass);
    }

}