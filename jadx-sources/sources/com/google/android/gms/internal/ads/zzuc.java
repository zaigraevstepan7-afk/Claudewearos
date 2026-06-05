package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzti zza() {
        List listZzd = zzd("audio/raw", false, false);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (zzti) listZzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair pairZza;
        String str = zzzVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZza = zzdk.zza(zzzVar)) != null) {
            int iIntValue = ((Integer) pairZza.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zztr zztrVar, zzz zzzVar, boolean z2, boolean z10) {
        String strZzb = zzb(zzzVar);
        return strZzb == null ? zzfyf.zzn() : zztrVar.zza(strZzb, z2, z10);
    }

    public static synchronized List zzd(String str, boolean z2, boolean z10) {
        try {
            zztv zztvVar = new zztv(str, z2, z10);
            HashMap map = zzb;
            List list = (List) map.get(zztvVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzg = zzg(zztvVar, new zztz(z2, z10, str.equals("video/mv-hevc")));
            if (z2) {
                arrayListZzg.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                zzh(arrayListZzg, new zzua() { // from class: com.google.android.gms.internal.ads.zztt
                    @Override // com.google.android.gms.internal.ads.zzua
                    public final int zza(Object obj) {
                        int i10 = zzuc.zza;
                        String str2 = ((zzti) obj).zza;
                        return (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) ? 1 : 0;
                    }
                });
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) arrayListZzg.get(0)).zza)) {
                arrayListZzg.add((zzti) arrayListZzg.remove(0));
            }
            zzfyf zzfyfVarZzl = zzfyf.zzl(arrayListZzg);
            map.put(zztvVar, zzfyfVarZzl);
            return zzfyfVarZzl;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static List zze(zztr zztrVar, zzz zzzVar, boolean z2, boolean z10) {
        List listZza = zztrVar.zza(zzzVar.zzo, z2, z10);
        List listZzc = zzc(zztrVar, zzzVar, z2, z10);
        int i10 = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        zzfycVar.zzh(listZza);
        zzfycVar.zzh(listZzc);
        return zzfycVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzua() { // from class: com.google.android.gms.internal.ads.zztu
            @Override // com.google.android.gms.internal.ads.zzua
            public final int zza(Object obj) {
                int i10 = zzuc.zza;
                return ((zzti) obj).zze(zzzVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115 A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122 A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137 A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c A[Catch: Exception -> 0x011d, TryCatch #1 {Exception -> 0x011d, blocks: (B:63:0x00e3, B:70:0x00fc, B:76:0x010f, B:78:0x0115, B:86:0x012f, B:88:0x0137, B:89:0x013c, B:91:0x014c, B:93:0x0154, B:82:0x0122), top: B:124:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zztv r20, com.google.android.gms.internal.ads.zztx r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zzg(com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zztx):java.util.ArrayList");
    }

    private static void zzh(List list, final zzua zzuaVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10 = zzuc.zza;
                zzua zzuaVar2 = zzuaVar;
                return zzuaVar2.zza(obj2) - zzuaVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String strZza = zzfuk.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
