package gb;

import d3.z;
import k0.j0;
import v0.d0;
import v0.e0;
import v0.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7298d;

    public /* synthetic */ i(Object obj, boolean z2, boolean z10, int i10) {
        this.f7295a = i10;
        this.f7298d = obj;
        this.f7296b = z2;
        this.f7297c = z10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f7295a) {
            case 0:
                hb.h hVar = (hb.h) this.f7298d;
                fi.e eVar = (fi.e) obj;
                fj.l.f(eVar, "$this$drawBackdrop");
                float fA = hVar.a();
                hi.a.a(eVar);
                if (this.f7296b) {
                    yd.f.l(eVar, eVar.f6754a * 8.0f);
                }
                if (this.f7297c) {
                    float f10 = eVar.f6754a;
                    a.a.J(eVar, f10 * 24.0f * fA, f10 * 24.0f * fA, false, (12 & 8) == 0);
                }
                break;
            default:
                z zVar = (z) obj;
                long jA = ((v0.m) this.f7298d).a();
                zVar.b(f0.f17389c, new e0(this.f7296b ? j0.f9134b : j0.f9135c, jA, this.f7297c ? d0.f17371a : d0.f17373c, (9223372034707292159L & jA) != 9205357640488583168L));
                break;
        }
        return pi.o.f13011a;
    }
}
