package kd;

import android.content.Context;
import com.google.android.gms.common.api.m;
import nd.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public static int f9523a = 1;

    public final synchronized int c() {
        int i10;
        try {
            i10 = f9523a;
            if (i10 == 1) {
                Context applicationContext = getApplicationContext();
                e eVar = e.f12278d;
                int iD = eVar.d(applicationContext, 12451000);
                if (iD == 0) {
                    i10 = 4;
                    f9523a = 4;
                } else if (eVar.b(applicationContext, null, iD) != null || yd.e.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f9523a = 2;
                } else {
                    i10 = 3;
                    f9523a = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
