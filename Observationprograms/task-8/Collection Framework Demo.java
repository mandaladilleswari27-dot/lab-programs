import java.util.*;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {

        // 1. Collection Interface
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        System.out.println("Collection: " + c);
        System.out.println("Contains 20: " + c.contains(20));
        System.out.println("Size: " + c.size());

        // 2. List Interface
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add(1, "HTML");
        System.out.println("\nList: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        list.set(1, "CSS");
        System.out.println("Updated List: " + list);
        System.out.println("Index of Java: " + list.indexOf("Java"));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 3. Set Interface
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("\nSet: " + set);
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Set Size: " + set.size());

        // 4. SortedSet Interface
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(40);
        ss.add(10);
        ss.add(30);
        ss.add(20);
        System.out.println("\nSortedSet: " + ss);
        System.out.println("First: " + ss.first());
        System.out.println("Last: " + ss.last());
        System.out.println("HeadSet: " + ss.headSet(30));
        System.out.println("TailSet: " + ss.tailSet(20));

        // 5. NavigableSet Interface
        NavigableSet<Integer> ns = new TreeSet<>(ss);
        System.out.println("\nLower than 30: " + ns.lower(30));
        System.out.println("Floor of 30: " + ns.floor(30));
        System.out.println("Ceiling of 25: " + ns.ceiling(25));
        System.out.println("Higher than 30: " + ns.higher(30));
        System.out.println("Descending Set: " + ns.descendingSet());

        // 6. Queue Interface
        Queue<String> q = new LinkedList<>();
        q.offer("A");
        q.offer("B");
        q.offer("C");
        System.out.println("\nQueue: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());
        System.out.println("Queue after poll: " + q);

        // 7. Deque Interface
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        System.out.println("\nDeque: " + dq);
        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());
        dq.removeLast();
        System.out.println("Deque after removal: " + dq);

        // 8. Map Interface
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");
        System.out.println("\nMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // 9. SortedMap Interface
        SortedMap<Integer, String> sm = new TreeMap<>();
        sm.put(30, "C");
        sm.put(10, "Java");
        sm.put(20, "Python");
        System.out.println("\nSortedMap: " + sm);
        System.out.println("First Key: " + sm.firstKey());
        System.out.println("Last Key: " + sm.lastKey());
        System.out.println("HeadMap: " + sm.headMap(30));
        System.out.println("TailMap: " + sm.tailMap(20));

        // 10. NavigableMap Interface
        NavigableMap<Integer, String> nm = new TreeMap<>(sm);
        System.out.println("\nLower Key: " + nm.lowerKey(20));
        System.out.println("Floor Key: " + nm.floorKey(20));
        System.out.println("Ceiling Key: " + nm.ceilingKey(15));
        System.out.println("Higher Key: " + nm.higherKey(20));
        System.out.println("First Entry: " + nm.firstEntry());
        System.out.println("Descending Map: " + nm.descendingMap());

        // 11. Iterator Interface
        Iterator<String> it = list.iterator();
        System.out.print("\nIterator Elements: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 12. ListIterator Interface
        ListIterator<String> lit = list.listIterator();
        System.out.print("Forward Traversal: ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.print("\nBackward Traversal: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();
    }
}
