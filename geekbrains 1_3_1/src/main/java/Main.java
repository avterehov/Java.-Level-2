import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){


        Integer[] nums = { 1,2,3,4,5};

        BoxUltimate<Integer> arrayNums = new BoxUltimate(nums);

      arrayNums.printArray();
      arrayNums.swapPositions(3,4);
      System.out.println("Преобразованный массив");
      arrayNums.printArray();

        Integer[] nums2 = { 1,2,3,4,5};
        ArrayList<Integer> arrlist = BoxUltimate.convertToArrayList(nums2);

        System.out.println();
        System.out.println("Вывод созданного ArrayList:");
        System.out.println(arrlist);












    }
}
