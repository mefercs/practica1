class CHija2 extends CPadre{
  public float realCH2; 
  public float metodo1CH2(float f){
    float r = 50*f;
    System.out.println("Ejecutandose el metodo: metodo1CH2() definido");
    return r;
  }
  public float metodo2CH2(int e, float f){
    float r = e*f;
    System.out.println("Ejecutandose el metodo: metodo1CH2() definido");
    return r;
  }
  public float metodo2CP(int e, float f){
    float r = e*f;
    System.out.println("Ejecutandose el metodo abstracto: metodo2CP");
    return r;
  }
}
