package gb;

import android.content.Context;
import android.content.IntentFilter;
import b0.e2;
import f1.a1;
import f1.b0;
import ra.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ej.c {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7332a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f7333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f7334c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f7335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7337f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7338z;

    public /* synthetic */ q(Context context, lb.g gVar, ja.k kVar, ib.g gVar2, ej.a aVar, a1 a1Var, a1 a1Var2) {
        this.f7336e = context;
        this.f7337f = gVar;
        this.f7338z = kVar;
        this.A = gVar2;
        this.f7333b = aVar;
        this.f7334c = a1Var;
        this.f7335d = a1Var2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f7332a) {
            case 0:
                ej.c cVar = (ej.c) this.f7336e;
                kj.d dVar = (kj.d) this.f7338z;
                ej.c cVar2 = (ej.c) this.f7337f;
                a1 a1Var = (a1) this.A;
                fj.l.f((hb.h) obj, "$this$DampedDragAnimation");
                Boolean bool = Boolean.FALSE;
                this.f7334c.setValue(bool);
                if (cVar != null) {
                    cVar.invoke(bool);
                }
                a1 a1Var2 = this.f7335d;
                if (((Boolean) a1Var2.getValue()).booleanValue()) {
                    cVar2.invoke(Float.valueOf(((Number) cg.b.r(Float.valueOf(((Number) a1Var.getValue()).floatValue()), dVar)).floatValue()));
                    ej.a aVar = this.f7333b;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
                a1Var2.setValue(bool);
                return pi.o.f13011a;
            default:
                Context context = (Context) this.f7336e;
                lb.g gVar = (lb.g) this.f7337f;
                ja.k kVar = (ja.k) this.f7338z;
                ib.g gVar2 = (ib.g) this.A;
                fj.l.f((b0) obj, "$this$DisposableEffect");
                e0 e0Var = new e0(gVar, kVar, gVar2, this.f7333b, this.f7334c, this.f7335d);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(e0Var, intentFilter);
                return new e2(8, context, e0Var);
        }
    }

    public /* synthetic */ q(ej.c cVar, kj.d dVar, ej.c cVar2, ej.a aVar, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f7336e = cVar;
        this.f7338z = dVar;
        this.f7337f = cVar2;
        this.f7333b = aVar;
        this.f7334c = a1Var;
        this.f7335d = a1Var2;
        this.A = a1Var3;
    }
}
