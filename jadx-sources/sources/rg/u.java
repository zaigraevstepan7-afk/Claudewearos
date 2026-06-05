package rg;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f14477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f14479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f14480d;

    public u(z zVar, h hVar, b bVar, long j, b bVar2) {
        this.f14480d = zVar;
        this.f14477a = hVar;
        this.f14478b = j;
        this.f14479c = bVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z zVar = this.f14480d;
        h0 h0Var = zVar.f14491b;
        long j = this.f14478b;
        Long lValueOf = Long.valueOf(j);
        h0Var.getClass();
        ug.l.c(j > ((Long) h0Var.f14421c).longValue());
        ArrayList arrayList = (ArrayList) h0Var.f14420b;
        h hVar = this.f14477a;
        b bVar = this.f14479c;
        arrayList.add(new d0(j, hVar, bVar));
        h0Var.f14419a = ((b) h0Var.f14419a).e(hVar, bVar);
        h0Var.f14421c = lValueOf;
        return z.a(zVar, new sg.c(sg.d.f15033d, hVar, bVar));
    }
}
