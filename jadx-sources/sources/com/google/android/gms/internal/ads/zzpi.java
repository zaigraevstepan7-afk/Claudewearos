package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzpi {
    public static final zzpi zza;
    public final int zzb;
    public final int zzc;
    private final zzfyk zzd;

    static {
        zzpi zzpiVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzfyj zzfyjVar = new zzfyj();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzfyjVar.zzf(Integer.valueOf(zzex.zzi(i10)));
            }
            zzpiVar = new zzpi(2, zzfyjVar.zzi());
        } else {
            zzpiVar = new zzpi(2, 10);
        }
        zza = zzpiVar;
    }

    public zzpi(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpi)) {
            return false;
        }
        zzpi zzpiVar = (zzpi) obj;
        return this.zzb == zzpiVar.zzb && this.zzc == zzpiVar.zzc && Objects.equals(this.zzd, zzpiVar.zzd);
    }

    public final int hashCode() {
        zzfyk zzfykVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfykVar == null ? 0 : zzfykVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i10, zze zzeVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzpj.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i11 = this.zzb;
        for (int i12 = 10; i12 > 0; i12--) {
            int iZzi = zzex.zzi(i12);
            if (iZzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(iZzi).build(), zzeVar.zza().zza)) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean zzb(int i10) {
        zzfyk zzfykVar = this.zzd;
        if (zzfykVar == null) {
            return i10 <= this.zzc;
        }
        int iZzi = zzex.zzi(i10);
        if (iZzi == 0) {
            return false;
        }
        return zzfykVar.contains(Integer.valueOf(iZzi));
    }

    public zzpi(int i10, Set set) {
        this.zzb = i10;
        zzfyk zzfykVarZzl = zzfyk.zzl(set);
        this.zzd = zzfykVarZzl;
        zzgal it = zzfykVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
