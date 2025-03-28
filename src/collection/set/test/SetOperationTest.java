package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2); //합집합 함수
        System.out.println("합집합 : " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //교집합
        System.out.println("교집합 : " + intersection);

        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2); //차집합
        System.out.println("차집합 : " + diff);
    }
}
