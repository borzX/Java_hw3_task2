import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public void removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> arrayList= new ArrayList<Integer>();
      for (int i=0; i<arr.length; i++){
        if (arr[i]%2==0){
        }
        else{
            arrayList.add(arr[i]);
        }
      }
      System.out.println(arrayList.toString());
    }  
    
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        // arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}
