package k0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f9060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f9061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3.t f9062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3.n f9063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s3.c f9064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9065f;

    public c0(t0 t0Var, ej.c cVar, l3.t tVar, l3.n nVar, s3.c cVar2, int i10) {
        this.f9060a = t0Var;
        this.f9061b = cVar;
        this.f9062c = tVar;
        this.f9063d = nVar;
        this.f9064e = cVar2;
        this.f9065f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    @Override // t2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t2.r0 a(t2.s0 r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c0.a(t2.s0, java.util.List, long):t2.r0");
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        t0 t0Var = this.f9060a;
        t0Var.f9264a.a(rVar.getLayoutDirection());
        ak.v vVar = t0Var.f9264a.j;
        if (vVar != null) {
            return s.m(vVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
