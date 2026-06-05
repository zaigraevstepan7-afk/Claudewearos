package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements g, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1309b;

    public f(int i10) {
        this.f1308a = i10;
        switch (i10) {
            case 1:
                this.f1309b = 0;
                break;
            case 2:
                this.f1309b = 0;
                break;
            case 3:
                this.f1309b = 0;
                break;
            default:
                this.f1309b = 0;
                break;
        }
    }

    @Override // b0.g, b0.i
    public final float a() {
        switch (this.f1308a) {
        }
        return this.f1309b;
    }

    @Override // b0.i
    public final void b(int i10, t2.s0 s0Var, int[] iArr, int[] iArr2) {
        switch (this.f1308a) {
            case 0:
                j.a(i10, iArr, iArr2, false);
                break;
            case 1:
                j.d(i10, iArr, iArr2, false);
                break;
            case 2:
                j.e(i10, iArr, iArr2, false);
                break;
            default:
                j.f(i10, iArr, iArr2, false);
                break;
        }
    }

    @Override // b0.g
    public final void c(s3.c cVar, int i10, int[] iArr, s3.m mVar, int[] iArr2) {
        switch (this.f1308a) {
            case 0:
                if (mVar != s3.m.f14752a) {
                    j.a(i10, iArr, iArr2, true);
                    break;
                } else {
                    j.a(i10, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (mVar != s3.m.f14752a) {
                    j.d(i10, iArr, iArr2, true);
                    break;
                } else {
                    j.d(i10, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (mVar != s3.m.f14752a) {
                    j.e(i10, iArr, iArr2, true);
                    break;
                } else {
                    j.e(i10, iArr, iArr2, false);
                    break;
                }
            default:
                if (mVar != s3.m.f14752a) {
                    j.f(i10, iArr, iArr2, true);
                    break;
                } else {
                    j.f(i10, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f1308a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
