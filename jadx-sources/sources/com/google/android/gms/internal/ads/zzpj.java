package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzpj {
    static final zzfyi zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzpj zza = new zzpj(zzfyf.zzo(zzpi.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzfyf zzc = zzfyf.zzq(2, 5, 6);

    static {
        zzfyh zzfyhVar = new zzfyh();
        zzfyhVar.zza(5, 6);
        zzfyhVar.zza(17, 6);
        zzfyhVar.zza(7, 6);
        zzfyhVar.zza(30, 10);
        zzfyhVar.zza(18, 6);
        zzfyhVar.zza(6, 8);
        zzfyhVar.zza(8, 8);
        zzfyhVar.zza(14, 8);
        zzb = zzfyhVar.zzc();
    }

    private zzpj(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzpi zzpiVar = (zzpi) list.get(i10);
            this.zzd.put(zzpiVar.zzb, zzpiVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            iMax = Math.max(iMax, ((zzpi) this.zzd.valueAt(i11)).zzc);
        }
        this.zze = iMax;
    }

    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzpj zzc(Context context, zze zzeVar, zzpp zzppVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzppVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzpj zzd(Context context, Intent intent, zze zzeVar, zzpp zzppVar) {
        AudioManager audioManagerZzc = zzcj.zzc(context);
        if (zzppVar == null) {
            zzpp zzppVar2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    List audioDevicesForAttributes = audioManagerZzc.getAudioDevicesForAttributes(zzeVar.zza().zza);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzppVar2 = new zzpp((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzppVar = zzppVar2;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (zzex.zzN(context) || zzex.zzJ(context))) {
            List directProfilesForAttributes = audioManagerZzc.getDirectProfilesForAttributes(zzeVar.zza().zza);
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgbi.zzh(12)));
            for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
                AudioProfile audioProfileI = d.i(directProfilesForAttributes.get(i11));
                if (audioProfileI.getEncapsulationType() != 1) {
                    int format = audioProfileI.getFormat();
                    if (zzex.zzK(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgbi.zzh(audioProfileI.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgbi.zzh(audioProfileI.getChannelMasks())));
                        }
                    }
                }
            }
            int i12 = zzfyf.zzd;
            zzfyc zzfycVar = new zzfyc();
            for (Map.Entry entry : map.entrySet()) {
                zzfycVar.zzf(new zzpi(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzpj(zzfycVar.zzi());
        }
        AudioDeviceInfo[] devices = zzppVar == null ? audioManagerZzc.getDevices(2) : new AudioDeviceInfo[]{zzppVar.zza};
        zzfyj zzfyjVar = new zzfyj();
        zzfyjVar.zzg(8, 7);
        if (i10 >= 31) {
            zzfyjVar.zzg(26, 27);
        }
        if (i10 >= 33) {
            zzfyjVar.zzf((Object) 30);
        }
        zzfyk zzfykVarZzi = zzfyjVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzfykVarZzi.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return zza;
            }
        }
        zzfyj zzfyjVar2 = new zzfyj();
        zzfyjVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzex.zzN(context) || zzex.zzJ(context))) {
            int i13 = zzfyf.zzd;
            zzfyc zzfycVar2 = new zzfyc();
            zzgal it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzex.zzh(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzeVar.zza().zza)) {
                    zzfycVar2.zzf(num);
                }
            }
            zzfycVar2.zzf((Object) 2);
            zzfyjVar2.zzh(zzfycVar2.zzi());
            return new zzpj(zze(zzgbi.zzi(zzfyjVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z2 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z2 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfyjVar2.zzh(zzc);
        }
        if (intent == null || z2 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzpj(zze(zzgbi.zzi(zzfyjVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfyjVar2.zzh(zzgbi.zzh(intArrayExtra));
        }
        return new zzpj(zze(zzgbi.zzi(zzfyjVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfyf zze(int[] iArr, int i10) {
        int i11 = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        for (int i12 : iArr) {
            zzfycVar.zzf(new zzpi(i12, i10));
        }
        return zzfycVar.zzi();
    }

    private static boolean zzf() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            if (r7 != r8) goto L3
            goto L46
        L3:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzpj
            r1 = 0
            if (r0 != 0) goto L9
            goto L48
        L9:
            com.google.android.gms.internal.ads.zzpj r8 = (com.google.android.gms.internal.ads.zzpj) r8
            android.util.SparseArray r0 = r7.zzd
            android.util.SparseArray r2 = r8.zzd
            java.lang.String r3 = com.google.android.gms.internal.ads.zzex.zza
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L1e
            boolean r0 = com.google.android.gms.internal.ads.d.B(r0, r2)
            if (r0 == 0) goto L48
            goto L40
        L1e:
            int r3 = r0.size()
            int r4 = r2.size()
            if (r3 != r4) goto L48
            r4 = r1
        L29:
            if (r4 >= r3) goto L40
            int r5 = r0.keyAt(r4)
            java.lang.Object r6 = r0.valueAt(r4)
            java.lang.Object r5 = r2.get(r5)
            boolean r5 = java.util.Objects.equals(r6, r5)
            if (r5 == 0) goto L48
            int r4 = r4 + 1
            goto L29
        L40:
            int r0 = r7.zze
            int r8 = r8.zze
            if (r0 != r8) goto L48
        L46:
            r8 = 1
            return r8
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzex.zza;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
      0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzz r10, com.google.android.gms.internal.ads.zze r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzo
            r0.getClass()
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzay.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfyi r2 = com.google.android.gms.internal.ads.zzpj.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lad
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzH(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzH(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.zzd
            boolean r6 = com.google.android.gms.internal.ads.zzex.zzH(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.zzd
            boolean r7 = com.google.android.gms.internal.ads.zzex.zzH(r6, r1)
            if (r7 == 0) goto Lad
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzpi r6 = (com.google.android.gms.internal.ads.zzpi) r6
            r6.getClass()
            int r7 = r10.zzG
            r8 = -1
            if (r7 == r8) goto L7a
            if (r1 != r5) goto L60
            goto L7a
        L60:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L73
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L73
            r10 = 10
            if (r7 <= r10) goto L85
            goto Lad
        L73:
            boolean r10 = r6.zzb(r7)
            if (r10 != 0) goto L85
            goto Lad
        L7a:
            int r10 = r10.zzH
            if (r10 != r8) goto L81
            r10 = 48000(0xbb80, float:6.7262E-41)
        L81:
            int r7 = r6.zza(r10, r11)
        L85:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L99
            if (r7 != r2) goto L8e
            goto L9a
        L8e:
            r10 = 3
            if (r7 == r10) goto L97
            r10 = 4
            if (r7 == r10) goto L97
            r10 = 5
            if (r7 != r10) goto L99
        L97:
            r3 = r4
            goto L9a
        L99:
            r3 = r7
        L9a:
            int r10 = com.google.android.gms.internal.ads.zzex.zzi(r3)
            if (r10 == 0) goto Lad
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lad:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpj.zzb(com.google.android.gms.internal.ads.zzz, com.google.android.gms.internal.ads.zze):android.util.Pair");
    }
}
