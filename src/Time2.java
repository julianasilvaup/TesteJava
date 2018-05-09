public class Time2 {

    private int hora; //0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    public Time2(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public Time2(int h) {
        this.hora = h;
    }

    public Time2(int h, int m) {
        this.hora = h;
        this.minuto = m;
    }

    // Declare os metodos na classe Time2
    public int getHora() {
        return hora;
    }

    public void setHora(int h) {
        hora = ((h >= 0 && h < 24) ? h : 0);
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int m) {
        this.minuto = ((m >= 0 && m < 60) ? m : 0);
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int s) {
        this.segundo = ((s >= 0 && s < 60) ? s : 0);
    }

    public void setTime(int h, int m, int s) {
        hora = ((h >= 0 && h < 24) ? h : 0);
        minuto = ((m >= 0 && m < 60) ? m : 0);
        segundo = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
          ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
          getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));

    }

}
