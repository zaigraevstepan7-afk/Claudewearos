package kf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends i0 {
    public final /* synthetic */ Object A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f9556z;

    public /* synthetic */ c(Object obj, int i10) {
        this.f9556z = i10;
        this.A = obj;
    }

    @Override // kf.i0
    public final void b() {
        switch (this.f9556z) {
            case 0:
                e eVar = (e) ((d) this.A).f9558b;
                eVar.f9561b.b("unlinkToDeath", new Object[0]);
                eVar.f9572n.asBinder().unlinkToDeath(eVar.f9569k, 0);
                eVar.f9572n = null;
                eVar.f9566g = false;
                return;
            default:
                synchronized (((e) this.A).f9565f) {
                    try {
                        if (((e) this.A).f9570l.get() > 0 && ((e) this.A).f9570l.decrementAndGet() > 0) {
                            ((e) this.A).f9561b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.A;
                        if (eVar2.f9572n != null) {
                            eVar2.f9561b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.A;
                            eVar3.f9560a.unbindService(eVar3.f9571m);
                            e eVar4 = (e) this.A;
                            eVar4.f9566g = false;
                            eVar4.f9572n = null;
                            eVar4.f9571m = null;
                        }
                        ((e) this.A).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
