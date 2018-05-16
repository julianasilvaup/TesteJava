//Deitel & Deitel, 2010 - Cap. 8 - Pág 242
public class Time1 {
    private int hora; //0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59
    
    public void setTime(int h, int m, int s){
        hora = ((h >= 0 && h < 24) ? h : 0); 
        minuto = ((m >= 0 && m < 60) ? m : 0); 
        segundo = ((s >= 0 && s < 60) ? s : 0); 
    }
    
public String toUniversalString(){
    return String.format("%02d:%02d:%02d", hora, minuto, segundo);
}
    
public String toString(){
    return String.format("%d:%02d:%02d %s", 
     ((hora == 0 || hora == 12) ? 12 : hora % 12),
     minuto, segundo, (hora < 12 ? "AM":"PM"));
       
    }
}
