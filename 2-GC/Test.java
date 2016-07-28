class Garbage
{
   int index;
   static int count;
   Garbage() {
      count++;
      System.out.println("object "+count+" construct");
      setID(count);
   }
   void setID(int id) {
      index=id;
   }
   public void finalize() {
      System.out.println("object "+this.index+" is reclaimed \n");
   }
   public static void main(String[] args) {
      new Garbage();
      new Garbage();
      new Garbage();
      new Garbage();
      System.gc();
   }
}
