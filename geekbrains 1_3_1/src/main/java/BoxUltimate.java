
import java.util.ArrayList;
import java.util.Arrays;


public class BoxUltimate <T> {

    private T[] obj;


    public BoxUltimate (T[] obj){
        this.obj = obj;
    }


    public void swapPositions ( int positionOne, int positionTwo) {
        T boofer = obj[positionTwo];
        obj[positionTwo] = obj[positionOne];
        obj[positionOne] = boofer;
    }

    public void printArray (){
        for (int i = 0; i< obj.length; i++){
            System.out.print(obj[i]+" ");
        }
    }

    public static <T> ArrayList<T> convertToArrayList (T[] array) {
    return new ArrayList<T>(Arrays.asList(array));
    }




        }






