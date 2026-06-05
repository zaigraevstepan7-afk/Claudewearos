package rg;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f14455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f14456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f14457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14458e;

    public /* synthetic */ p(z zVar, a0 a0Var, h hVar, Object obj, int i10) {
        this.f14454a = i10;
        this.f14457d = zVar;
        this.f14455b = a0Var;
        this.f14456c = hVar;
        this.f14458e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14454a) {
            case 0:
                a0 a0Var = this.f14455b;
                z zVar = this.f14457d;
                wg.h hVar = (wg.h) zVar.f14492c.get(a0Var);
                if (hVar == null) {
                    break;
                } else {
                    h hVarB = h.B(hVar.f19305a, this.f14456c);
                    b bVarY = b.y((HashMap) this.f14458e);
                    zVar.f14496g.e();
                    break;
                }
            default:
                zg.r rVar = (zg.r) this.f14458e;
                a0 a0Var2 = this.f14455b;
                z zVar2 = this.f14457d;
                wg.h hVar2 = (wg.h) zVar2.f14492c.get(a0Var2);
                if (hVar2 == null) {
                    break;
                } else {
                    h hVar3 = hVar2.f19305a;
                    h hVar4 = this.f14456c;
                    h hVarB2 = h.B(hVar3, hVar4);
                    if (!hVarB2.isEmpty()) {
                        wg.h.a(hVar4);
                    }
                    zVar2.f14496g.e();
                    break;
                }
        }
        return Collections.EMPTY_LIST;
    }
}
