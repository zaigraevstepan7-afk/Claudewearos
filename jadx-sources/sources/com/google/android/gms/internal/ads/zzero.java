package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzero implements zzett {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzero(String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = z12;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z2 = this.zzb;
        bundle.putInt("test_mode", z2 ? 1 : 0);
        boolean z10 = this.zzc;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z2 || z10) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjA)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z2 = this.zzb;
        bundle.putInt("test_mode", z2 ? 1 : 0);
        boolean z10 = this.zzc;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z2 || z10) {
            zzbct zzbctVar = zzbdc.zzjw;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjA)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
