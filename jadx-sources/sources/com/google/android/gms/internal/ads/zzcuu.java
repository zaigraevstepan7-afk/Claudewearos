package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
import nc.t;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcuu {
    private final zzfgs zza;
    private final rc.a zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhfs zzg;
    private final String zzh;
    private final zzetx zzi;
    private final n0 zzj;
    private final zzfco zzk;
    private final int zzl;
    private final zzdbh zzm;

    public zzcuu(zzfgs zzfgsVar, rc.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhfs zzhfsVar, n0 n0Var, String str2, zzetx zzetxVar, zzfco zzfcoVar, zzdbh zzdbhVar, int i10) {
        this.zza = zzfgsVar;
        this.zzb = aVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhfsVar;
        this.zzh = str2;
        this.zzi = zzetxVar;
        this.zzj = n0Var;
        this.zzk = zzfcoVar;
        this.zzm = zzdbhVar;
        this.zzl = i10;
    }

    public static zzbvo zza(zzcuu zzcuuVar, mf.a aVar, Bundle bundle) {
        zzcut zzcutVar = (zzcut) aVar.get();
        Bundle bundle2 = zzcutVar.zza;
        String str = (String) ((mf.a) zzcuuVar.zzg.zzb()).get();
        boolean z2 = false;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhf)).booleanValue() && ((o0) zzcuuVar.zzj).k()) {
            z2 = true;
        }
        boolean z10 = z2;
        String str2 = zzcuuVar.zzh;
        PackageInfo packageInfo = zzcuuVar.zzf;
        List list = zzcuuVar.zze;
        String str3 = zzcuuVar.zzd;
        return new zzbvo(bundle2, zzcuuVar.zzb, zzcuuVar.zzc, str3, list, packageInfo, str, str2, null, null, z10, zzcuuVar.zzk.zza(), bundle, zzcutVar.zzb, zzcuuVar.zzl);
    }

    public final mf.a zzb(Bundle bundle) {
        this.zzm.zza();
        return zzfgc.zzc(this.zzi.zza(new zzcut(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfgm.SIGNALS, this.zza).zza();
    }

    public final mf.a zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzco)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final mf.a aVarZzb = zzb(bundle);
        return this.zza.zza(zzfgm.REQUEST_PARCEL, aVarZzb, (mf.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcuu.zza(this.zza, aVarZzb, bundle);
            }
        }).zza();
    }
}
