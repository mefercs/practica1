public class ClaseA implements IPadre1 { 
  public char letraCA;
  public char metodo1IP1(char c1, char c2){
    System.out.println("Ejecutandose el metodo metodo1IP1(), definido dentro de la ClaseA");
    return c1;
  }
  public float metodo2IP1(float f){
    System.out.println("Ejecutandose el metodo metodo2IP1(), definido dentro de la ClaseA");
    return f;
  }
  public void metodoCA(){ 
    System.out.println("Ejecutandose el metodo metodoCA(), definido dentro de ClaseA");
  }
}
