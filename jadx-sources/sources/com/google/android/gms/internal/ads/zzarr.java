package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzarr extends zzhfh {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhfr zzm;
    private long zzn;

    public zzarr() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhfr.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhff
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhfm.zza(zzarn.zzf(byteBuffer));
            this.zzh = zzhfm.zza(zzarn.zzf(byteBuffer));
            this.zzi = zzarn.zze(byteBuffer);
            this.zzj = zzarn.zzf(byteBuffer);
        } else {
            this.zzg = zzhfm.zza(zzarn.zze(byteBuffer));
            this.zzh = zzhfm.zza(zzarn.zze(byteBuffer));
            this.zzi = zzarn.zze(byteBuffer);
            this.zzj = zzarn.zze(byteBuffer);
        }
        this.zzk = zzarn.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzarn.zzd(byteBuffer);
        zzarn.zze(byteBuffer);
        zzarn.zze(byteBuffer);
        this.zzm = new zzhfr(zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zza(byteBuffer), zzarn.zza(byteBuffer), zzarn.zza(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzarn.zze(byteBuffer);
    }
}
