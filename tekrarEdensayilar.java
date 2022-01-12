import java.util.*;

public class MyClass {

  
    public static void main(String args[]) {
     
        List<Integer> arraylist = Arrays.asList(1,3,1,1,3,4,7,8,7,9,8,7);

        Map<Integer, Integer> kactane = new HashMap<>();

        int bisey;
        for(int i = 0; i < arraylist.size();i++){
            int temp = arraylist.get(i);
        
        if(kactane.get(temp) != null){

            bisey = (kactane.get(temp));
            kactane.put(temp,(++bisey));
        }
            else 
                kactane.put(temp,1);
                
        System.out.println(kactane);

    
    }
}
}