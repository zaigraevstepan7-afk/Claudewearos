package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzavg {
    public static final String zza(Context context, String str, long j, boolean z2) {
        try {
            zzatx zzatxVarZza = zzaty.zza();
            zzatxVarZza.zzb(str);
            zzatxVarZza.zza("0.460000000");
            zzatxVarZza.zzc(context.getPackageName());
            zzatxVarZza.zze((System.currentTimeMillis() - j) / 1000);
            zzatxVarZza.zzd(System.currentTimeMillis() / 1000);
            try {
                zzatxVarZza.zzf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzatxVarZza.zzf(-1L);
            }
            zzaue zzaueVarZza = zzauq.zza(((zzaty) zzatxVarZza.zzbr()).zzaV(), null);
            zzaueVarZza.zzd(5);
            zzaueVarZza.zzc(2);
            return Base64.encodeToString(((zzauf) zzaueVarZza.zzbr()).zzaV(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
