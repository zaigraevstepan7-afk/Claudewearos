package ac;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ub.i f384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f386d;

    public /* synthetic */ g(n nVar, ub.i iVar, int i10, Runnable runnable) {
        this.f383a = nVar;
        this.f384b = iVar;
        this.f385c = i10;
        this.f386d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ub.i iVar = this.f384b;
        final int i10 = this.f385c;
        Runnable runnable = this.f386d;
        final n nVar = this.f383a;
        cc.c cVar = (cc.c) nVar.f411f;
        try {
            try {
                bc.d dVar = (bc.d) nVar.f408c;
                Objects.requireNonNull(dVar);
                ((bc.h) cVar).s(new h(dVar, 1));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) nVar.f406a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((bc.h) cVar).s(new cc.b() { // from class: ac.i
                        @Override // cc.b
                        public final Object c() {
                            ((d) nVar.f409d).M(iVar, i10 + 1, false);
                            return null;
                        }
                    });
                } else {
                    nVar.i(iVar, i10);
                }
                runnable.run();
            } catch (cc.a unused) {
                ((d) nVar.f409d).M(iVar, i10 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
