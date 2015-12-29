
package visitordemo;

interface Visitor {//Debe tener implementado todas las clases que "visita"
   public void visit( Thiss e ); 
   public void visit( That e );
   public void visit( TheOther e );
}
