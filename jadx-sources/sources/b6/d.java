package b6;

import androidx.lifecycle.t;
import b0.r1;
import c1.j8;
import f1.i0;
import f1.s;
import v1.o;
import w3.c0;
import w3.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1593f;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f1588a = i11;
        this.f1590c = obj;
        this.f1591d = obj2;
        this.f1592e = obj3;
        this.f1593f = obj4;
        this.f1589b = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1588a) {
            case 0:
                ((Integer) obj2).getClass();
                cg.b.a((Boolean) this.f1590c, this.f1591d, (t) this.f1592e, (ej.c) this.f1593f, (i0) obj, s.O(this.f1589b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c1.j.d((ej.a) this.f1590c, (o) this.f1591d, (u) this.f1592e, (p1.e) this.f1593f, (i0) obj, s.O(this.f1589b | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                d1.i.a((c0) this.f1590c, (p1.e) this.f1591d, (j8) this.f1592e, (p1.e) this.f1593f, (i0) obj, s.O(this.f1589b | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                gb.a.a((r1) this.f1590c, (ej.a) this.f1591d, (o) this.f1592e, (p1.e) this.f1593f, (i0) obj, s.O(this.f1589b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iO = s.O(1);
                mb.a.j((String) this.f1590c, this.f1589b, (ej.c) this.f1593f, (ej.c) this.f1591d, (ej.a) this.f1592e, (i0) obj, iO);
                break;
            default:
                ((Integer) obj2).intValue();
                ((p1.e) this.f1590c).j(this.f1591d, this.f1592e, this.f1593f, (i0) obj, s.O(this.f1589b) | 1);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ d(String str, int i10, ej.c cVar, ej.c cVar2, ej.a aVar, int i11) {
        this.f1588a = 4;
        this.f1590c = str;
        this.f1589b = i10;
        this.f1593f = cVar;
        this.f1591d = cVar2;
        this.f1592e = aVar;
    }

    public /* synthetic */ d(c0 c0Var, p1.e eVar, j8 j8Var, p1.e eVar2, int i10) {
        this.f1588a = 2;
        this.f1590c = c0Var;
        this.f1591d = eVar;
        this.f1592e = j8Var;
        this.f1593f = eVar2;
        this.f1589b = i10;
    }
}
