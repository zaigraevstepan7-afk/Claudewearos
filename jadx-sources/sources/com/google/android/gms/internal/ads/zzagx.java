package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzagx extends zzahd {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahd[] zze;

    public zzagx(String str, boolean z2, boolean z10, String[] strArr, zzahd[] zzahdVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = strArr;
        this.zze = zzahdVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagx.class == obj.getClass()) {
            zzagx zzagxVar = (zzagx) obj;
            if (this.zzb == zzagxVar.zzb && this.zzc == zzagxVar.zzc && Objects.equals(this.zza, zzagxVar.zza) && Arrays.equals(this.zzd, zzagxVar.zzd) && Arrays.equals(this.zze, zzagxVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i10 * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
