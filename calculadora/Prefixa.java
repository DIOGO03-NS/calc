import java.util.Stack;
////////////////////////////////////////////////////////////////
public class Prefixa {
    private String operacao(double n1, double n2, String op){
        if(op.equals("+")){
            return Double.toString(n2+n1);
        } else if(op.equals("-")){
            return Double.toString(n2-n1);
        } else if(op.equals("*")){
            return Double.toString(n2*n1);
        } else if(op.equals("/")){
            return Double.toString(n2/n1);
        } else {
            return Double.toString(0.0);
        }
    }

    public double calcular(String operacao){
        Stack<String> pilha = new Stack<>();
        Stack<Double> aux = new Stack<>();
        double resultado = 0.0;
        String[] op = operacao.split(" ");
        for(int i = 0; i < op.length; i++){
            pilha.push(op[i]);
        }
        
        while(true){
            if((pilha.peek().equals("+")) || (pilha.peek().equals("-")) || (pilha.peek().equals("*")) || (pilha.peek().equals("/"))){
                String operador = pilha.pop();
                double n1 = aux.pop();
                double n2 = aux.pop();
                pilha.push(operacao(n2, n1, operador));
            }else{
                double num = Double.parseDouble(pilha.pop());
                aux.push(num);
            }
            if(aux.size() == 1 && pilha.size() == 0){
                resultado = aux.pop();
                break;
            }
        }
        return resultado;
    }
}
