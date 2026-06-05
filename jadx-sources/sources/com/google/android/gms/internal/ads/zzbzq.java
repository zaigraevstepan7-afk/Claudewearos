package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mc.n;
import nc.s;
import nc.t;
import qc.l0;
import qc.n0;
import qc.o0;
import rc.k;
import rc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzq {
    private final Object zza = new Object();
    private final o0 zzb;
    private final zzbzu zzc;
    private boolean zzd;
    private Context zze;
    private rc.a zzf;
    private String zzg;
    private zzbdh zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbzo zzl;
    private final Object zzm;
    private mf.a zzn;
    private final AtomicBoolean zzo;

    public zzbzq() {
        o0 o0Var = new o0();
        this.zzb = o0Var;
        this.zzc = new zzbzu(s.f12202f.f12205c, o0Var);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbzo(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public static /* synthetic */ ArrayList zzo(zzbzq zzbzqVar) {
        Context contextZza = zzbvy.zza(zzbzqVar.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoD = wd.b.a(contextZza).d(4096, contextZza.getApplicationInfo().packageName);
            if (packageInfoD.requestedPermissions != null && packageInfoD.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfoD.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoD.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final boolean zzA(Context context) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zziF)).booleanValue()) {
            return this.zzo.get();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.f14324d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlf)).booleanValue()) {
                return a.a.e0(this.zze).f20293a.getResources();
            }
            a.a.e0(this.zze).f20293a.getResources();
            return null;
        } catch (m e10) {
            int i10 = l0.f13401b;
            k.h("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final zzbdh zzg() {
        zzbdh zzbdhVar;
        synchronized (this.zza) {
            zzbdhVar = this.zzh;
        }
        return zzbdhVar;
    }

    public final zzbzu zzh() {
        return this.zzc;
    }

    public final n0 zzi() {
        o0 o0Var;
        synchronized (this.zza) {
            o0Var = this.zzb;
        }
        return o0Var;
    }

    public final mf.a zzk() {
        if (this.zze != null) {
            if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzde)).booleanValue()) {
                synchronized (this.zzm) {
                    try {
                        mf.a aVar = this.zzn;
                        if (aVar != null) {
                            return aVar;
                        }
                        mf.a aVarZzb = zzcad.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbzl
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzbzq.zzo(this.zza);
                            }
                        });
                        this.zzn = aVarZzb;
                        return aVarZzb;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return zzgdb.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzu(Context context, rc.a aVar) {
        zzbdh zzbdhVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = aVar;
                    n nVar = n.D;
                    nVar.f11581g.zzc(this.zzc);
                    this.zzb.p(this.zze);
                    zzbul.zzb(this.zze, this.zzf);
                    zzbdi zzbdiVar = nVar.f11586m;
                    zzbct zzbctVar = zzbdc.zzch;
                    t tVar = t.f12227d;
                    if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                        zzbdhVar = new zzbdh();
                    } else {
                        l0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbdhVar = null;
                    }
                    this.zzh = zzbdhVar;
                    if (zzbdhVar != null) {
                        zzcag.zza(new zzbzm(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (((Boolean) tVar.f12230c.zzb(zzbdc.zziF)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzn(this));
                        } catch (RuntimeException e10) {
                            int i10 = l0.f13401b;
                            k.h("Failed to register network callback", e10);
                            this.zzo.set(true);
                        }
                    }
                    this.zzd = true;
                    zzk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        n.D.f11577c.y(context, aVar.f14321a);
    }

    public final void zzv(Throwable th2, String str) {
        zzbul.zzb(this.zze, this.zzf).zzi(th2, str, ((Double) zzbfl.zzf.zze()).floatValue());
    }

    public final void zzw(Throwable th2, String str) {
        zzbul.zzb(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzx(Throwable th2, String str) {
        zzbul.zzd(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}
