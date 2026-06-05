package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzewa {
    private final zzbvo zza;
    private final int zzb;

    public zzewa(zzbvo zzbvoVar, int i10) {
        this.zza = zzbvoVar;
        this.zzb = i10;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zzb() {
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        return 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        return 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        return 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        return 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        return 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        return 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        return 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        return 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        return 8;
                    }
                    break;
            }
        }
        return -1;
    }

    public final int zzc() {
        return this.zza.zzo;
    }

    public final PackageInfo zzd() {
        return this.zza.zzf;
    }

    public final String zze() {
        return this.zza.zzd;
    }

    public final String zzf() {
        return zzfvv.zzc(this.zza.zza.getString("ms"));
    }

    public final String zzg() {
        return this.zza.zzh;
    }

    public final List zzh() {
        return this.zza.zze;
    }

    public final boolean zzi() {
        return this.zza.zzl;
    }

    public final boolean zzj() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    public final boolean zzk() {
        return this.zza.zzk;
    }
}
