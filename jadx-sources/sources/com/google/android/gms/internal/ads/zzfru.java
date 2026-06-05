package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
class zzfru {
    static final String zza = new UUID(0, 0).toString();
    final zzfrt zzb;
    final zzfrs zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzfru(Context context, String str, String str2, String str3) {
        this.zzb = zzfrt.zzb(context);
        this.zzc = zzfrs.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(m1.w(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str2 == null ? "null" : "not null");
        sb2.append(", hashKey is ");
        sb2.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final long zza(boolean z2) {
        return this.zzb.zza(z2 ? this.zzg : this.zzf, -1L);
    }

    public final zzfrr zzb(String str, String str2, long j, boolean z2) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfrr();
        }
        boolean z10 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZza = zza(z10);
        if (jZza != -1) {
            if (jCurrentTimeMillis < jZza) {
                this.zzb.zzd(z10 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZza + j) {
                return zzc(str, str2);
            }
        }
        String strZze2 = zze(z10);
        return (strZze2 != null || z2) ? new zzfrr(strZze2, zza(z10)) : zzc(str, str2);
    }

    public final zzfrr zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", string);
        return zzd(zzh(str, str2, string), true);
    }

    public final zzfrr zzd(String str, boolean z2) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzfrt zzfrtVar = this.zzb;
        zzfrtVar.zzd(z2 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        zzfrtVar.zzd(z2 ? this.zze : this.zzd, str);
        return new zzfrr(str, jCurrentTimeMillis);
    }

    public final String zze(boolean z2) {
        return this.zzb.zzc(z2 ? this.zze : this.zzd, null);
    }

    public final void zzf(boolean z2) throws IOException {
        String str = z2 ? this.zzg : this.zzf;
        zzfrt zzfrtVar = this.zzb;
        zzfrtVar.zze(str);
        zzfrtVar.zze(z2 ? this.zze : this.zzd);
    }

    public final boolean zzg(boolean z2) {
        return this.zzb.zzg(this.zzd);
    }
}
