package r0;

import d1.l;
import d1.m0;
import f1.i0;
import f1.s;
import f1.t1;
import pi.o;
import qj.b0;
import v.f1;
import v.j1;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final p1.e f13657a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f13658b = new j1();

    /* renamed from: c, reason: collision with root package name */
    public final f1.j1 f13659c = s.A(null);

    public c(p1.e eVar) {
        this.f13657a = eVar;
    }

    @Override // r0.f
    public final Object a(e eVar, i iVar) {
        l lVar = new l(this, new b(eVar), null, 4);
        f1 f1Var = f1.f17189a;
        j1 j1Var = this.f13658b;
        j1Var.getClass();
        Object objH = b0.h(new m0(f1Var, j1Var, lVar, (ti.c) null), iVar);
        return objH == ui.a.f17085a ? objH : o.f13011a;
    }

    public final void b(final ej.a aVar, i0 i0Var, final int i10) {
        final ej.a aVar2;
        i0 i0Var2;
        i0Var.c0(723898654);
        int i11 = (i0Var.f(this) ? 32 : 16) | i10;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            b bVar = (b) this.f13659c.getValue();
            if (bVar == null) {
                t1 t1VarU = i0Var.u();
                if (t1VarU != null) {
                    final int i12 = 0;
                    t1VarU.f6456d = new ej.e(this, aVar, i10, i12) { // from class: r0.a

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f13652a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f13653b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ ej.a f13654c;

                        {
                            this.f13652a = i12;
                            this.f13653b = this;
                        }

                        @Override // ej.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = this.f13652a;
                            i0 i0Var3 = (i0) obj;
                            ((Integer) obj2).getClass();
                            switch (i13) {
                                case 0:
                                    this.f13653b.b(this.f13654c, i0Var3, s.O(7));
                                    break;
                                default:
                                    this.f13653b.b(this.f13654c, i0Var3, s.O(7));
                                    break;
                            }
                            return o.f13011a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            i0Var2 = i0Var;
            this.f13657a.g(bVar, bVar.f13655a, aVar2, i0Var2, 384);
        } else {
            aVar2 = aVar;
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU2 = i0Var2.u();
        if (t1VarU2 != null) {
            final int i13 = 1;
            t1VarU2.f6456d = new ej.e(this, aVar2, i10, i13) { // from class: r0.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f13652a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f13653b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.a f13654c;

                {
                    this.f13652a = i13;
                    this.f13653b = this;
                }

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    int i132 = this.f13652a;
                    i0 i0Var3 = (i0) obj;
                    ((Integer) obj2).getClass();
                    switch (i132) {
                        case 0:
                            this.f13653b.b(this.f13654c, i0Var3, s.O(7));
                            break;
                        default:
                            this.f13653b.b(this.f13654c, i0Var3, s.O(7));
                            break;
                    }
                    return o.f13011a;
                }
            };
        }
    }
}
