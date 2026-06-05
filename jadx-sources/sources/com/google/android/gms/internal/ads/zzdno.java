package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdno implements Callable {
    private final mc.a zza;
    private final Context zzb;
    private final zzdsc zzc;
    private final zzebs zzd;
    private final Executor zze;
    private final zzavs zzf;
    private final rc.a zzg;
    private final zzfjq zzh;
    private final zzecd zzi;
    private final zzfcs zzj;

    public zzdno(Context context, Executor executor, zzavs zzavsVar, rc.a aVar, mc.a aVar2, zzcfr zzcfrVar, zzebs zzebsVar, zzfjq zzfjqVar, zzdsc zzdscVar, zzecd zzecdVar, zzfcs zzfcsVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavsVar;
        this.zzg = aVar;
        this.zza = aVar2;
        this.zzd = zzebsVar;
        this.zzh = zzfjqVar;
        this.zzc = zzdscVar;
        this.zzi = zzecdVar;
        this.zzj = zzfcsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzdnr zzdnrVar = new zzdnr(this);
        zzdnrVar.zzk();
        return zzdnrVar;
    }
}
