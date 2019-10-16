public class ListTester {
    public static void main(String[] args)
    {
        ActorLinkedList  list = new ActorLinkedList();
        list.add(new Actor("1"));
        list.add(new Actor("2"));
        list.add(new Actor("3"));
        list.add(new Actor("4"));
        list.add(new Actor("5"));
        for (int i =0; i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(0).getName());

    }
}
