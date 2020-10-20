package Cap5.DoWhile;

public class TesteAutoPolice {
    public static void main(String[] args) {
        
        AutoPolicy pol1 = new AutoPolicy(2728, "Prisma", "MA");
        AutoPolicy pol2 = new AutoPolicy(2828, "HB20", "AP");

        policyInNoFaultState(pol1);
        System.out.println();
        policyInNoFaultState(pol2);
    }
    // método que mostra se um AutoPolicy
    // está em um estado com seguro de automóvel “sem culpa”
    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("A Apolice:");
        System.out.printf("Numero da conta : %d%nCarro : %s%nEstado : %s%n%s a no-fault Estado",
        policy.getNumconta(), policy.getMarcaCarro(), policy.getEstado(),
        (policy.isNoFaultState()? "Tem" : "não tem"));
    }
}
