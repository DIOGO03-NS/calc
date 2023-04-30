import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Posfixa {
    private String operacao(double n1, double n2, String op){
        if(op.equals("+")){
            return Double.toString(n1+n2);
        }else if(op.equals("-")){
            return Double.toString(n1-n2);
        }else if(op.equals("*")){
            return Double.toString(n1*n2);
        }else if(op.equals("/")){
            return Double.toString(n1/n2);
        }else{
            return Double.toString(0.0);
        }
    }
    public double calcular(String operacao){
        Queue<String> fila = new LinkedList<>();
        Stack<Double> aux = new Stack<>();
        double resultado;
        String [] op = operacao.split(" ");
        for(int i = 0; i < op.length; i++){
            fila.add(op[i]);
        }

        while(true){
            if((fila.peek().equals("+")) || (fila.peek().equals("-")) || (fila.peek().equals("*")) || (fila.peek().equals("/"))){
                String operador = fila.poll();
                double n1 = aux.pop();
                double n2 = aux.pop();
                fila.add(operacao(n2, n1, operador));
            }else{
                double num = Double.parseDouble(fila.poll());
                aux.push(num);
            }
            if(aux.size() == 1 && fila.isEmpty()){
                resultado = aux.pop();
                break;
            }
        }


        return resultado;
    }
}
