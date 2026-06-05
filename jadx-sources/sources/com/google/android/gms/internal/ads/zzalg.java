package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzalg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzalg(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static zzalg zza(String str) {
        zzdd.zzd(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new zzalg(i11, i12, i13, i14, i15, length);
            }
            String strZza = zzfuk.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (!strZza.equals("end")) {
                        break;
                    } else {
                        i13 = i10;
                        break;
                    }
                case 3556653:
                    if (!strZza.equals("text")) {
                        break;
                    } else {
                        i15 = i10;
                        break;
                    }
                case 102749521:
                    if (!strZza.equals("layer")) {
                        break;
                    } else {
                        i11 = i10;
                        break;
                    }
                case 109757538:
                    if (!strZza.equals("start")) {
                        break;
                    } else {
                        i12 = i10;
                        break;
                    }
                case 109780401:
                    if (!strZza.equals("style")) {
                        break;
                    } else {
                        i14 = i10;
                        break;
                    }
            }
            i10++;
        }
    }
}
