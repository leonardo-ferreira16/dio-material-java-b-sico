package estabelecimento;
import equipamentos.impressora.*;
import equipamentos.multifuncional.*;
import equipamentos.copiadora.*;
import equipamentos.digitalizadora.*;


public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora1 = new Deskjet();
        Impressora impressora2 = new Laserjet();
        Impressora equipamento = new EquipamentoMultifuncional();

        //Para afirmar que o equipamento funcional pode ser tanto impressora, quanto copiadora e também digitalizadora:

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora4 = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora1.imprimir();
        impressora2.imprimir();
        equipamento.imprimir();

        System.out.println("\n===========================\n");

        impressora4.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
