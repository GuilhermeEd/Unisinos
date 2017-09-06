import java.lang.*;

public class NotacaoPolonesaReversa{
    
    private static Object[] o;
    private static Stack s;

    public static float calc(String str){

        o = str.split(" ");
        s = new Stack(o.length);
        
        try {
            for(int i = 0; i < o.length; i++){
                if(o[i].equals("+")) add();
                else if(o[i].equals("-")) sub();
                else if(o[i].equals("*")) mult();
                else if(o[i].equals("/")) div();
                else s.push(o[i]);
            }
            return Float.parseFloat(s.pop().toString());
        } catch (OverflowException e) {
            System.out.println(e.toString());
        }catch (UnderflowException e) {
            System.out.println(e.toString());
		}
		return 0;
    }

    private static void add(){
        try{
            float a = Float.parseFloat(s.pop().toString());
            float b = Float.parseFloat(s.pop().toString());
            s.push(a+b);
        } catch (OverflowException e) {
            System.out.println(e.toString());
        } catch (UnderflowException e) {
            System.out.println(e.toString());
        }
    }

    private static void sub(){
        try{
            float b = Float.parseFloat(s.pop().toString());
            float a = Float.parseFloat(s.pop().toString());
            s.push(a-b);
        } catch (OverflowException e) {
            System.out.println(e.toString());
        } catch (UnderflowException e) {
            System.out.println(e.toString());
        }
    }

    private static void mult(){
        try{
            float a = Float.parseFloat(s.pop().toString());
            float b = Float.parseFloat(s.pop().toString());
            s.push(a*b);   
        } catch (OverflowException e) {
            System.out.println(e.toString());
        } catch (UnderflowException e) {
            System.out.println(e.toString());
        }
    }

    private static void div(){
        try{
            float a = Float.parseFloat(s.pop().toString());
            float b = Float.parseFloat(s.pop().toString());
            s.push(b/a);
        } catch (OverflowException e) {
            System.out.println(e.toString());
        } catch (UnderflowException e) {
            System.out.println(e.toString());
        }
    }
    
        public static void main(String args[]) {
        System.out.println("Resultado de 2 + 3: " + NotacaoPolonesaReversa.calc("2 3 +"));
        System.out.println("Resultado de 8 - 1: " + NotacaoPolonesaReversa.calc("8 1 -"));
        System.out.println("Resultado de 3 * 2: " + NotacaoPolonesaReversa.calc("3 2 *"));
        System.out.println("Resultado de 4 / 2: " + NotacaoPolonesaReversa.calc("4 2 /"));
        System.out.println("Resultado de (10 + 2) / 3: " + NotacaoPolonesaReversa.calc("10 2 + 3 /"));
        System.out.println("Resultado de ( (4*5) - (2*6) ) / (1*4): " + NotacaoPolonesaReversa.calc("4 5 * 2 6 * - 1 4 * /"));
	}
    
}