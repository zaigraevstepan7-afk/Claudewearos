package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzqs {
    private long zzA;
    private long zzB;
    private boolean zzC;
    private long zzD;
    private zzdj zzE;
    private final zzqr zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzqq zze;
    private int zzf;
    private long zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzqs(zzqr zzqrVar) {
        this.zza = zzqrVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzB = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzE = zzdj.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzl() {
        /*
            r10 = this;
            long r0 = r10.zzw
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r10.zzo()
            long r2 = r10.zzz
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            com.google.android.gms.internal.ads.zzdj r0 = r10.zzE
            long r0 = r0.zzb()
            long r4 = r10.zzr
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L70
            android.media.AudioTrack r4 = r10.zzc
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L6e
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L5f
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5d
            long r6 = r10.zzs
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r4 = 3
            if (r5 != r4) goto L5c
            long r4 = r10.zzx
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L6e
            r10.zzx = r0
            goto L6e
        L5c:
            r6 = r8
        L5d:
            r10.zzx = r2
        L5f:
            long r2 = r10.zzs
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6c
            long r2 = r10.zzt
            r4 = 1
            long r2 = r2 + r4
            r10.zzt = r2
        L6c:
            r10.zzs = r6
        L6e:
            r10.zzr = r0
        L70:
            long r0 = r10.zzs
            long r2 = r10.zzD
            long r0 = r0 + r2
            long r2 = r10.zzt
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqs.zzl():long");
    }

    private final long zzm(long j) {
        long jMax = Math.max(0L, (this.zzv == 0 ? this.zzw != -9223372036854775807L ? zzex.zzt(zzo(), this.zzf) : zzn() : zzex.zzq(j + this.zzk, this.zzh)) - this.zzn);
        return this.zzw != -9223372036854775807L ? Math.min(zzex.zzt(this.zzz, this.zzf), jMax) : jMax;
    }

    private final long zzn() {
        return zzex.zzt(zzl(), this.zzf);
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzy;
        }
        return this.zzy + zzex.zzp(zzex.zzq(zzex.zzs(this.zzE.zzb()) - this.zzw, this.zzh), this.zzf);
    }

    private final void zzp() {
        this.zzk = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzl = 0L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:23:0x0076, B:25:0x007a, B:27:0x009a, B:28:0x00a2), top: B:55:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a3, blocks: (B:23:0x0076, B:25:0x007a, B:27:0x009a, B:28:0x00a2), top: B:55:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqs.zza():long");
    }

    public final void zzb(long j) {
        this.zzy = zzl();
        this.zzw = zzex.zzs(this.zzE.zzb());
        this.zzz = j;
    }

    public final void zzc() {
        zzp();
        this.zzc = null;
        this.zze = null;
    }

    public final void zzd(AudioTrack audioTrack, boolean z2, int i10, int i11, int i12) {
        this.zzc = audioTrack;
        this.zzd = i12;
        this.zze = new zzqq(audioTrack, this.zza);
        this.zzf = audioTrack.getSampleRate();
        boolean zZzK = zzex.zzK(i10);
        this.zzp = zZzK;
        this.zzg = zZzK ? zzex.zzt(i12 / i11, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzC = false;
        this.zzD = 0L;
        this.zzo = false;
        this.zzw = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzh = 1.0f;
        this.zzj = 0;
        this.zzi = -9223372036854775807L;
    }

    public final void zze(zzdj zzdjVar) {
        this.zzE = zzdjVar;
    }

    public final void zzf() {
        if (this.zzw != -9223372036854775807L) {
            this.zzw = zzex.zzs(this.zzE.zzb());
        }
        this.zzi = zzn();
        zzqq zzqqVar = this.zze;
        zzqqVar.getClass();
        zzqqVar.zzc();
    }

    public final boolean zzg(long j) {
        return j > zzex.zzp(zza(), this.zzf);
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzx != -9223372036854775807L && j > 0 && this.zzE.zzb() - this.zzx >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        audioTrack.getPlayState();
        AudioTrack audioTrack2 = this.zzc;
        audioTrack2.getClass();
        int underrunCount = audioTrack2.getUnderrunCount();
        boolean z2 = underrunCount > this.zzj;
        this.zzj = underrunCount;
        if (z2) {
            this.zza.zze(this.zzd, zzex.zzv(this.zzg));
        }
        return true;
    }

    public final boolean zzk() {
        zzp();
        if (this.zzw != -9223372036854775807L) {
            this.zzy = zzl();
            return false;
        }
        zzqq zzqqVar = this.zze;
        zzqqVar.getClass();
        zzqqVar.zzc();
        return true;
    }
}
