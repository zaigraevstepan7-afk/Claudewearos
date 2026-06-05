package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzfsv;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftt;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzfuh;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 implements com.google.android.gms.common.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3551a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3552b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3553c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3554d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3555e = new w8.v(this, true);

    /* renamed from: f, reason: collision with root package name */
    public Object f3556f = new w8.v(this, false);

    public i0(Context context, ac.h hVar, qh.c cVar) {
        this.f3552b = context;
        this.f3553c = hVar;
        this.f3554d = cVar;
    }

    @Override // com.google.android.gms.common.internal.d
    public void a(nd.b bVar) {
        ((h) this.f3556f).G.post(new a1(1, this, bVar));
    }

    public void b(nd.b bVar) {
        g0 g0Var = (g0) ((h) this.f3556f).C.get((a) this.f3553c);
        if (g0Var != null) {
            g0Var.o(bVar);
        }
    }

    public void c(String str, String str2) {
        qc.l0.k(str);
        if (((zzcfe) this.f3554d) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzcad.zzf.execute(new b8.b(this, "onError", map, 6, false));
        }
    }

    public void d(boolean z2) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f3551a = z2;
        ((w8.v) this.f3556f).a((Context) this.f3552b, intentFilter2);
        if (!this.f3551a) {
            ((w8.v) this.f3555e).a((Context) this.f3552b, intentFilter);
            return;
        }
        w8.v vVar = (w8.v) this.f3555e;
        Context context = (Context) this.f3552b;
        synchronized (vVar) {
            try {
                if (vVar.f18995a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(vVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != vVar.f18996b ? 4 : 2);
                } else {
                    context.registerReceiver(vVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                vVar.f18995a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(zzcfe zzcfeVar, zzftp zzftpVar) {
        if (zzcfeVar == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.f3554d = zzcfeVar;
        if (!this.f3551a && !f(zzcfeVar.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlK)).booleanValue()) {
            this.f3553c = zzftpVar.zzh();
        }
        if (((p7.k) this.f3556f) == null) {
            this.f3556f = new p7.k(this, 18);
        }
        zzfsv zzfsvVar = (zzfsv) this.f3555e;
        if (zzfsvVar != null) {
            zzfsvVar.zzd(zzftpVar, (p7.k) this.f3556f);
        }
    }

    public synchronized boolean f(Context context) {
        if (!zzfuh.zza(context)) {
            return false;
        }
        try {
            this.f3555e = zzfsw.zza(context);
        } catch (NullPointerException e10) {
            qc.l0.k("Error connecting LMD Overlay service");
            mc.n.D.f11582h.zzw(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (((zzfsv) this.f3555e) == null) {
            this.f3551a = false;
            return false;
        }
        if (((p7.k) this.f3556f) == null) {
            this.f3556f = new p7.k(this, 18);
        }
        this.f3551a = true;
        return true;
    }

    public zzftu g() {
        zzftt zzfttVarZzc = zzftu.zzc();
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlK)).booleanValue() || TextUtils.isEmpty((String) this.f3553c)) {
            String str = (String) this.f3552b;
            if (str != null) {
                zzfttVarZzc.zzb(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfttVarZzc.zza((String) this.f3553c);
        }
        return zzfttVarZzc.zzc();
    }
}
