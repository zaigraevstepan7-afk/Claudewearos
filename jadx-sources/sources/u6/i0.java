package u6;

import android.database.SQLException;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16716a;

    /* renamed from: b, reason: collision with root package name */
    public int f16717b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f16719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(n0 n0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f16716a = i10;
        this.f16719d = n0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f16716a) {
            case 0:
                i0 i0Var = new i0(this.f16719d, cVar, 0);
                i0Var.f16718c = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0(this.f16719d, cVar, 1);
                i0Var2.f16718c = obj;
                return i0Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16716a) {
            case 0:
                return ((i0) create((w6.i) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((i0) create((f0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
        int i10 = this.f16716a;
        n0 n0Var = this.f16719d;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i11 = this.f16717b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return obj;
                }
                uk.c.R(obj);
                w6.i iVar = (w6.i) this.f16718c;
                this.f16717b = 1;
                Object objA = n0.a(n0Var, iVar, this);
                return objA == aVar ? aVar : objA;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i12 = this.f16717b;
                try {
                    if (i12 == 0) {
                        uk.c.R(obj);
                        f0Var = (f0) this.f16718c;
                        this.f16718c = f0Var;
                        this.f16717b = 1;
                        obj = f0Var.a(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            uk.c.R(obj);
                            return (Set) obj;
                        }
                        f0Var = (f0) this.f16718c;
                        uk.c.R(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        e0 e0Var = e0.f16694a;
                        i0 i0Var = new i0(n0Var, null, 0);
                        this.f16718c = null;
                        this.f16717b = 2;
                        obj = f0Var.c(i0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return qi.u.f13522a;
        }
    }
}
