class ClaseR implements IHija1{
  public int metodo1IH1(char c, int e){
    System.out.println("Char de clase R: " + c + " por parte de IHija1");
    return e;
  }
  public char metodo1IP1(char c1,char c2){
    System.out.println("Char de clase R: " + c1 + " y " + c2 +" por parte de IPadre1");
    return c1;
  }
  public float metodo2IP1(float f){
    System.out.println("Usando metodo metodo3IP1 de IPadre1 desde clase R");
    return f;
  }
}
