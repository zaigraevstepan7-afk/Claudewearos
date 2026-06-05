package a8;

import android.content.Context;
import android.net.ConnectivityManager;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final String f210i = m.l("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f211g;

    /* renamed from: h, reason: collision with root package name */
    public final g f212h;

    public h(Context context, f8.a aVar) {
        super(context, aVar);
        this.f211g = (ConnectivityManager) this.f205b.getSystemService("connectivity");
        this.f212h = new g(this);
    }

    @Override // a8.f
    public final Object a() {
        return f();
    }

    @Override // a8.f
    public final void d() {
        String str = f210i;
        try {
            m.g().c(str, "Registering network callback", new Throwable[0]);
            this.f211g.registerDefaultNetworkCallback(this.f212h);
        } catch (IllegalArgumentException | SecurityException e10) {
            m.g().f(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // a8.f
    public final void e() {
        String str = f210i;
        try {
            m.g().c(str, "Unregistering network callback", new Throwable[0]);
            this.f211g.unregisterNetworkCallback(this.f212h);
        } catch (IllegalArgumentException | SecurityException e10) {
            m.g().f(str, "Received exception while unregistering network callback", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y7.a f() {
        /*
            r9 = this;
            android.net.ConnectivityManager r0 = r9.f211g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r5 = r3
            goto L3b
        L27:
            r5 = move-exception
            goto L2b
        L29:
            r5 = r2
            goto L3b
        L2b:
            t7.m r6 = t7.m.g()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            java.lang.String r5 = a8.h.f210i
            java.lang.String r8 = "Unable to validate active network"
            r6.f(r5, r8, r7)
            goto L29
        L3b:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L48
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L48
            r2 = r3
        L48:
            y7.a r1 = new y7.a
            r1.<init>()
            r1.f20228a = r4
            r1.f20229b = r5
            r1.f20230c = r0
            r1.f20231d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.f():y7.a");
    }
}
