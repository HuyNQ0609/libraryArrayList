public class Main {
    public static void main(String[] args) {
        MyList<Integer> lists = new MyList<>(10);
        lists.add(8);
        lists.add(9);
        lists.add(10);
        lists.add(11);
        lists.add(12);
        lists.add(13);

        lists.print();
        System.out.println("//*-----------------RR-----------------*/");

        lists.add(1, 24);
        lists.print();

        System.out.println("//*-----------------RR-----------------*/");

        lists.remove(3);
        lists.print();

        System.out.println("//*-----------------RR-----------------*/");

        System.out.println(lists.indexOf(9));

        System.out.println("//*-----------------RR-----------------*/");

        System.out.println(lists.contains(9));

        System.out.println("//*-----------------RR-----------------*/");

        lists.clear();
    }
}