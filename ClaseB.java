public class ClaseB extends ClaseA implements IHija1,IPadre2{ 
  public int enteroCB;
  public int metodo1IH1(char c, int e){ 
    System.out.println("Ejecutando el metodo metodo1IH1(), implementando dentro de ClaseB");
    return e;
  }
  public int metodo1IP2(char c1, int e){
    System.out.println("Ejecutando el metodo metodo1IP2(), implementado dentro de ClaseB");
    return c1;
  }
  public void metodo2IP2(String texto){
    System.out.println("Ejecutando el metodo metodo2IP2(), implementado de Clase B");
  }
  public char metodo1IP1(char c1, char c2){
    System.out.println("Ejecutando el metodo1IP1(), desde Clase B ");
    return c1;
  }
  public float metodo2IP1(float f){
    System.out.println("Ejecutando el metodo2IP1(), implementando en ClaseB");
    return f;
  }
  public void metodoCB(){
    System.out.println("Ejecutando el metodo metodoCB(), definido dentro de ClaseB");
  }
}
