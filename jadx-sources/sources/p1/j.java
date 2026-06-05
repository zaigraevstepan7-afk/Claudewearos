package p1;

import f1.i0;
import f1.r;
import f1.t1;
import fj.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f12647a = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public static final m f12648b = new m(0, new long[0], new Object[0]);

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(i0 i0Var, ej.e eVar) {
        fj.l.d(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        y.c(2, eVar);
        eVar.invoke(i0Var, 1);
    }

    public static final e d(int i10, pi.c cVar, i0 i0Var) {
        Object objQ = i0Var.Q();
        if (objQ == f1.m.f6385a) {
            objQ = new e(cVar, true, i10);
            i0Var.l0(objQ);
        }
        e eVar = (e) objQ;
        if (!fj.l.b(eVar.f12639c, cVar)) {
            boolean z2 = eVar.f12639c == null;
            eVar.f12639c = cVar;
            if (!z2 && eVar.f12638b) {
                t1 t1Var = eVar.f12640d;
                if (t1Var != null) {
                    r rVar = t1Var.f6453a;
                    if (rVar != null) {
                        rVar.s(t1Var, null);
                    }
                    eVar.f12640d = null;
                }
                ArrayList arrayList = eVar.f12641e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        t1 t1Var2 = (t1) arrayList.get(i11);
                        r rVar2 = t1Var2.f6453a;
                        if (rVar2 != null) {
                            rVar2.s(t1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return eVar;
    }

    public static final boolean e(t1 t1Var, t1 t1Var2) {
        if (t1Var == null) {
            return true;
        }
        if (t1Var instanceof t1) {
            return !t1Var.b() || t1Var.equals(t1Var2) || fj.l.b(t1Var.f6455c, t1Var2.f6455c);
        }
        return false;
    }
}
