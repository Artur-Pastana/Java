package Cap10.ClasseAbstrata;

public class Teste {
    public static void main(String[] args) {
        
        //criando objetos de subclasse
        EmpAssalariado empAssal  = new EmpAssalariado("Artur", "Pastana", "390133", 6000.0);

        Horista horista = new Horista("Aslan", "pietro","014.057",16.75, 40.0);

        EmpComissionado empComis = new EmpComissionado("Iris", "Juliany", "27092012",300, 0.6);

        BaseEmpComissionado baseEmpComis = new BaseEmpComissionado("Anne", "Caroline", "25111996", 1000, 0.58, 9450.50);

        System.out.println("Dados individuais dos Empregados");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", empAssal,"Lucros",empAssal.lucros());

        System.out.printf("n%s%n%s: $%,.2f%n%n",horista,"lucros",horista.lucros());

        //System.out.printf("n%s%n%s: $%,.2f%n%n",empComis,"Lucros",empComis.lucros());

        System.out.printf("n%s%n%s: $%,.2f%n%n",baseEmpComis,"Lucros",baseEmpComis.lucros());

        Empregado[] empregados = new Empregado[3];

        //inicializa o array de empregados
        empregados[0] = empAssal;
        empregados[1] = horista;
        empregados[2] = baseEmpComis;

        System.out.printf("Empregados processados poliformicamente: %n%n");

        //processa genericamente cada elemento
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
            
            //determina se elemento é um basePlus 
            if (empregado instanceof BaseEmpComissionado) {
                // downcast da referência de Employee para
                // referência a BasePlusCommissionEmployee
                BaseEmpComissionado emp = (BaseEmpComissionado) empregado;

                emp.setSalarioBase(1.10* emp.getSalarioBase());

                System.out.printf("Nova base salarial de 10%% : $%,.2f%n",emp.getSalarioBase());
            }//fim do if

            for(int i = 0; i < empregados.length; i++){
                System.out.printf("Empregado %d é: %s%n",i+1,empregados[i].getClass().getName());
            }

            
        }




    }
}