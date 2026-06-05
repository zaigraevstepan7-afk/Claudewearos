package ui;

import fj.l;
import fj.y;
import ti.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public int f17092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f17093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti.c f17094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ti.c cVar, h hVar, ej.e eVar, ti.c cVar2) {
        super(cVar, hVar);
        this.f17093b = eVar;
        this.f17094c = cVar2;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f17092a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f17092a = 2;
            uk.c.R(obj);
            return obj;
        }
        this.f17092a = 1;
        uk.c.R(obj);
        ej.e eVar = this.f17093b;
        l.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        y.c(2, eVar);
        return eVar.invoke(this.f17094c, this);
    }
}
