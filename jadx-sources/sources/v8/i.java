package v8;

import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements e {
    @Override // v8.e
    public final boolean a(s8.h hVar) {
        s8.c cVar = hVar.f14787a;
        boolean z2 = cVar instanceof s8.a;
        int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        if ((z2 ? ((s8.a) cVar).f14778a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        s8.c cVar2 = hVar.f14788b;
        if (cVar2 instanceof s8.a) {
            i10 = ((s8.a) cVar2).f14778a;
        }
        return i10 > 100;
    }

    @Override // v8.e
    public final boolean b() {
        boolean z2;
        synchronized (d.f17883a) {
            try {
                int i10 = d.f17885c;
                d.f17885c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > d.f17886d + 30000) {
                    d.f17885c = 0;
                    d.f17886d = SystemClock.uptimeMillis();
                    String[] list = d.f17884b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    d.f17887e = list.length < 800;
                }
                z2 = d.f17887e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z2;
    }
}
