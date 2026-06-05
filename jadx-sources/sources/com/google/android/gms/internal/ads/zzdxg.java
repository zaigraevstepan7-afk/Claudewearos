package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdxg {
    private final ScheduledExecutorService zza;
    private final zzgdm zzb;
    private final zzgdm zzc;
    private final zzdyc zzd;
    private final zzhfs zze;

    public zzdxg(ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar, zzgdm zzgdmVar2, zzdyc zzdycVar, zzhfs zzhfsVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgdmVar;
        this.zzc = zzgdmVar2;
        this.zzd = zzdycVar;
        this.zze = zzhfsVar;
    }

    public static zzdyq zza(zzdxg zzdxgVar, zzbvo zzbvoVar) {
        return (zzdyq) zzdxgVar.zzd.zza(zzbvoVar).get(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ mf.a zzb(zzdxg zzdxgVar, final zzbvo zzbvoVar, int i10, Throwable th2) {
        Bundle bundle;
        if (zzbvoVar != null && (bundle = zzbvoVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgdb.zzn(((zzdzt) zzdxgVar.zze.zzb()).zzd(zzbvoVar, i10), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdxd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzgdb.zzh(new zzdyq((InputStream) obj, zzbvoVar));
            }
        }, zzdxgVar.zzb);
    }

    public final mf.a zzc(final zzbvo zzbvoVar) {
        mf.a aVarZzb;
        String str = zzbvoVar.zzd;
        r0 r0Var = n.D.f11577c;
        if (r0.d(str)) {
            aVarZzb = zzgdb.zzg(new zzdyp(1));
        } else {
            aVarZzb = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhE)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdxg.zza(this.zza, zzbvoVar);
                }
            }) : this.zzd.zza(zzbvoVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgcs) zzgdb.zzf((zzgcs) zzgdb.zzo(zzgcs.zzw(aVarZzb), ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdxg.zzb(this.zza, zzbvoVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
