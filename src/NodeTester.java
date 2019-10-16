public class NodeTester {
    public static void main(String[] args)
    {
        Actor egghead = new Actor("Egghead");
        Actor yolkhead = new Actor("Yolkhead");
        yolkhead.next = egghead;
        Actor baldhead = new Actor("Baldhead");
        baldhead.next = yolkhead;
        Actor whitehead = new Actor("Whitehead");
        whitehead.next = baldhead;
        Actor crimphead = new Actor("Crimphead");
        crimphead.next = whitehead;
        Actor stinkhead = new Actor("Stinkhead");
        stinkhead.next = crimphead;
        Actor current = stinkhead;
        while (current != null)
        {
            System.out.println(current);
            current = current.getNextPtr();
        }

    }
}
