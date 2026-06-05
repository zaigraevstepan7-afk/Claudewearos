package rg;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14485a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f14486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f14487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14488d;

    public w(z zVar, h hVar, zg.r rVar) {
        this.f14487c = zVar;
        this.f14486b = hVar;
        this.f14488d = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14485a) {
            case 0:
                z zVar = this.f14487c;
                tg.a aVar = zVar.f14496g;
                h hVar = this.f14486b;
                wg.h.a(hVar);
                zg.r rVar = (zg.r) this.f14488d;
                aVar.e();
                return z.a(zVar, new sg.e(sg.d.f15034e, hVar, rVar));
            default:
                b bVarY = b.y((HashMap) this.f14488d);
                z zVar2 = this.f14487c;
                zVar2.f14496g.e();
                return z.a(zVar2, new sg.c(sg.d.f15034e, this.f14486b, bVarY));
        }
    }

    public w(z zVar, HashMap map, h hVar) {
        this.f14487c = zVar;
        this.f14488d = map;
        this.f14486b = hVar;
    }
}
