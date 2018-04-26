package a;

public final class e extends a {
   private e(b var1) {
      super(c.f, var1); // c.f는 Unknown
   }

   public e() {
      this(b.a()); // b.a()는 architecture를 반환. this(b.a())는 (OS, arch)로 추상화
   }

   public final String b() {
      return "Unknown";
   }

   public final String c() {
      return "Unknown";
   }
}
