package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9910a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9911b;

    public f(int i10, int i11) {
        this.f9910a = i10;
        this.f9911b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        m3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.o oVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < this.f9910a) {
                int i13 = i12 + 1;
                int i14 = oVar.f3876b;
                if (i14 <= i13) {
                    i12 = i14;
                    break;
                } else {
                    i12 = (Character.isHighSurrogate(oVar.b((i14 - i13) + (-1))) && Character.isLowSurrogate(oVar.b(oVar.f3876b - i13))) ? i12 + 2 : i13;
                    i11++;
                }
            } else {
                break;
            }
        }
        int iB = 0;
        while (true) {
            if (i10 >= this.f9911b) {
                break;
            }
            int i15 = iB + 1;
            int i16 = oVar.f3877c;
            hf.p pVar = (hf.p) oVar.f3880f;
            if (i16 + i15 >= pVar.b()) {
                iB = pVar.b() - oVar.f3877c;
                break;
            } else {
                iB = (Character.isHighSurrogate(oVar.b((oVar.f3877c + i15) + (-1))) && Character.isLowSurrogate(oVar.b(oVar.f3877c + i15))) ? iB + 2 : i15;
                i10++;
            }
        }
        int i17 = oVar.f3877c;
        oVar.a(i17, iB + i17);
        int i18 = oVar.f3876b;
        oVar.a(i18 - i12, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9910a == fVar.f9910a && this.f9911b == fVar.f9911b;
    }

    public final int hashCode() {
        return (this.f9910a * 31) + this.f9911b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f9910a);
        sb2.append(", lengthAfterCursor=");
        return m6.a.g(sb2, this.f9911b, ')');
    }
}
