package gb;

import f1.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f7321b;

    public /* synthetic */ n(int i10, g1 g1Var) {
        this.f7320a = i10;
        this.f7321b = g1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f7320a) {
            case 0:
                return Integer.valueOf(this.f7321b.g());
            default:
                g1 g1Var = this.f7321b;
                int iG = g1Var.g();
                int i10 = 1;
                if (iG != 0) {
                    if (iG != 1) {
                        i10 = 3;
                        if (iG != 2) {
                            i10 = iG != 3 ? 0 : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        }
                    } else {
                        i10 = 2;
                    }
                }
                g1Var.h(i10);
                return pi.o.f13011a;
        }
    }
}
