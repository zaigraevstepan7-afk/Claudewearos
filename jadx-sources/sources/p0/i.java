package p0;

import f1.i0;
import f1.s;
import ta.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o f12616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f12617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12618d;

    public /* synthetic */ i(v1.o oVar, int i10, p1.e eVar, int i11) {
        this.f12615a = 5;
        this.f12616b = oVar;
        this.f12618d = i10;
        this.f12617c = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f12615a;
        i0 i0Var = (i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                j.c(this.f12616b, this.f12617c, i0Var, s.O(this.f12618d | 1));
                break;
            case 1:
                j.d(this.f12616b, this.f12617c, i0Var, s.O(this.f12618d | 1));
                break;
            case 2:
                l.d(this.f12616b, this.f12617c, i0Var, s.O(this.f12618d | 1));
                break;
            case 3:
                j.b(this.f12616b, this.f12617c, i0Var, s.O(this.f12618d | 1));
                break;
            case 4:
                j.a(this.f12616b, this.f12617c, i0Var, s.O(this.f12618d | 1));
                break;
            default:
                u.b(this.f12616b, this.f12618d, this.f12617c, i0Var, s.O(385));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ i(v1.o oVar, p1.e eVar, int i10, int i11) {
        this.f12615a = i11;
        this.f12616b = oVar;
        this.f12617c = eVar;
        this.f12618d = i10;
    }
}
