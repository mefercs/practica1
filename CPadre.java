abstract class CPadre{
  public int enteroCP; 
  public float realCP;
  public int metodo1CP(int e){ 
    int temp = 25;
    System.out.println("Ejecutando el metodo1CP("+e+");...");
    return e*2;
  }
  abstract public float metodo2CP(int e, float f); 
}
