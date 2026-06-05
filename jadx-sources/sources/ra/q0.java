package ra;

import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14132a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f14134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f14132a = i10;
        this.f14134c = r0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14132a) {
            case 0:
                q0 q0Var = new q0(this.f14134c, cVar, 0);
                q0Var.f14133b = obj;
                return q0Var;
            default:
                q0 q0Var2 = new q0(this.f14134c, cVar, 1);
                q0Var2.f14133b = obj;
                return q0Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14132a) {
            case 0:
                q0 q0Var = (q0) create(list, cVar);
                pi.o oVar = pi.o.f13011a;
                q0Var.invokeSuspend(oVar);
                return oVar;
            default:
                q0 q0Var2 = (q0) create(list, cVar);
                pi.o oVar2 = pi.o.f13011a;
                q0Var2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14132a;
        pi.o oVar = pi.o.f13011a;
        r0 r0Var = this.f14134c;
        switch (i10) {
            case 0:
                List list = (List) this.f14133b;
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                Log.d("HomeViewModel", "Received " + list.size() + " dock displayables");
                r0Var.f14157o = list;
                if (r0Var.f14165w) {
                    r0Var.j(true);
                    break;
                }
                break;
            default:
                List list2 = (List) this.f14133b;
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                Log.d("HomeViewModel", "Received " + list2.size() + " grid displayables");
                r0Var.f14156n = list2;
                r0Var.f14165w = true;
                r0Var.B.clear();
                r0Var.f();
                r0Var.j(true);
                break;
        }
        return oVar;
    }
}
