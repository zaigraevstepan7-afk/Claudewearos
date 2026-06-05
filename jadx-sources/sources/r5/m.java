package r5;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends uk.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uk.c f13744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f13745e;

    public m(uk.c cVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f13744d = cVar;
        this.f13745e = threadPoolExecutor;
    }

    @Override // uk.c
    public final void H(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f13745e;
        try {
            this.f13744d.H(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // uk.c
    public final void I(a8.j jVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f13745e;
        try {
            this.f13744d.I(jVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
