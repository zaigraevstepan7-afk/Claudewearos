package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpm {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfpm(Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfpn.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfpn.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb2 = new StringBuilder("FBAMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    private final String zzf() {
        StringBuilder sb2 = new StringBuilder("LATMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzayn r9, com.google.android.gms.internal.ads.zzfps r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpm.zza(com.google.android.gms.internal.ads.zzayn, com.google.android.gms.internal.ads.zzfps):boolean");
    }

    public final zzayq zzb(int i10) {
        String string = i10 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrN = ud.c.n(string);
            zzayq zzayqVarZzh = zzayq.zzh(zzgxn.zzv(bArrN, 0, bArrN.length));
            String strZzk = zzayqVarZzh.zzk();
            File fileZzb = zzfpn.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfpn.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfpn.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return zzayqVarZzh;
                }
            }
        } catch (zzgzk unused) {
        }
        return null;
    }

    public final zzfpl zzc(int i10) {
        zzayq zzayqVarZzb = zzb(1);
        if (zzayqVarZzb == null) {
            return null;
        }
        String strZzk = zzayqVarZzb.zzk();
        File fileZzb = zzfpn.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfpn.zzb(strZzk, "pcam", zzd());
        }
        return new zzfpl(zzayqVarZzb, fileZzb, zzfpn.zzb(strZzk, "pcbc", zzd()), zzfpn.zzb(strZzk, "pcopt", zzd()));
    }
}
