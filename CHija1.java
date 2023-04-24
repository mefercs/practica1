abstract class CHija1 extends CPadre{
  public int entero1CH1;
  public int entero2CH1;
  abstract public void metodo1CH1(int e);
  // declarando la clase padre de la clase hija1 
  public float metodo2CP(int e, float f){
    float r = e*f;
    System.out.println("Ejecutandose el metodo abstracto: metodo2CP");
    return r;
  }
}
