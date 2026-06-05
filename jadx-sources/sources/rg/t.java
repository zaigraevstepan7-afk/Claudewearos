package rg;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f14473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg.r f14475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f14476e;

    public t(z zVar, boolean z2, h hVar, zg.r rVar, long j, zg.r rVar2) {
        this.f14476e = zVar;
        this.f14472a = z2;
        this.f14473b = hVar;
        this.f14474c = j;
        this.f14475d = rVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z2 = this.f14472a;
        z zVar = this.f14476e;
        if (z2) {
            zVar.f14496g.e();
        }
        h0 h0Var = zVar.f14491b;
        long j = this.f14474c;
        Long lValueOf = Long.valueOf(j);
        h0Var.getClass();
        ug.l.c(j > ((Long) h0Var.f14421c).longValue());
        ArrayList arrayList = (ArrayList) h0Var.f14420b;
        h hVar = this.f14473b;
        zg.r rVar = this.f14475d;
        arrayList.add(new d0(j, hVar, rVar));
        h0Var.f14419a = ((b) h0Var.f14419a).b(hVar, rVar);
        h0Var.f14421c = lValueOf;
        return z.a(zVar, new sg.e(sg.d.f15033d, hVar, rVar));
    }
}
