package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9909b;

    public e(int i10, int i11) {
        this.f9908a = i10;
        this.f9909b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        m3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.o oVar) {
        int i10 = oVar.f3877c;
        hf.p pVar = (hf.p) oVar.f3880f;
        int i11 = this.f9909b;
        int iB = i10 + i11;
        if (((i10 ^ iB) & (i11 ^ iB)) < 0) {
            iB = pVar.b();
        }
        oVar.a(oVar.f3877c, Math.min(iB, pVar.b()));
        int i12 = oVar.f3876b;
        int i13 = this.f9908a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        oVar.a(Math.max(0, i14), oVar.f3876b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9908a == eVar.f9908a && this.f9909b == eVar.f9909b;
    }

    public final int hashCode() {
        return (this.f9908a * 31) + this.f9909b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f9908a);
        sb2.append(", lengthAfterCursor=");
        return m6.a.g(sb2, this.f9909b, ')');
    }
}
