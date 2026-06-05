package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbkn implements pc.a {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ nc.a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbkn(zzbkp zzbkpVar, boolean z2, nc.a aVar, Map map, Map map2) {
        this.zzb = z2;
        this.zzc = aVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // pc.a
    public final void zza(boolean z2) {
        if (this.zza) {
            return;
        }
        if (z2 && this.zzb) {
            ((zzddw) this.zzc).zzdf();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z2));
        ((zzbmy) this.zzc).zzd("openIntentAsync", map);
    }

    @Override // pc.a
    public final void zzb(int i10) {
    }
}
