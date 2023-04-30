public class Infixa {
    public double calcular(double n1, String operador, double n2){
        if(operador.equals("+")){
            return n1+n2;
        }else if(operador.equals("-")){
            return n1 - n2;
        }else if(operador.equals("*")){
            return n1 * n2;
        }else if(operador.equals("/")){
            return n1/n2;
        }else{
            return 0.0;
        }
    }

    public double calcular(String operacao){
        String[] op = operacao.split(" ");

        double n1 = Double.parseDouble(op[0]);
        String opc = op[1];
        double n2 = Double.parseDouble(op[2]);
        
        return calcular(n1, opc, n2);
    }
}