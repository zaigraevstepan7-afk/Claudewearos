package x;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f19475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(long j, ti.c cVar) {
        super(2, cVar);
        this.f19475b = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        c2 c2Var = new c2(this.f19475b, cVar);
        c2Var.f19474a = obj;
        return c2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c2 c2Var = (c2) create((j2) obj, (ti.c) obj2);
        pi.o oVar = pi.o.f13011a;
        c2Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        l2 l2Var = ((j2) this.f19474a).f19583a;
        l2Var.c(l2Var.f19622k, this.f19475b, 1);
        return pi.o.f13011a;
    }
}
