 

public class Sorting {

    public static void insertionSort (int a[]) { 
        System.out.println("Vetor Inicial:");
        print(a);
        for (int i = 1; i < a.length; i++) { 
            int j = i; 
            int B = a[i]; 
            while ((j > 0) && (a[j-1] > B)) { 
                a[j] = a[j-1]; 
                j--;                 
            }
            a[j] = B;
            print(a);
        } 
    }
    
     public static void bubbleSort(int a[]) { 
            
            for (int i = a.length; --i>=0; ) { 
                boolean flipped = false;
                for (int j = 0; j<i; j++) { 
                    if (a[j] > a[j+1]) { 
                        int T = a[j]; 
                        a[j] = a[j+1]; 
                        a[j+1] = T; 
                        flipped = true; 
                    } // if 
                } // for
                if (!flipped) return;
                print(a);
            } // for
        } 
     
     public static void quickSort (int[] a, int lo, int hi){
            int i=lo, j=hi, h;
            int x=a[(lo+hi)/2];
       
            //  partition
            do
            {    
                while (a[i]<x) i++; 
                while (a[j]>x) j--;
                if (i<=j)
                {
                    h=a[i]; a[i]=a[j]; a[j]=h;
                    i++; j--;
                }
            } while (i<=j);
            //  recursion
            if (lo<j) quickSort(a, lo, j);
            if (i<hi) quickSort(a, i, hi);
        }

     public static void quickSort(int a[]) {
            quickSort(a, 0, a.length-1);
        }
     
     public static void selectionSort  (int a[]) {
            int min=0, ch;
            for  (int i=0; i<a.length-1; i++) {
                 min  =  i;         // mínimo inicial 
                 for  (int j  =  i + 1; j<a.length; j++)
                    if  (a [ j ]  <  a [ min ]) min  =  j;  // novo mínimo
                 ch  =  a [ i ];
                 a [ i ]  =  a [ min ] ;    // insere
                 a [ min ]  =  ch;
                 print(a);
            }
        }
     
     public static void print (int a[]) { 
            System.out.println();
            for (int i = 0; i < a.length; i++) System.out.print(a[i]+", ");
        }
     
     public static int pesquisaBinaria(int[] arr, int key) throws Exception {
         int inf = 0, sup = arr.length -1;
         return pesquisaBinaria(arr, key, inf, sup);
        }

     public static int pesquisaBinaria(int[] arr, int key, int inf, int sup) throws Exception{
         int med = (inf + sup) / 2;
         if (key == arr[med] ) return med;
         else if ( inf == sup ) return -1;
         else if ( key > arr[med] ) return pesquisaBinaria( arr, key, med + 1, sup);
         else if ( key < arr[med] ) return pesquisaBinaria( arr, key, inf, med - 1);
         else throw new java.lang.Exception();
        }
        
    public static void main(String[] args) {
        int a []= {46, 30, 2, 1, 19, 89, 20};
        
        //int b [] = {10,3,9,11,8,7,1,5};
        
        
        System.out.println ("\n\nVetor original:");
        print(a);
        //System.out.println ("\n\n Ap—s seleção direta:");
        //bubbleSort(a);
        selectionSort(a);
        //insertionSort (b);
        print(a);
        
        System.out.println ("\n\nPesquisa Binária pelo elemento 30: ");
        try{
            System.out.println (pesquisaBinaria(a,30));
        } 
        catch(Exception e){
            System.out.println (e);
        }
    }

}
