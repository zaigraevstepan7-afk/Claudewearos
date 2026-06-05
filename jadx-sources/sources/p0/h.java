package p0;

import android.view.ActionMode;
import android.view.View;
import d1.m0;
import qj.b0;
import t1.v;
import v.f1;
import v.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements r0.f {

    /* renamed from: a, reason: collision with root package name */
    public final View f12606a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f12607b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.a f12608c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f12609d = new j1();

    /* renamed from: e, reason: collision with root package name */
    public final v f12610e = new v(new a(this, 0));

    /* renamed from: f, reason: collision with root package name */
    public final a f12611f = new a(this, 1);

    /* renamed from: g, reason: collision with root package name */
    public final a f12612g = new a(this, 2);

    /* renamed from: h, reason: collision with root package name */
    public ActionMode f12613h;

    /* renamed from: i, reason: collision with root package name */
    public g f12614i;
    public Runnable j;

    public h(View view, ej.c cVar, ej.a aVar) {
        this.f12606a = view;
        this.f12607b = cVar;
        this.f12608c = aVar;
    }

    @Override // r0.f
    public final Object a(r0.e eVar, vi.i iVar) {
        d1.l lVar = new d1.l(this, eVar, null, 3);
        f1 f1Var = f1.f17189a;
        j1 j1Var = this.f12609d;
        j1Var.getClass();
        Object objH = b0.h(new m0(f1Var, j1Var, lVar, (ti.c) null), iVar);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }
}
