import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	 public static void tri_selection(int[] tab)
     {
          for (int i = 0; i < tab.length - 1; i++)  
          {
               int index = i;  
               for (int j = i + 1; j < tab.length; j++)
               {
                    if (tab[j] < tab[index]){ 
                         index = j;
                    }
               }
 
               int min = tab[index];
               tab[index] = tab[i]; 
               tab[i] = min;
          }
     }
     static void displayTab(int[] tab){
          for(int i=0; i < tab.length; i++)
          {  
               System.out.print(tab[i] + " ");  
          } 
          System.out.println();    
     }
  
     public static void main(String a[])
     {  
          int[] tab = {-4, 1, 13, 4, 16, 2, 13, 14}; 
          System.out.println("**** Avant le tri par selection *****");
          displayTab(tab);
          //tri d un tableau avec l algorithme de tri par selection
          tri_selection(tab);
          System.out.println("**** Apres le tri par selection ****");  
          displayTab(tab); 
     } 

}
