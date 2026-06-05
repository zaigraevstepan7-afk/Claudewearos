package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9936b;

    public s(int i10, int i11) {
        this.f9935a = i10;
        this.f9936b = i11;
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.o oVar) {
        int iP = cg.b.p(this.f9935a, 0, ((hf.p) oVar.f3880f).b());
        int iP2 = cg.b.p(this.f9936b, 0, ((hf.p) oVar.f3880f).b());
        if (iP < iP2) {
            oVar.f(iP, iP2);
        } else {
            oVar.f(iP2, iP);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f9935a == sVar.f9935a && this.f9936b == sVar.f9936b;
    }

    public final int hashCode() {
        return (this.f9935a * 31) + this.f9936b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f9935a);
        sb2.append(", end=");
        return m6.a.g(sb2, this.f9936b, ')');
    }
}
