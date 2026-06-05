package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzahl {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzahl(long j, long j4, int i10) {
        zzdd.zzd(j < j4);
        this.zza = j;
        this.zzb = j4;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.zza == zzahlVar.zza && this.zzb == zzahlVar.zzb && this.zzc == zzahlVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j = this.zza;
        long j4 = this.zzb;
        int i10 = this.zzc;
        String str = zzex.zza;
        Locale locale = Locale.US;
        StringBuilder sbL = m1.l("Segment: startTimeMs=", ", endTimeMs=", j);
        sbL.append(j4);
        sbL.append(", speedDivisor=");
        sbL.append(i10);
        return sbL.toString();
    }
}
