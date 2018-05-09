//Deitel & Deitel, 2010 - Cap. 8 - Pág 244
public class Time1Test {

  public static void main(String[] args) {
    Time1 time = new Time1();
    System.out.print("Valor universal inicial de time: ");
    System.out.println(time.toUniversalString());
    System.out.print("Valor default inicial de time: ");
    System.out.println(time.toString() + "\n");

    //Altera a hora e gera saidas atualizadas
    time.setTime(13, 27, 6);
    System.out.print("Valor universal depois de setTime: ");
    System.out.println(time.toUniversalString());
    System.out.print("Valor default depois de setTime: ");
    System.out.println(time.toString() + "\n");

    //Hora com valores invalidos e gera saidas atualizadas
    time.setTime(99, 99, 99);
    System.out.print("Valor universal depois de valores invalidos: ");
    System.out.println(time.toUniversalString());
    System.out.print("Valor default depois de de valores invalidos: ");
    System.out.println(time.toString() + "\n");
 }
}
