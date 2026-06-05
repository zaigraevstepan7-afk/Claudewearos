package gb;

import f1.g1;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7317a;

    /* renamed from: b, reason: collision with root package name */
    public int f7318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f7319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g1 g1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f7317a = i10;
        this.f7319c = g1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7317a) {
            case 0:
                m mVar = new m(this.f7319c, cVar, 0);
                mVar.f7318b = ((Number) obj).intValue();
                return mVar;
            default:
                return new m(this.f7319c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7317a) {
            case 0:
                m mVar = (m) create(Integer.valueOf(((Number) obj).intValue()), (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                mVar.invokeSuspend(oVar);
                return oVar;
            default:
                return ((m) create((z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0031 -> B:16:0x0035). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f7317a
            pi.o r1 = pi.o.f13011a
            f1.g1 r2 = r7.f7319c
            switch(r0) {
                case 0: goto L42;
                default: goto L9;
            }
        L9:
            ui.a r0 = ui.a.f17085a
            int r3 = r7.f7318b
            r4 = 1
            if (r3 == 0) goto L1e
            if (r3 != r4) goto L16
            uk.c.R(r8)
            goto L35
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            uk.c.R(r8)
        L21:
            int r8 = com.anonlab.voidlauncher.feature.home.presentation.HomeActivity.N
            int r8 = r2.g()
            if (r8 <= 0) goto L41
            r7.f7318b = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = qj.b0.i(r5, r7)
            if (r8 != r0) goto L35
            r1 = r0
            goto L41
        L35:
            int r8 = com.anonlab.voidlauncher.feature.home.presentation.HomeActivity.N
            int r8 = r2.g()
            int r8 = r8 + (-1)
            r2.h(r8)
            goto L21
        L41:
            return r1
        L42:
            int r0 = r7.f7318b
            ui.a r3 = ui.a.f17085a
            uk.c.R(r8)
            r2.h(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
