package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzefe implements zzdgg {
    private final zzfbt zza;
    private final zzbrn zzb;
    private final fc.b zzc;
    private zzcwj zzd = null;

    public zzefe(zzfbt zzfbtVar, zzbrn zzbrnVar, fc.b bVar) {
        this.zza = zzfbtVar;
        this.zzb = zzbrnVar;
        this.zzc = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z2, Context context, zzcwe zzcweVar) throws zzdgf {
        boolean zZzs;
        try {
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(new xd.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(new xd.b(context));
                    }
                    throw new zzdgf("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(new xd.b(context));
            }
            if (zZzs) {
                zzcwj zzcwjVar = this.zzd;
                if (zzcwjVar == null) {
                    return;
                }
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbG)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwjVar.zza();
                return;
            }
            throw new zzdgf("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdgf(th2);
        }
    }

    public final void zzc(zzcwj zzcwjVar) {
        this.zzd = zzcwjVar;
    }
}
