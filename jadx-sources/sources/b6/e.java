package b6;

import androidx.lifecycle.t;
import c1.j8;
import f0.b0;
import f0.x0;
import f1.a1;
import f1.i0;
import f1.q1;
import f1.s;
import k0.u1;
import p0.l;
import v0.m;
import v1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1598e;

    public /* synthetic */ e(int i10, int i11, ej.c cVar, ej.c cVar2, o oVar) {
        this.f1594a = 9;
        this.f1595b = i10;
        this.f1598e = cVar;
        this.f1596c = cVar2;
        this.f1597d = oVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1594a) {
            case 0:
                ((Integer) obj2).intValue();
                cg.b.b((t) this.f1596c, (i) this.f1597d, (ej.c) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d1.i.d((j8) this.f1596c, (a1) this.f1597d, (p1.e) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iO = s.O(1);
                f0.o.d((b0) this.f1596c, this.f1597d, this.f1595b, this.f1598e, (i0) obj, iO);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iO2 = s.O(this.f1595b | 1);
                ((x0) this.f1596c).a(this.f1597d, (p1.e) this.f1598e, (i0) obj, iO2);
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((u1) this.f1596c).b((Object[]) this.f1597d, (ej.c) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                l.c((n0.g) this.f1596c, (r0.e) this.f1597d, (ej.a) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int iO3 = s.O(this.f1595b) | 1;
                ((p1.e) this.f1596c).i(this.f1597d, this.f1598e, (i0) obj, iO3);
                break;
            case 7:
                ((Integer) obj2).getClass();
                hj.a.f((o) this.f1596c, (q1) this.f1597d, (p1.e) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iO4 = s.O(this.f1595b | 1);
                ((s1.c) this.f1596c).a(this.f1597d, (p1.e) this.f1598e, (i0) obj, iO4);
                break;
            case 9:
                ej.c cVar = (ej.c) this.f1598e;
                ej.c cVar2 = (ej.c) this.f1596c;
                o oVar = (o) this.f1597d;
                ((Integer) obj2).getClass();
                int iO5 = s.O(433);
                wd.a.g(this.f1595b, iO5, cVar, cVar2, (i0) obj, oVar);
                break;
            case 10:
                ((Integer) obj2).getClass();
                u3.c.c((m) this.f1596c, (v1.c) this.f1597d, (p1.e) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                w.f.b((o) this.f1596c, (w.c) this.f1597d, (ej.c) this.f1598e, (i0) obj, s.O(1), this.f1595b);
                break;
            default:
                ((Integer) obj2).getClass();
                w.f.a((w.c) this.f1596c, (o) this.f1597d, (p1.e) this.f1598e, (i0) obj, s.O(this.f1595b | 1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ e(j8 j8Var, a1 a1Var, p1.e eVar, int i10) {
        this.f1594a = 1;
        this.f1596c = j8Var;
        this.f1597d = a1Var;
        this.f1598e = eVar;
        this.f1595b = i10;
    }

    public /* synthetic */ e(b0 b0Var, Object obj, int i10, Object obj2, int i11) {
        this.f1594a = 2;
        this.f1596c = b0Var;
        this.f1597d = obj;
        this.f1595b = i10;
        this.f1598e = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f1594a = i11;
        this.f1596c = obj;
        this.f1597d = obj2;
        this.f1598e = obj3;
        this.f1595b = i10;
    }

    public /* synthetic */ e(o oVar, w.c cVar, ej.c cVar2, int i10, int i11) {
        this.f1594a = 11;
        this.f1596c = oVar;
        this.f1597d = cVar;
        this.f1598e = cVar2;
        this.f1595b = i11;
    }
}
