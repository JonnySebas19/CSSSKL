public class ObjectList { //or IntList, caps at 100 elements with no bullet-
    //proofing or bounds checks, etc.
    private int numElements = 0;
    private Object[] myShapes = new Object[100];
    public void add(Object shape) {
        if (numElements < 99) {
            myShapes[numElements++] = shape;
        } else {
            System.out.println("Array full... Cannot hold any more shapes");
        }
    }
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += myShapes[i];

            if (i != numElements - 1){
                retVal += ", ";
            }
        }
        return retVal;
    }
    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(95);
        a.add(100);
        a.add(58);
        //System.out.println(a.toString()); // Going to add this once I figure out what
        //is supposed to be in the object
        System.out.println(a.sum() );
        System.out.println(a.indexOf(100));
        System.out.println(a.indexOf(20));
        //System.out.println(a.save() );
    }
}