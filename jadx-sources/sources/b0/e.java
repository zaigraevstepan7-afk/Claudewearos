package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1303a;

    @Override // b0.i
    public final void b(int i10, t2.s0 s0Var, int[] iArr, int[] iArr2) {
        switch (this.f1303a) {
            case 0:
                j.c(i10, iArr, iArr2, false);
                break;
            default:
                j.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f1303a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
