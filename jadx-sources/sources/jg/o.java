package jg;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f8898a;

    /* renamed from: b, reason: collision with root package name */
    public final g f8899b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f8900c;

    public o(cg.i iVar) {
        iVar.b();
        Context context = iVar.f3367a;
        g gVar = new g();
        g.f8886f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        gVar.f8890d = new zzg(handlerThread.getLooper());
        iVar.b();
        gVar.f8891e = new a8.e(gVar, iVar.f3368b);
        gVar.f8889c = 300000L;
        this.f8900c = false;
        this.f8898a = 0;
        this.f8899b = gVar;
        com.google.android.gms.common.api.internal.c.b((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.f3510e.a(new f0(this, 1));
    }
}
