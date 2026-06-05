package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamb {
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.EMPTY_SET;
    private String zzd = "";
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int zzc() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(String str, String str2, Set set, String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + iZzA;
    }

    public final int zzg() {
        int i10 = this.zzk;
        if (i10 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final zzamb zzh(int i10) {
        this.zzh = i10;
        this.zzi = true;
        return this;
    }

    public final zzamb zzi(boolean z2) {
        this.zzk = 1;
        return this;
    }

    public final zzamb zzj(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzamb zzk(int i10) {
        this.zzf = i10;
        this.zzg = true;
        return this;
    }

    public final zzamb zzl(String str) {
        this.zze = zzfuk.zza(str);
        return this;
    }

    public final zzamb zzm(float f10) {
        this.zzn = f10;
        return this;
    }

    public final zzamb zzn(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzamb zzo(boolean z2) {
        this.zzl = 1;
        return this;
    }

    public final zzamb zzp(int i10) {
        this.zzo = i10;
        return this;
    }

    public final zzamb zzq(boolean z2) {
        this.zzj = 1;
        return this;
    }

    public final String zzr() {
        return this.zze;
    }

    public final void zzs(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzt(String str) {
        this.zza = str;
    }

    public final void zzu(String str) {
        this.zzb = str;
    }

    public final void zzv(String str) {
        this.zzd = str;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        return this.zzj == 1;
    }
}
