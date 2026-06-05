package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaxd implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzaxe zza;

    public zzaxd(zzaxe zzaxeVar) {
        this.zza = zzaxeVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z2) {
        if (z2) {
            zzaxe zzaxeVar = this.zza;
            zzaxeVar.zzb = System.currentTimeMillis();
            zzaxeVar.zze = true;
        } else {
            zzaxe zzaxeVar2 = this.zza;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzaxeVar2.zzc > 0 && jCurrentTimeMillis >= zzaxeVar2.zzc) {
                zzaxeVar2.zzd = jCurrentTimeMillis - zzaxeVar2.zzc;
            }
            zzaxeVar2.zze = false;
        }
    }
}
