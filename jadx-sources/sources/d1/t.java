package d1;

import android.content.Context;
import c1.j8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4572b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f4571a = i10;
        this.f4572b = obj;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4571a) {
            case 0:
                return new t((j8) this.f4572b, cVar, 0);
            case 1:
                return new t((Context) this.f4572b, cVar, 1);
            default:
                return new t((v0.p) this.f4572b, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f4571a) {
            case 0:
                t tVar = (t) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                tVar.invokeSuspend(oVar);
                break;
        }
        return ((t) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
