package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzagw extends zzahd {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahd[] zzg;

    public zzagw(String str, int i10, int i11, long j, long j4, zzahd[] zzahdVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j;
        this.zze = j4;
        this.zzg = zzahdVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagw.class == obj.getClass()) {
            zzagw zzagwVar = (zzagw) obj;
            if (this.zzb == zzagwVar.zzb && this.zzc == zzagwVar.zzc && this.zzd == zzagwVar.zzd && this.zze == zzagwVar.zze && Objects.equals(this.zza, zzagwVar.zza) && Arrays.equals(this.zzg, zzagwVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + 527;
        String str = this.zza;
        long j = this.zze;
        return str.hashCode() + (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31);
    }
}
