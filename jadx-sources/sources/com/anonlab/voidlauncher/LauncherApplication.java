package com.anonlab.voidlauncher;

import android.app.Application;
import android.os.RemoteException;
import c1.z2;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbpk;
import fc.y;
import nc.t;
import nc.u2;
import nc.v2;
import q0.i;
import qj.b0;
import qj.m0;
import rc.c;
import rc.k;
import rk.a;
import xj.d;
import xj.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class LauncherApplication extends Application {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3404a = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        final v2 v2VarC = v2.c();
        synchronized (v2VarC.f12249a) {
            try {
                if (!v2VarC.f12251c) {
                    if (!v2VarC.f12252d) {
                        final int i10 = 1;
                        v2VarC.f12251c = true;
                        synchronized (v2VarC.f12253e) {
                            try {
                                v2VarC.b(this);
                                v2VarC.f12254f.zzs(new u2(v2VarC));
                                v2VarC.f12254f.zzo(new zzbpk());
                                v2VarC.f12255g.getClass();
                                v2VarC.f12255g.getClass();
                            } catch (RemoteException e10) {
                                k.h("MobileAdsSettingManager initialization failed", e10);
                            }
                            zzbdc.zza(this);
                            if (((Boolean) zzbfa.zza.zze()).booleanValue()) {
                                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlt)).booleanValue()) {
                                    k.b("Initializing on bg thread");
                                    final int i11 = 0;
                                    c.f14329a.execute(new Runnable() { // from class: nc.t2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    v2 v2Var = v2VarC;
                                                    synchronized (v2Var.f12253e) {
                                                        v2Var.a();
                                                    }
                                                    return;
                                                default:
                                                    v2 v2Var2 = v2VarC;
                                                    synchronized (v2Var2.f12253e) {
                                                        v2Var2.a();
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                                y.a(this);
                                getApplicationContext();
                                y.a(this);
                                getApplicationContext();
                                y.a(this);
                                getApplicationContext();
                            }
                            if (((Boolean) zzbfa.zzb.zze()).booleanValue()) {
                                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlt)).booleanValue()) {
                                    c.f14330b.execute(new Runnable() { // from class: nc.t2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    v2 v2Var = v2VarC;
                                                    synchronized (v2Var.f12253e) {
                                                        v2Var.a();
                                                    }
                                                    return;
                                                default:
                                                    v2 v2Var2 = v2VarC;
                                                    synchronized (v2Var2.f12253e) {
                                                        v2Var2.a();
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                                y.a(this);
                                getApplicationContext();
                                y.a(this);
                                getApplicationContext();
                                y.a(this);
                                getApplicationContext();
                            }
                            k.b("Initializing on calling thread");
                            v2VarC.a();
                            y.a(this);
                            getApplicationContext();
                            y.a(this);
                            getApplicationContext();
                            y.a(this);
                            getApplicationContext();
                        }
                    }
                }
            } finally {
            }
        }
        i iVar = new i(this, 16);
        synchronized (a.f14557a) {
            qk.a aVar = new qk.a();
            if (a.f14558b != null) {
                throw new a5.a("A Koin Application has already been started");
            }
            a.f14558b = aVar.f13646a;
            iVar.invoke(aVar);
            aVar.f13646a.l();
        }
        e eVar = m0.f13601a;
        b0.w(b0.b(d.f20094c), null, new z2(this, null, 20), 3);
    }
}
