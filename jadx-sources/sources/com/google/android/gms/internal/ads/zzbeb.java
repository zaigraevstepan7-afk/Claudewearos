package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.t;
import p.g;
import p.l;
import p.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbeb extends l {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdsc zzd;
    private m zze;
    private g zzf;

    public static /* synthetic */ void zzb(zzbeb zzbebVar, int i10) {
        zzdsc zzdscVar = zzbebVar.zzd;
        if (zzdscVar != null) {
            zzdsb zzdsbVarZza = zzdscVar.zza();
            zzdsbVarZza.zzb("action", "cct_nav");
            zzdsbVarZza.zzb("cct_navs", String.valueOf(i10));
            zzdsbVarZza.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Context context) {
        String strA;
        if (this.zzf != null || context == null || (strA = g.a(context)) == null || strA.equals(context.getPackageName())) {
            return;
        }
        setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(strA)) {
            intent.setPackage(strA);
        }
        context.bindService(intent, this, 33);
    }

    @Override // p.l
    public final void onCustomTabsServiceConnected(ComponentName componentName, g gVar) {
        this.zzf = gVar;
        gVar.getClass();
        try {
            ((b.b) gVar.f12581a).x();
        } catch (RemoteException unused) {
        }
        this.zze = gVar.b(new zzbea(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final m zza() {
        if (this.zze == null) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdz
                @Override // java.lang.Runnable
                public final void run() {
                    zzbeb zzbebVar = this.zza;
                    zzbebVar.zzf(zzbebVar.zzc);
                }
            });
        }
        return this.zze;
    }

    public final void zzd(Context context, zzdsc zzdscVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdscVar;
        zzf(context);
    }

    public final void zze(final int i10) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeN)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdy
            @Override // java.lang.Runnable
            public final void run() {
                zzbeb.zzb(this.zza, i10);
            }
        });
    }
}
