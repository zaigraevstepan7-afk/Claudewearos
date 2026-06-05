package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzti {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public zzti(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z2;
        this.zze = z12;
        this.zzf = z14;
        this.zzh = z15;
        this.zzi = zzay.zzj(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzti zzd(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzti r0 = new com.google.android.gms.internal.ads.zzti
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L4f
            if (r15 == 0) goto L4f
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4f
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L4f
            java.lang.String r4 = "OPPO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5b
        L4f:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L66
        L5b:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L66:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzd(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzti");
    }

    private static Point zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzex.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzk(String str) {
        String str2 = zzex.zza;
        StringBuilder sbK = m6.a.k("NoSupport [", str, "] [");
        sbK.append(this.zza);
        sbK.append(", ");
        sbK.append(this.zzb);
        sbK.append("] [");
        sbK.append(str2);
        sbK.append("]");
        zzea.zzb("MediaCodecInfo", sbK.toString());
    }

    private static boolean zzl(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointZzj = zzj(videoCapabilities, i10, i11);
        int i12 = pointZzj.x;
        int i13 = pointZzj.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r1.equals("video/hevc") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r1.equals("video/av01") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzm(com.google.android.gms.internal.ads.zzz r11, boolean r12) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzuc.zza
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzdk.zza(r11)
            java.lang.String r1 = r11.zzo
            java.lang.String r2 = "video/hevc"
            if (r1 == 0) goto L45
            java.lang.String r3 = "video/mv-hevc"
            boolean r4 = r1.equals(r3)
            if (r4 == 0) goto L45
            java.lang.String r4 = r10.zzc
            java.lang.String r4 = com.google.android.gms.internal.ads.zzay.zze(r4)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L22
            goto Le0
        L22:
            boolean r3 = r4.equals(r2)
            if (r3 == 0) goto L45
            java.util.List r0 = r11.zzr
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfv.zzh(r0)
            if (r0 != 0) goto L32
            r0 = 0
            goto L45
        L32:
            java.lang.String r3 = r0.trim()
            java.lang.String r4 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r4 = "\\."
            r5 = -1
            java.lang.String[] r3 = r3.split(r4, r5)
            com.google.android.gms.internal.ads.zzk r4 = r11.zzE
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzdk.zzb(r0, r3, r4)
        L45:
            if (r0 == 0) goto Le0
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r4 = "video/dolby-vision"
            boolean r1 = r4.equals(r1)
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L94
            java.lang.String r1 = r10.zzb
            int r6 = r1.hashCode()
            r7 = -1662735862(0xffffffff9ce4aa0a, float:-1.5131728E-21)
            if (r6 == r7) goto L8b
            r7 = -1662541442(0xffffffff9ce7a17e, float:-1.5328042E-21)
            if (r6 == r7) goto L83
            r7 = 1331836730(0x4f62373a, float:3.7952701E9)
            if (r6 == r7) goto L77
            goto L94
        L77:
            java.lang.String r6 = "video/avc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L94
            r3 = 8
        L81:
            r0 = r5
            goto L94
        L83:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
        L89:
            r3 = r4
            goto L81
        L8b:
            java.lang.String r6 = "video/av01"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L94
            goto L89
        L94:
            boolean r1 = r10.zzi
            if (r1 != 0) goto L9d
            r1 = 42
            if (r3 != r1) goto Le0
            r3 = r1
        L9d:
            android.media.MediaCodecInfo$CodecProfileLevel[] r1 = r10.zzi()
            int r6 = r1.length
            r7 = r5
        La3:
            if (r7 >= r6) goto Ld0
            r8 = r1[r7]
            int r9 = r8.profile
            if (r9 != r3) goto Lcd
            int r8 = r8.level
            if (r8 >= r0) goto Lb1
            if (r12 != 0) goto Lcd
        Lb1:
            java.lang.String r8 = r10.zzb
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto Le0
            if (r3 != r4) goto Le0
            java.lang.String r8 = android.os.Build.DEVICE
            java.lang.String r9 = "sailfish"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto Lcd
            java.lang.String r9 = "marlin"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto Le0
        Lcd:
            int r7 = r7 + 1
            goto La3
        Ld0:
            java.lang.String r11 = r11.zzk
            java.lang.String r12 = r10.zzc
            java.lang.String r0 = "codec.profileLevel, "
            java.lang.String r1 = ", "
            java.lang.String r11 = y8.f.b(r0, r11, r1, r12)
            r10.zzk(r11)
            return r5
        Le0:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzm(com.google.android.gms.internal.ads.zzz, boolean):boolean");
    }

    private final boolean zzn(zzz zzzVar) {
        return (Objects.equals(zzzVar.zzo, "audio/flac") && zzzVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final boolean zzo(zzz zzzVar) {
        String str = this.zzb;
        return str.equals(zzzVar.zzo) || str.equals(zzuc.zzb(zzzVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final float zza(int i10, int i11) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i10 && this.zzk == i11) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzh(i10, i11, 1024.0d)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzh = zzh(i10, i11, f14);
                if (true == zZzh) {
                    f12 = f14;
                }
                if (true != zZzh) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i10;
        this.zzk = i11;
        return f11;
    }

    public final Point zzb(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzj(videoCapabilities, i10, i11);
    }

    public final zzie zzc(zzz zzzVar, zzz zzzVar2) {
        zzz zzzVar3;
        zzz zzzVar4;
        int i10;
        int i11 = true != Objects.equals(zzzVar.zzo, zzzVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzzVar.zzA != zzzVar2.zzA) {
                i11 |= 1024;
            }
            boolean z2 = (zzzVar.zzv == zzzVar2.zzv && zzzVar.zzw == zzzVar2.zzw) ? false : true;
            if (!this.zze && z2) {
                i11 |= 512;
            }
            zzk zzkVar = zzzVar.zzE;
            if ((!zzk.zzg(zzkVar) || !zzk.zzg(zzzVar2.zzE)) && !Objects.equals(zzkVar, zzzVar2.zzE)) {
                i11 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzzVar.zzd(zzzVar2)) {
                i11 |= 2;
            }
            int i12 = zzzVar.zzx;
            if (i12 != -1 && (i10 = zzzVar.zzy) != -1 && i12 == zzzVar2.zzx && i10 == zzzVar2.zzy && z2) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzie(str, zzzVar, zzzVar2, true != zzzVar.zzd(zzzVar2) ? 2 : 3, 0);
            }
            zzzVar3 = zzzVar;
            zzzVar4 = zzzVar2;
        } else {
            zzzVar3 = zzzVar;
            zzzVar4 = zzzVar2;
            if (zzzVar3.zzG != zzzVar4.zzG) {
                i11 |= 4096;
            }
            if (zzzVar3.zzH != zzzVar4.zzH) {
                i11 |= 8192;
            }
            if (zzzVar3.zzI != zzzVar4.zzI) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i13 = zzuc.zza;
                Pair pairZza = zzdk.zza(zzzVar3);
                Pair pairZza2 = zzdk.zza(zzzVar4);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzie(this.zza, zzzVar3, zzzVar4, 3, 0);
                    }
                }
            }
            if (!zzzVar3.zzd(zzzVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzie(this.zza, zzzVar3, zzzVar4, 1, 0);
            }
        }
        return new zzie(this.zza, zzzVar3, zzzVar4, 0, i11);
    }

    public final boolean zze(zzz zzzVar) {
        return zzo(zzzVar) && zzm(zzzVar, false) && zzn(zzzVar);
    }

    public final boolean zzf(zzz zzzVar) {
        int i10;
        if (!zzo(zzzVar) || !zzm(zzzVar, true) || !zzn(zzzVar)) {
            return false;
        }
        if (this.zzi) {
            int i11 = zzzVar.zzv;
            if (i11 <= 0 || (i10 = zzzVar.zzw) <= 0) {
                return true;
            }
            return zzh(i11, i10, zzzVar.zzz);
        }
        int i12 = zzzVar.zzH;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzk("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzk("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i12)) {
                zzk(m6.a.d(i12, "sampleRate.support, "));
                return false;
            }
        }
        int i13 = zzzVar.zzG;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzk("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzk("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                zzea.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i14 + "]");
                maxInputChannelCount = i14;
            }
            if (maxInputChannelCount < i13) {
                zzk(m6.a.d(i13, "channelCount.support, "));
                return false;
            }
        }
        return true;
    }

    public final boolean zzg(zzz zzzVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i10 = zzuc.zza;
        Pair pairZza = zzdk.zza(zzzVar);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzh(int r9, int r10, double r11) {
        /*
            r8 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.zzd
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r9 = "sizeAndRate.caps"
            r8.zzk(r9)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r9 = "sizeAndRate.vCaps"
            r8.zzk(r9)
            return r1
        L17:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r4 = 1
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r3) goto L3f
            int r2 = com.google.android.gms.internal.ads.zztk.zza(r0, r9, r10, r11)
            r3 = 2
            if (r2 != r3) goto L2b
            goto La6
        L2b:
            if (r2 == r4) goto L2e
            goto L3f
        L2e:
            java.lang.String r0 = "sizeAndRate.cover, "
            java.lang.StringBuilder r9 = gk.b.q(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.zzk(r9)
            return r1
        L3f:
            boolean r2 = zzl(r0, r9, r10, r11)
            if (r2 != 0) goto La6
            if (r9 >= r10) goto L95
            java.lang.String r2 = r8.zza
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5b
            java.lang.String r3 = "mcv5a"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L95
        L5b:
            boolean r0 = zzl(r0, r10, r9, r11)
            if (r0 != 0) goto L62
            goto L95
        L62:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r9 = gk.b.q(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = r8.zzb
            java.lang.String r11 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r12 = "AssumedSupport ["
            java.lang.String r0 = ", "
            java.lang.String r1 = "] ["
            java.lang.StringBuilder r9 = t.m1.m(r12, r9, r1, r2, r0)
            r9.append(r10)
            r9.append(r1)
            r9.append(r11)
            java.lang.String r10 = "]"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzea.zzb(r10, r9)
            goto La6
        L95:
            java.lang.String r0 = "sizeAndRate.support, "
            java.lang.StringBuilder r9 = gk.b.q(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.zzk(r9)
            return r1
        La6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzh(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzi() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
