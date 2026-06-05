package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdui implements zzdcx {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final synchronized void zzb(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final synchronized void zzc(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final synchronized void zzd(String str) {
        this.zza.putInt(str, 2);
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zza(String str) {
    }
}
