package v0;

import qj.e1;
import x.d3;
import x.j2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 extends vi.i implements ej.e {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17463a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f17464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17465c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17468f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17469z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p pVar, String str, long j, g3.m0 m0Var, u0 u0Var, l3.n nVar, ti.c cVar) {
        super(2, cVar);
        this.f17466d = pVar;
        this.f17467e = str;
        this.f17465c = j;
        this.f17468f = m0Var;
        this.f17469z = u0Var;
        this.A = nVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17463a) {
            case 0:
                return new r0((p) this.f17466d, (String) this.f17467e, this.f17465c, (g3.m0) this.f17468f, (u0) this.f17469z, (l3.n) this.A, cVar);
            default:
                r0 r0Var = new r0((d3) this.f17467e, (x.i) this.f17468f, (x.d) this.f17469z, this.f17465c, (e1) this.A, cVar);
                r0Var.f17466d = obj;
                return r0Var;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17463a) {
            case 0:
                return ((r0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((r0) create((j2) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(d3 d3Var, x.i iVar, x.d dVar, long j, e1 e1Var, ti.c cVar) {
        super(2, cVar);
        this.f17467e = d3Var;
        this.f17468f = iVar;
        this.f17469z = dVar;
        this.f17465c = j;
        this.A = e1Var;
    }
}
