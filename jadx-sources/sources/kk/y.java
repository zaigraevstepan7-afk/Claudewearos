package kk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9741a;

    /* renamed from: b, reason: collision with root package name */
    public int f9742b;

    /* renamed from: c, reason: collision with root package name */
    public int f9743c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9744d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9745e;

    /* renamed from: f, reason: collision with root package name */
    public y f9746f;

    /* renamed from: g, reason: collision with root package name */
    public y f9747g;

    public y() {
        this.f9741a = new byte[8192];
        this.f9745e = true;
        this.f9744d = false;
    }

    public final y a() {
        y yVar = this.f9746f;
        if (yVar == this) {
            yVar = null;
        }
        y yVar2 = this.f9747g;
        fj.l.c(yVar2);
        yVar2.f9746f = this.f9746f;
        y yVar3 = this.f9746f;
        fj.l.c(yVar3);
        yVar3.f9747g = this.f9747g;
        this.f9746f = null;
        this.f9747g = null;
        return yVar;
    }

    public final void b(y yVar) {
        fj.l.f(yVar, "segment");
        yVar.f9747g = this;
        yVar.f9746f = this.f9746f;
        y yVar2 = this.f9746f;
        fj.l.c(yVar2);
        yVar2.f9747g = yVar;
        this.f9746f = yVar;
    }

    public final y c() {
        this.f9744d = true;
        return new y(this.f9741a, this.f9742b, this.f9743c, true);
    }

    public final void d(y yVar, int i10) {
        fj.l.f(yVar, "sink");
        byte[] bArr = yVar.f9741a;
        if (!yVar.f9745e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = yVar.f9743c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (yVar.f9744d) {
                throw new IllegalArgumentException();
            }
            int i13 = yVar.f9742b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            qi.k.f0(bArr, 0, bArr, i13, i11);
            yVar.f9743c -= yVar.f9742b;
            yVar.f9742b = 0;
        }
        int i14 = yVar.f9743c;
        int i15 = this.f9742b;
        qi.k.f0(this.f9741a, i14, bArr, i15, i15 + i10);
        yVar.f9743c += i10;
        this.f9742b += i10;
    }

    public y(byte[] bArr, int i10, int i11, boolean z2) {
        fj.l.f(bArr, "data");
        this.f9741a = bArr;
        this.f9742b = i10;
        this.f9743c = i11;
        this.f9744d = z2;
        this.f9745e = false;
    }
}
