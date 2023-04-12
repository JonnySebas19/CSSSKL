/** for Class Design - IntList */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class IntList { //or IntList, caps at 100 elements with no bullet-
    //proofing or bounds checks, etc.
    private int numElements = 0;
    private int[] data = new int[100];
    public void add(int number) {
        data[numElements++] = number;
    }

    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += data[i];

            if (i != numElements - 1){
                retVal += ", ";
            }
        }
        return retVal;
    }
    public int sum(){
        int total = 0;
        for (int num : this.data){
            total += num;
        }
        return total;
    }
    public int indexOf(int target){
        for (int index = 0; index < this.data.length; index++){{
                if (this.data[index] == target){
                    return index;
                }
            }
        }
        return -1;
    }
    public boolean save(){
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream("SaveFile.txt", true));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return false;
        }

        for (int num : this.data) {
            System.out.println(num);
            outputStream.println(num);
        }
        return true;
    }
    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(95);
        a.add(100);
        a.add(58);
        System.out.println(a);
        System.out.println(a.sum() );
        System.out.println(a.indexOf(100));
        System.out.println(a.indexOf(20));
        //System.out.println(a.save() );
    }
}