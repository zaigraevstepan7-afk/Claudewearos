package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f9879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9880b;

    public a(g3.f fVar, int i10) {
        this.f9879a = fVar;
        this.f9880b = i10;
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.o oVar) {
        int i10 = oVar.f3878d;
        g3.f fVar = this.f9879a;
        if (i10 != -1) {
            oVar.d(i10, oVar.f3879e, fVar.f7081b);
        } else {
            oVar.d(oVar.f3876b, oVar.f3877c, fVar.f7081b);
        }
        int i11 = oVar.f3876b;
        int i12 = oVar.f3877c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f9880b;
        int iP = cg.b.p(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - fVar.f7081b.length(), 0, ((hf.p) oVar.f3880f).b());
        oVar.f(iP, iP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return fj.l.b(this.f9879a.f7081b, aVar.f9879a.f7081b) && this.f9880b == aVar.f9880b;
    }

    public final int hashCode() {
        return (this.f9879a.f7081b.hashCode() * 31) + this.f9880b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f9879a.f7081b);
        sb2.append("', newCursorPosition=");
        return m6.a.g(sb2, this.f9880b, ')');
    }

    public a(String str, int i10) {
        this(new g3.f(str), i10);
    }
}
