package wa;

import android.os.SystemClock;
import f0.v0;
import f1.a1;
import f1.f1;
import f1.g1;
import f1.h1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ej.a {
    public final /* synthetic */ qj.z A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f19241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f19242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f19243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f19244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f19245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.d f19246f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f19247z;

    public /* synthetic */ z(boolean z2, a1 a1Var, a1 a1Var2, h1 h1Var, a1 a1Var3, g0.d dVar, int i10, qj.z zVar) {
        this.f19241a = z2;
        this.f19242b = a1Var;
        this.f19243c = a1Var2;
        this.f19244d = h1Var;
        this.f19245e = a1Var3;
        this.f19246f = dVar;
        this.f19247z = i10;
        this.A = zVar;
    }

    @Override // ej.a
    public final Object a() {
        if (((q0) this.f19242b.getValue()) != null && !this.f19241a) {
            this.f19243c.setValue(Boolean.FALSE);
            this.f19244d.h(SystemClock.uptimeMillis() + 500);
            this.f19245e.setValue(null);
            g0.d dVar = this.f19246f;
            com.google.android.gms.common.api.internal.i0 i0Var = dVar.f6893d;
            f1 f1Var = (f1) i0Var.f3554d;
            g1 g1Var = (g1) i0Var.f3553c;
            float fG = f1Var.g();
            qj.b0.w(this.A, null, new v0(dVar, cg.b.p(fG > 0.18f ? g1Var.g() + 1 : fG < -0.18f ? g1Var.g() - 1 : g1Var.g(), 0, this.f19247z - 1), null, 4), 3);
        }
        return pi.o.f13011a;
    }
}
