package t0;

import android.view.autofill.AutofillValue;
import f1.j1;
import g3.e0;
import g3.m0;
import java.util.List;
import k0.s1;
import k0.t0;
import l3.t;
import l3.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15353b;

    public /* synthetic */ d(e eVar, int i10) {
        this.f15352a = i10;
        this.f15353b = eVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f15352a;
        boolean z2 = false;
        e eVar = this.f15353b;
        switch (i10) {
            case 0:
                j1 j1Var = eVar.L.f9282t;
                Boolean bool = Boolean.TRUE;
                j1Var.setValue(bool);
                eVar.L.f9281s.setValue(bool);
                t0 t0Var = eVar.L;
                AutofillValue autofillValue = ((w1.f) obj).f18177a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                fj.l.d(textValue, "null cannot be cast to non-null type kotlin.String");
                e.t1(t0Var, (String) textValue, eVar.M);
                return bool;
            case 1:
                List list = (List) obj;
                if (eVar.L.d() != null) {
                    s1 s1VarD = eVar.L.d();
                    fj.l.c(s1VarD);
                    list.add(s1VarD.f9254a);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                e.t1(eVar.L, ((g3.f) obj).f7081b, eVar.M);
                return Boolean.TRUE;
            default:
                g3.f fVar = (g3.f) obj;
                if (eVar.M) {
                    z zVar = eVar.L.f9268e;
                    if (zVar != null) {
                        List listC0 = qi.k.c0(new l3.g[]{new l3.h(), new l3.a(fVar, 1)});
                        t0 t0Var2 = eVar.L;
                        j jVar = t0Var2.f9267d;
                        k0.z zVar2 = t0Var2.f9284v;
                        t tVarI = jVar.i(listC0);
                        zVar.a(null, tVarI);
                        zVar2.invoke(tVarI);
                    } else {
                        t tVar = eVar.K;
                        String str = tVar.f9937a.f7081b;
                        long j = tVar.f9938b;
                        int i11 = m0.f7144c;
                        String string = nj.e.S0(str, (int) (j >> 32), (int) (j & 4294967295L), fVar).toString();
                        int length = fVar.f7081b.length() + ((int) (eVar.K.f9938b >> 32));
                        eVar.L.f9284v.invoke(new t(string, e0.b(length, length), 4));
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ d(e eVar, d3.z zVar) {
        this.f15352a = 3;
        this.f15353b = eVar;
    }
}
