package c1;

import android.view.ActionMode;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z3 implements f1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2943b;

    public /* synthetic */ z3(Object obj, int i10) {
        this.f2942a = i10;
        this.f2943b = obj;
    }

    @Override // f1.a0
    public final void a() {
        switch (this.f2942a) {
            case 0:
                c3 c3Var = (c3) this.f2943b;
                c3Var.dismiss();
                c3Var.B.e();
                return;
            case 1:
                g.f fVar = ((d.a) this.f2943b).f4315a;
                if (fVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                fVar.b0();
                return;
            case 2:
                qj.l lVar = ((j8) this.f2943b).f2302c;
                if (lVar != null) {
                    lVar.x(null);
                    return;
                }
                return;
            case 3:
                ((f0.z) this.f2943b).f6224d = null;
                return;
            case 4:
                f0.o0 o0Var = (f0.o0) this.f2943b;
                f0.a1 a1Var = o0Var.f6178c;
                if (a1Var != null) {
                    a1Var.f6104a = false;
                }
                o0Var.f6178c = null;
                return;
            case 5:
                ((f0.k0) this.f2943b).f6161f = true;
                return;
            case 6:
                ((jb.b) this.f2943b).disable();
                return;
            case 7:
                ((v0.u0) this.f2943b).o();
                return;
            case 8:
                ((ej.c) this.f2943b).invoke(Float.valueOf(0.0f));
                return;
            case 9:
                ((fc.i) this.f2943b).a();
                return;
            case 10:
                p0.h hVar = (p0.h) this.f2943b;
                t1.v vVar = hVar.f12610e;
                t1.f fVar2 = vVar.f15511h;
                if (fVar2 != null) {
                    fVar2.a();
                }
                vVar.a();
                ActionMode actionMode = hVar.f12613h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                hVar.f12613h = null;
                return;
            case 11:
                r0.b bVar = (r0.b) ((r0.c) this.f2943b).f13659c.getValue();
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            case 12:
                ((w2.i1) this.f2943b).f18300b.a();
                return;
            case 13:
                w3.v vVar2 = (w3.v) this.f2943b;
                vVar2.dismiss();
                vVar2.A.e();
                return;
            default:
                w3.x xVar = (w3.x) this.f2943b;
                xVar.e();
                xVar.getClass();
                androidx.lifecycle.r0.i(xVar, null);
                xVar.I.removeViewImmediate(xVar);
                return;
        }
    }
}
