package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzin extends zzba {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzz zzf;
    public final int zzg;
    public final zzvh zzh;
    final boolean zzi;

    private zzin(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, null, false);
    }

    public static zzin zzb(Throwable th2, String str, int i10, zzz zzzVar, int i11, zzvh zzvhVar, boolean z2, int i12) {
        if (zzzVar == null) {
            i11 = 4;
        }
        return new zzin(1, th2, null, i12, str, i10, zzzVar, i11, zzvhVar, z2);
    }

    public static zzin zzc(IOException iOException, int i10) {
        return new zzin(0, iOException, i10);
    }

    public static zzin zzd(RuntimeException runtimeException, int i10) {
        return new zzin(2, runtimeException, i10);
    }

    public final zzin zza(zzvh zzvhVar) {
        String message = getMessage();
        String str = zzex.zza;
        return new zzin(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzvhVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzin(int i10, Throwable th2, String str, int i11, String str2, int i12, zzz zzzVar, int i13, zzvh zzvhVar, boolean z2) {
        String str3;
        int i14;
        String strJ;
        String str4;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            strJ = "Source error";
        } else if (i10 != 1) {
            strJ = "Unexpected runtime error";
            str3 = str2;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(zzzVar);
            String str5 = zzex.zza;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder();
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            sb2.append(strValueOf);
            strJ = m6.a.j(sb2, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strJ : strJ.concat(": null"), th2, i11, i10, str3, i14, zzzVar, i13, zzvhVar, SystemClock.elapsedRealtime(), z2);
    }

    private zzin(String str, Throwable th2, int i10, int i11, String str2, int i12, zzz zzzVar, int i13, zzvh zzvhVar, long j, boolean z2) {
        boolean z10;
        super(str, th2, i10, Bundle.EMPTY, j);
        if (!z2) {
            z10 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        zzdd.zzd(z10);
        zzdd.zzd(th2 != null);
        this.zzc = i11;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzzVar;
        this.zzg = i13;
        this.zzh = zzvhVar;
        this.zzi = z2;
    }
}
