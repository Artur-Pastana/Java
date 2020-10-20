package Cap9.Heranca;

public class ComissaoTeste {
    public static void main(String[] args) {
        
        //cria um objeto
        ComissaoEmpregado empregado = new ComissaoEmpregado("Artur", " Da glória", "390133", 1500, 0.8);

        System.err.println("informações do empregado");
        System.out.println("Nome é: "+empregado.getNome());
        //System.out.printf("%n%s:%n%n%s%n","informações do empregado",empregado);

        
        BaseComiEmpregado empregado2 = new BaseComiEmpregado(945.50, "Aslan", "pietro", "01405712210", 500, 0.4);
        System.out.println("Nome: "+empregado2.getNome()+" "+empregado2.getSobreNome());
        System.out.println("Base salarial: "+empregado2.getSalarioBase()+"\nLucros: "+empregado2.lucros());
        System.out.println(empregado2);

    }
}