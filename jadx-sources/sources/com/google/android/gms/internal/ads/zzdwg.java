package com.google.android.gms.internal.ads;

import android.content.Context;
import mc.n;
import nc.t;
import xc.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdwg implements zzcyt, zzdei, zzcxf {
    private final Context zza;
    private final zzdsc zzb;

    public zzdwg(Context context, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdscVar;
    }

    public static void zzc(zzdwg zzdwgVar, Context context) {
        n.D.f11587n.zzd(context, zzdwgVar.zzb);
    }

    private final void zzd(final Context context) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeO)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwf
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwg.zzc(this.zza, context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeQ)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(v vVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeR)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeS)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
    }
}
