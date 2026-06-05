package ak;

import java.io.Closeable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z implements Closeable {
    public final z A;
    public final z B;
    public final z C;
    public final long D;
    public final long E;
    public final wh.s F;

    /* renamed from: a, reason: collision with root package name */
    public final w f757a;

    /* renamed from: b, reason: collision with root package name */
    public final s f758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f759c;

    /* renamed from: d, reason: collision with root package name */
    public final String f760d;

    /* renamed from: e, reason: collision with root package name */
    public final k f761e;

    /* renamed from: f, reason: collision with root package name */
    public final l f762f;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f763z;

    public z(y yVar) {
        this.f757a = yVar.f745a;
        this.f758b = yVar.f746b;
        this.f759c = yVar.f747c;
        this.f760d = yVar.f748d;
        this.f761e = yVar.f749e;
        yh.c cVar = yVar.f750f;
        cVar.getClass();
        this.f762f = new l(cVar);
        this.f763z = yVar.f751g;
        this.A = yVar.f752h;
        this.B = yVar.f753i;
        this.C = yVar.j;
        this.D = yVar.f754k;
        this.E = yVar.f755l;
        this.F = yVar.f756m;
    }

    public final String b(String str) {
        String strC = this.f762f.c(str);
        if (strC != null) {
            return strC;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b0 b0Var = this.f763z;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public final y e() {
        y yVar = new y();
        yVar.f745a = this.f757a;
        yVar.f746b = this.f758b;
        yVar.f747c = this.f759c;
        yVar.f748d = this.f760d;
        yVar.f749e = this.f761e;
        yVar.f750f = this.f762f.e();
        yVar.f751g = this.f763z;
        yVar.f752h = this.A;
        yVar.f753i = this.B;
        yVar.j = this.C;
        yVar.f754k = this.D;
        yVar.f755l = this.E;
        yVar.f756m = this.F;
        return yVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f758b + ", code=" + this.f759c + ", message=" + this.f760d + ", url=" + this.f757a.f735a + '}';
    }
}
