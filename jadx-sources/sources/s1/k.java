package s1;

import f1.i0;
import f1.m;
import f1.s;
import fj.l;
import fj.y;
import java.util.Arrays;
import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final qh.c f14734a = new qh.c(4, new ra.a(11, 0), new p0(2));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final qh.c b(ej.e eVar, ej.c cVar) {
        ra.i iVar = new ra.i(3, eVar);
        y.c(1, cVar);
        return new qh.c(4, iVar, cVar);
    }

    public static final Object c(Object[] objArr, ej.a aVar, i0 i0Var) {
        return d(Arrays.copyOf(objArr, objArr.length), f14734a, aVar, i0Var, 3456);
    }

    public static final Object d(Object[] objArr, j jVar, ej.a aVar, i0 i0Var, int i10) {
        Object[] objArr2;
        j jVar2;
        Object obj;
        Object objD;
        long j = i0Var.T;
        x8.a.n(36);
        String string = Long.toString(j, 36);
        l.e(string, "toString(...)");
        l.d(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        e eVar = (e) i0Var.j(h.f14730a);
        Object objQ = i0Var.Q();
        Object obj2 = m.f6385a;
        if (objQ == obj2) {
            Object objC = (eVar == null || (objD = eVar.d(string)) == null) ? null : jVar.c(objD);
            if (objC == null) {
                objC = aVar.a();
            }
            objArr2 = objArr;
            jVar2 = jVar;
            Object aVar2 = new a(jVar2, eVar, string, objC, objArr2);
            i0Var.l0(aVar2);
            objQ = aVar2;
        } else {
            objArr2 = objArr;
            jVar2 = jVar;
        }
        a aVar3 = (a) objQ;
        Object objA = Arrays.equals(objArr2, aVar3.f14718e) ? aVar3.f14717d : null;
        if (objA == null) {
            objA = aVar.a();
        }
        boolean zH = i0Var.h(aVar3) | ((((i10 & 112) ^ 48) > 32 && i0Var.h(jVar2)) || (i10 & 48) == 32) | i0Var.h(eVar) | i0Var.f(string) | i0Var.h(objA) | i0Var.h(objArr2);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objA;
            Object kVar = new lb.k(aVar3, jVar2, eVar, string, obj, objArr3, 1);
            i0Var.l0(kVar);
            objQ2 = kVar;
        } else {
            obj = objA;
        }
        s.j((ej.a) objQ2, i0Var);
        return obj;
    }

    public static final Object e(Object[] objArr, j jVar, ej.a aVar, i0 i0Var, int i10) {
        return d(Arrays.copyOf(objArr, objArr.length), jVar, aVar, i0Var, ((i10 << 3) & 7168) | 384);
    }
}
