package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9932b;

    public q(int i10, int i11) {
        this.f9931a = i10;
        this.f9932b = i11;
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.o oVar) {
        boolean z2 = oVar.f3878d != -1;
        hf.p pVar = (hf.p) oVar.f3880f;
        if (z2) {
            oVar.f3878d = -1;
            oVar.f3879e = -1;
        }
        int iP = cg.b.p(this.f9931a, 0, pVar.b());
        int iP2 = cg.b.p(this.f9932b, 0, pVar.b());
        if (iP != iP2) {
            if (iP < iP2) {
                oVar.e(iP, iP2);
            } else {
                oVar.e(iP2, iP);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9931a == qVar.f9931a && this.f9932b == qVar.f9932b;
    }

    public final int hashCode() {
        return (this.f9931a * 31) + this.f9932b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f9931a);
        sb2.append(", end=");
        return m6.a.g(sb2, this.f9932b, ')');
    }
}
