package equipamentos;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica
{
    public static void main(String[] args)
    {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();
        Laserjet printer = new Laserjet();
        Xerox photocopier = new Xerox();

        Impressora impressora = printer;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = photocopier;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
