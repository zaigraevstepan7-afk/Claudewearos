package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcq implements zzcn {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;
    private zzcp zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcq() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzcn.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcl zza(zzcl zzclVar) throws zzcm {
        if (zzclVar.zzd != 2) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        int i10 = this.zzb;
        if (i10 == -1) {
            i10 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i10, zzclVar.zzc, 2);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final ByteBuffer zzb() {
        int iZza;
        zzcp zzcpVar = this.zzj;
        if (zzcpVar != null && (iZza = zzcpVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcpVar.zzd(this.zzl);
            this.zzo += iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcn.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzc() {
        if (zzg()) {
            zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            zzcl zzclVar2 = this.zzf;
            this.zzh = zzclVar2;
            if (this.zzi) {
                this.zzj = new zzcp(zzclVar.zzb, zzclVar.zzc, this.zzc, this.zzd, zzclVar2.zzb);
            } else {
                zzcp zzcpVar = this.zzj;
                if (zzcpVar != null) {
                    zzcpVar.zzc();
                }
            }
        }
        this.zzm = zzcn.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzd() {
        zzcp zzcpVar = this.zzj;
        if (zzcpVar != null) {
            zzcpVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcp zzcpVar = this.zzj;
            zzcpVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += iRemaining;
            zzcpVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzcn.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzcp zzcpVar = this.zzj;
        return zzcpVar == null || zzcpVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j4 = this.zzo;
        if (j4 < 1024) {
            return (long) (this.zzc * j);
        }
        long j10 = this.zzn;
        this.zzj.getClass();
        long jZzb = j10 - r2.zzb();
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzex.zzu(j, jZzb, j4, RoundingMode.DOWN) : zzex.zzu(j, jZzb * i10, j4 * i11, RoundingMode.DOWN);
    }

    public final void zzj(float f10) {
        zzdd.zzd(f10 > 0.0f);
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        zzdd.zzd(f10 > 0.0f);
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
