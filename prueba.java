class prueba{
  public static void main(String[] args) {
    //System.out.println("\n\n##################################");
    //System.out.println("Probando la clase padre");
    //System.out.println("##################################");
    //CPadre obj = new CPadre();
    //int r = obj.metodo1CP(40);
    //System.out.println("El metodo1CP(), regreso un: "+r);
    System.out.println("\n\n##################################");
    System.out.println("Probando la clase Hija 2");
    System.out.println("##################################");
    CHija2 obj = new CHija2();
    System.out.println("Imprimiendo los atributos heredados: enteroCP="+obj.enteroCP+" realCP="+obj.realCP);
    System.out.println("Imprimiendo los atributos de CHija2: realCH2="+obj.realCH2);
    System.out.println("Ejecutando metodo1CP() y que regresa: "+obj.metodo1CP(25) );
    System.out.println("Ejecutando metodo2CP() y que regresa: " +obj.metodo2CP(20,2.5f));
    System.out.println("Ejecutando metodo1CH2() y que regresa: " + obj.metodo1CH2(3.13f));
    
    System.out.println("\n\n##################################");
    System.out.println("Probando la clase ClaseA");
    System.out.println("##################################");
    ClaseA clasea = new ClaseA();
    System.out.println("Imprimiendo los atributos heredados de IPadre1: REAL_API=" + IPadre1.REAL_AP1 + " ENTERO_AP1:"+IPadre1.ENTERO_AP1);
    System.out.println("Imprimiendo los atributos de ClaseA: "+clasea.letraCA);
    System.out.println("Ejecutando metodo1IP1() y que regresa: "+ clasea.metodo1IP1('A', 'B'));
    System.out.println("Ejecutando metodo1IP1() y que regresa: " + clasea.metodo2IP1(2.81f));
    clasea.metodoCA();

    System.out.println("\n\n##################################");
    System.out.println("Probando la clase ClaseK");
    System.out.println("##################################");
    ClaseK ok = new ClaseK();
    System.out.println("Probando los metodos de clase K heredados");
    int result = ok.metodo1IP2('M', 10);
    System.out.println("Resultado del primer metodo: " + result);
    ok.metodo2IP2("NOTHING");

    System.out.println("\n\n##################################");
    System.out.println("Probando la clase ClaseR");
    System.out.println("##################################");
    ClaseR cr = new ClaseR();
    result = cr.metodo1IH1('M',100);
    System.out.println("Resultado de IHija1 desde cr: " + result);
    char rCh = cr.metodo1IP1('k','f');
    System.out.println("Resultado de IPadre1 desde cr: " + rCh);
    float rF = cr.metodo2IP1(103f);
    System.out.println("Resultado de IPadre1 con metodo metodo2IP2 desde cr: " + rF);

    System.out.println("\n\n##################################");
    System.out.println("Probando la clase ClaseB");
    System.out.println("##################################");
    ClaseB ob = new ClaseB();
    System.out.println("Imprimiendo los atributos de ClaseA: letraCA=" + ob.letraCA);
    System.out.println("Ejecutando metodo1IP1() y que regresa: "+ ob.metodo1IP1('a','b'));
    System.out.println("Ejecutando metodo2IP1() y que regresa: " + ob.metodo2IP1(2.28f));
    System.out.println("Ejecutando metodo1IP2() y que regresa: " + ob.metodo1IP2('e',21));
    ob.metodo2IP2("Texto default ");
    System.out.println("Ejecutando metodo1IH1() y que regresa: " + ob.metodo1IH1('f',29));
    ob.metodo2IP2("Texto default");
    System.out.println("Imprimiendo los atributos de clase B: enteroCB: " + ob.enteroCB);
    ob.metodoCB();
  }
}
