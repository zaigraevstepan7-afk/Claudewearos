package i0;

import android.view.autofill.AutofillValue;
import d1.c0;
import d3.v;
import d3.y;
import d3.z;
import v.x;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends x {

    /* renamed from: h0, reason: collision with root package name */
    public boolean f8090h0;

    /* renamed from: i0, reason: collision with root package name */
    public ej.c f8091i0;

    /* renamed from: j0, reason: collision with root package name */
    public final a7.e f8092j0;

    public h(boolean z2, k kVar, boolean z10, d3.j jVar, ej.c cVar) {
        super(kVar, null, false, z10, null, jVar, new g(cVar, z2, 0));
        this.f8090h0 = z2;
        this.f8091i0 = cVar;
        this.f8092j0 = new a7.e(this, 13);
    }

    @Override // v.g
    public final void t1(z zVar) {
        d3.x.f(zVar, this.f8090h0 ? f3.a.f6618a : f3.a.f6619b);
        y yVar = v.f4793s;
        lj.d[] dVarArr = d3.x.f4803a;
        lj.d dVar = dVarArr[9];
        zVar.b(yVar, w1.k.f18181b);
        w1.f fVar = new w1.f(AutofillValue.forToggle(this.f8090h0));
        y yVar2 = v.f4794t;
        lj.d dVar2 = dVarArr[10];
        zVar.b(yVar2, fVar);
        d3.x.b(zVar, new c0(zVar, 1));
    }
}
