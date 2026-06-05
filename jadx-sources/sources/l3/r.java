package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f9933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9934b;

    public r(String str, int i10) {
        this.f9933a = new g3.f(str);
        this.f9934b = i10;
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.o oVar) {
        int i10 = oVar.f3878d;
        g3.f fVar = this.f9933a;
        if (i10 != -1) {
            int i11 = oVar.f3879e;
            String str = fVar.f7081b;
            String str2 = fVar.f7081b;
            oVar.d(i10, i11, str);
            if (str2.length() > 0) {
                oVar.e(i10, str2.length() + i10);
            }
        } else {
            int i12 = oVar.f3876b;
            int i13 = oVar.f3877c;
            String str3 = fVar.f7081b;
            String str4 = fVar.f7081b;
            oVar.d(i12, i13, str3);
            if (str4.length() > 0) {
                oVar.e(i12, str4.length() + i12);
            }
        }
        int i14 = oVar.f3876b;
        int i15 = oVar.f3877c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f9934b;
        int iP = cg.b.p(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - fVar.f7081b.length(), 0, ((hf.p) oVar.f3880f).b());
        oVar.f(iP, iP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return fj.l.b(this.f9933a.f7081b, rVar.f9933a.f7081b) && this.f9934b == rVar.f9934b;
    }

    public final int hashCode() {
        return (this.f9933a.f7081b.hashCode() * 31) + this.f9934b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f9933a.f7081b);
        sb2.append("', newCursorPosition=");
        return m6.a.g(sb2, this.f9934b, ')');
    }
}
