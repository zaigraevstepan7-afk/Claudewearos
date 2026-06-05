package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zztj {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, c2.a.h(i10, i11, (int) d10));
            boolean z2 = true;
            if (iZzc == 1 && zztk.zza == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int iZzb = zzb(false);
                    int iZzb2 = zzb(true);
                    if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    }
                    zztk.zza = Boolean.valueOf(z2);
                    if (!zztk.zza.booleanValue()) {
                    }
                }
                z2 = false;
                zztk.zza = Boolean.valueOf(z2);
                if (!zztk.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.zzah("video/avc");
            zzz zzzVarZzan = zzxVar.zzan();
            if (zzzVarZzan.zzo != null) {
                List listZze = zzuc.zze(zztr.zza, zzzVarZzan, z2, false);
                for (int i10 = 0; i10 < listZze.size(); i10++) {
                    if (((zzti) listZze.get(i10)).zzd != null && (videoCapabilities = ((zzti) listZze.get(i10)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        c2.a.x();
                        return zzc(supportedPerformancePoints, c2.a.g());
                    }
                }
            }
        } catch (zztw unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (c2.a.i(list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
