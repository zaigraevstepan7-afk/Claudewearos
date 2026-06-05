package ab;

import f1.i0;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.e {
    public final /* synthetic */ pi.c A;
    public final /* synthetic */ pi.c B;
    public final /* synthetic */ pi.c C;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f272c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f275f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f276z;

    public /* synthetic */ c(v1.o oVar, List list, mi.p pVar, boolean z2, Set set, ej.c cVar, ej.c cVar2, ej.c cVar3, ej.e eVar, int i10) {
        this.f273d = oVar;
        this.f274e = list;
        this.f275f = pVar;
        this.f271b = z2;
        this.f276z = set;
        this.f272c = cVar;
        this.A = cVar2;
        this.B = cVar3;
        this.C = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f270a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(12582913);
                v.b((xa.f) this.f273d, (ej.a) this.f274e, (ej.a) this.f275f, (ej.a) this.f276z, (ej.a) this.A, (ej.a) this.B, (ej.a) this.C, this.f272c, this.f271b, (i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(7);
                ta.u.c((v1.o) this.f273d, (List) this.f274e, (mi.p) this.f275f, this.f271b, (Set) this.f276z, this.f272c, (ej.c) this.A, (ej.c) this.B, (ej.e) this.C, (i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ c(xa.f fVar, ej.a aVar, ej.a aVar2, ej.a aVar3, ej.a aVar4, ej.a aVar5, ej.a aVar6, ej.c cVar, boolean z2, int i10) {
        this.f273d = fVar;
        this.f274e = aVar;
        this.f275f = aVar2;
        this.f276z = aVar3;
        this.A = aVar4;
        this.B = aVar5;
        this.C = aVar6;
        this.f272c = cVar;
        this.f271b = z2;
    }
}
