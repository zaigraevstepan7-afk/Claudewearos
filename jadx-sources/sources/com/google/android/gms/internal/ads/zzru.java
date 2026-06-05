package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzru extends zztp implements zzlb {
    private final Context zzb;
    private final zzqg zzc;
    private final zzqo zzd;
    private final zztb zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzz zzi;
    private zzz zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzru(Context context, zztd zztdVar, zztr zztrVar, boolean z2, Handler handler, zzqh zzqhVar, zzqo zzqoVar) {
        super(1, zztdVar, zztrVar, false, 44100.0f);
        zzrt zzrtVar = null;
        zztb zztbVar = Build.VERSION.SDK_INT >= 35 ? new zztb(zzta.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqoVar;
        this.zze = zztbVar;
        this.zzo = -1000;
        this.zzc = new zzqg(handler, zzqhVar);
        zzqoVar.zzq(new zzrs(this, zzrtVar));
    }

    private final int zzaW(zzti zztiVar, zzz zzzVar) {
        "OMX.google.raw.decoder".equals(zztiVar.zza);
        return zzzVar.zzp;
    }

    private static List zzaX(zztr zztrVar, zzz zzzVar, boolean z2, zzqo zzqoVar) {
        zzti zztiVarZza;
        return zzzVar.zzo == null ? zzfyf.zzn() : (!zzqoVar.zzA(zzzVar) || (zztiVarZza = zzuc.zza()) == null) ? zzuc.zze(zztrVar, zzzVar, false, false) : zzfyf.zzo(zztiVarZza);
    }

    private final void zzaY() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzb = Math.max(this.zzk, jZzb);
            }
            this.zzk = jZzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzA() {
        zztb zztbVar;
        this.zzd.zzk();
        if (Build.VERSION.SDK_INT < 35 || (zztbVar = this.zze) == null) {
            return;
        }
        zztbVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th2) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzE() {
        zzaY();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzmd
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        int iMax = -1;
        for (zzz zzzVar2 : zzzVarArr) {
            int i10 = zzzVar2.zzH;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final long zza() {
        if (zzcU() == 2) {
            zzaY();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final int zzaa(zztr zztrVar, zzz zzzVar) {
        int i10;
        boolean z2;
        String str = zzzVar.zzo;
        if (!zzay.zzh(str)) {
            return 128;
        }
        int i11 = zzzVar.zzN;
        boolean zZzaU = zztp.zzaU(zzzVar);
        int i12 = 1;
        if (!zZzaU || (i11 != 0 && zzuc.zza() == null)) {
            i10 = 0;
        } else {
            zzqo zzqoVar = this.zzd;
            zzps zzpsVarZzd = zzqoVar.zzd(zzzVar);
            if (zzpsVarZzd.zzb) {
                i10 = true != zzpsVarZzd.zzc ? 512 : 1536;
                if (zzpsVarZzd.zzd) {
                    i10 |= 2048;
                }
            } else {
                i10 = 0;
            }
            if (zzqoVar.zzA(zzzVar)) {
                return i10 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzA(zzzVar)) {
            zzqo zzqoVar2 = this.zzd;
            if (zzqoVar2.zzA(zzex.zzA(2, zzzVar.zzG, zzzVar.zzH))) {
                List listZzaX = zzaX(zztrVar, zzzVar, false, zzqoVar2);
                if (!listZzaX.isEmpty()) {
                    if (zZzaU) {
                        zzti zztiVar = (zzti) listZzaX.get(0);
                        boolean zZzf = zztiVar.zzf(zzzVar);
                        if (zZzf) {
                            z2 = true;
                        } else {
                            for (int i13 = 1; i13 < listZzaX.size(); i13++) {
                                zzti zztiVar2 = (zzti) listZzaX.get(i13);
                                if (zztiVar2.zzf(zzzVar)) {
                                    z2 = false;
                                    zZzf = true;
                                    zztiVar = zztiVar2;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        int i14 = true != zZzf ? 3 : 4;
                        int i15 = 8;
                        if (zZzf && zztiVar.zzg(zzzVar)) {
                            i15 = 16;
                        }
                        return i14 | i15 | 32 | (true != zztiVar.zzg ? 0 : 64) | (true != z2 ? 0 : 128) | i10;
                    }
                    i12 = 2;
                }
            }
        }
        return i12 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        int i10;
        int i11;
        zzie zzieVarZzc = zztiVar.zzc(zzzVar, zzzVar2);
        int i12 = zzieVarZzc.zze;
        if (zzaO(zzzVar2)) {
            i12 |= 32768;
        }
        if (zzaW(zztiVar, zzzVar2) > this.zzf) {
            i12 |= 64;
        }
        String str = zztiVar.zza;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = zzieVarZzc.zzd;
        }
        return new zzie(str, zzzVar, zzzVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzac(zzkv zzkvVar) {
        zzz zzzVar = zzkvVar.zza;
        zzzVar.getClass();
        this.zzi = zzzVar;
        zzie zzieVarZzac = super.zzac(zzkvVar);
        this.zzc.zzw(zzzVar, zzieVarZzac);
        return zzieVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zztc zzag(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10) {
        zzz[] zzzVarArrZzT = zzT();
        int length = zzzVarArrZzT.length;
        int iZzaW = zzaW(zztiVar, zzzVar);
        if (length != 1) {
            for (zzz zzzVar2 : zzzVarArrZzT) {
                if (zztiVar.zzc(zzzVar, zzzVar2).zzd != 0) {
                    iZzaW = Math.max(iZzaW, zzaW(zztiVar, zzzVar2));
                }
            }
        }
        this.zzf = iZzaW;
        String str = zztiVar.zza;
        int i10 = Build.VERSION.SDK_INT;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zztiVar.zzc;
        int i11 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i12 = zzzVar.zzG;
        mediaFormat.setInteger("channel-count", i12);
        int i13 = zzzVar.zzH;
        mediaFormat.setInteger("sample-rate", i13);
        zzed.zzb(mediaFormat, zzzVar.zzr);
        zzed.zza(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        String str3 = zzzVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair pairZza = zzdk.zza(zzzVar);
            if (pairZza != null) {
                zzed.zza(mediaFormat, "profile", ((Integer) pairZza.first).intValue());
                zzed.zza(mediaFormat, "level", ((Integer) pairZza.second).intValue());
            }
            if (i10 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zza(zzex.zzA(4, i12, i13)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zztiVar.zzb) || "audio/raw".equals(str3)) ? null : zzzVar;
        return zztc.zza(zztiVar, mediaFormat, zzzVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final List zzah(zztr zztrVar, zzz zzzVar, boolean z2) {
        return zzuc.zzf(zzaX(zztrVar, zzzVar, false, this.zzd), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzak(zzhs zzhsVar) {
        zzz zzzVar;
        if (Build.VERSION.SDK_INT < 29 || (zzzVar = zzhsVar.zza) == null || !Objects.equals(zzzVar.zzo, "audio/opus") || !zzaN()) {
            return;
        }
        ByteBuffer byteBuffer = zzhsVar.zzf;
        byteBuffer.getClass();
        zzz zzzVar2 = zzhsVar.zza;
        zzzVar2.getClass();
        int i10 = zzzVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzal(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzn(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzam(String str, zztc zztcVar, long j, long j4) {
        this.zzc.zzs(str, j, j4);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzan(String str) {
        this.zzc.zzt(str);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzao(zzz zzzVar, MediaFormat mediaFormat) throws zzin {
        int i10;
        zzz zzzVar2 = this.zzj;
        int[] iArr = null;
        boolean z2 = true;
        if (zzzVar2 != null) {
            zzzVar = zzzVar2;
        } else if (zzaB() != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(zzzVar.zzo) ? zzzVar.zzI : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzex.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            zzx zzxVar = new zzx();
            zzxVar.zzah("audio/raw");
            zzxVar.zzab(integer);
            zzxVar.zzM(zzzVar.zzJ);
            zzxVar.zzN(zzzVar.zzK);
            zzxVar.zzaa(zzzVar.zzl);
            zzxVar.zzS(zzzVar.zza);
            zzxVar.zzU(zzzVar.zzb);
            zzxVar.zzV(zzzVar.zzc);
            zzxVar.zzW(zzzVar.zzd);
            zzxVar.zzaj(zzzVar.zze);
            zzxVar.zzaf(zzzVar.zzf);
            zzxVar.zzD(mediaFormat.getInteger("channel-count"));
            zzxVar.zzai(mediaFormat.getInteger("sample-rate"));
            zzz zzzVarZzan = zzxVar.zzan();
            if (this.zzg && zzzVarZzan.zzG == 6 && (i10 = zzzVar.zzG) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.zzh) {
                int i12 = zzzVarZzan.zzG;
                if (i12 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i12 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i12 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i12 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i12 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzzVar = zzzVarZzan;
        }
        try {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                if (zzaN()) {
                    zzn();
                }
                if (i13 < 29) {
                    z2 = false;
                }
                zzdd.zzf(z2);
            }
            this.zzd.zze(zzzVar, 0, iArr);
        } catch (zzqj e10) {
            throw zzcX(e10, e10.zza, false, 5001);
        }
    }

    public final void zzap() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaq() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzar() throws zzin {
        try {
            this.zzd.zzj();
        } catch (zzqn e10) {
            throw zzcX(e10, e10.zzc, e10.zzb, true != zzaN() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzas(long j, long j4, zztf zztfVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z2, boolean z10, zzz zzzVar) throws zzin {
        byteBuffer.getClass();
        if (this.zzj != null && (i11 & 2) != 0) {
            zztfVar.getClass();
            zztfVar.zzo(i10, false);
            return true;
        }
        if (z2) {
            if (zztfVar != null) {
                zztfVar.zzo(i10, false);
            }
            ((zztp) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j10, i12)) {
                return false;
            }
            if (zztfVar != null) {
                zztfVar.zzo(i10, false);
            }
            ((zztp) this).zza.zze += i12;
            return true;
        } catch (zzqk e10) {
            zzz zzzVar2 = this.zzi;
            if (zzaN()) {
                zzn();
            }
            throw zzcX(e10, zzzVar2, e10.zzb, 5001);
        } catch (zzqn e11) {
            if (zzaN()) {
                zzn();
            }
            throw zzcX(e11, zzzVar, e11.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzat(zzz zzzVar) {
        zzn();
        return this.zzd.zzA(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzbb zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzg(zzbb zzbbVar) {
        this.zzd.zzs(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final boolean zzj() {
        boolean z2 = this.zzn;
        this.zzn = false;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public final void zzu(int i10, Object obj) {
        zztb zztbVar;
        if (i10 == 2) {
            zzqo zzqoVar = this.zzd;
            obj.getClass();
            zzqoVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            zze zzeVar = (zze) obj;
            zzqo zzqoVar2 = this.zzd;
            zzeVar.getClass();
            zzqoVar2.zzm(zzeVar);
            return;
        }
        if (i10 == 6) {
            zzf zzfVar = (zzf) obj;
            zzqo zzqoVar3 = this.zzd;
            zzfVar.getClass();
            zzqoVar3.zzo(zzfVar);
            return;
        }
        if (i10 == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zztf zztfVarZzaB = zzaB();
            if (zztfVarZzaB == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zztfVarZzaB.zzq(bundle);
            return;
        }
        if (i10 == 9) {
            zzqo zzqoVar4 = this.zzd;
            obj.getClass();
            zzqoVar4.zzv(((Boolean) obj).booleanValue());
        } else {
            if (i10 != 10) {
                super.zzu(i10, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzn(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zztbVar = this.zze) == null) {
                return;
            }
            zztbVar.zzd(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th2) {
            super.zzx();
            throw th2;
        } finally {
            this.zzc.zzu(((zztp) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzy(boolean z2, boolean z10) {
        super.zzy(z2, z10);
        this.zzc.zzv(((zztp) this).zza);
        zzn();
        zzqo zzqoVar = this.zzd;
        zzqoVar.zzt(zzo());
        zzqoVar.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzz(long j, boolean z2) {
        super.zzz(j, z2);
        this.zzd.zzf();
        this.zzk = j;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final zzlb zzl() {
        return this;
    }
}
