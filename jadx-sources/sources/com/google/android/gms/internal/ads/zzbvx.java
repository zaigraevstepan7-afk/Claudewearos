package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvx extends zzbvz {
    private final String zza;
    private final int zzb;

    public zzbvx(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvx)) {
            zzbvx zzbvxVar = (zzbvx) obj;
            if (e0.l(this.zza, zzbvxVar.zza)) {
                if (e0.l(Integer.valueOf(this.zzb), Integer.valueOf(zzbvxVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzc() {
        return this.zza;
    }
}
