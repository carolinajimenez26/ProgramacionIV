
package visitordemo;

public class VisitorDemo {
    public static Element[] list = { new Thiss(), new That(), new TheOther() };
    
    public static void main(String[] args) {
      UpVisitor up = new UpVisitor();
      DownVisitor down = new DownVisitor();
      for (int i=0; i < list.length; i++) {
         list[i].accept((Visitor) up);
      } 
      for (int i=0; i < list.length; i++) {
         list[i].accept( down );
      }
    }
    
}
