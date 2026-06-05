package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzesi implements zzett {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzesi(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        zzfdc.zzc(bundle, "pn", this.zza);
        zzfdc.zzc(bundle, "dl", this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        zzfdc.zzc(bundle, "pn", this.zza);
        Integer num = this.zzb;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfdc.zzc(bundle, "vnm", this.zzc);
        zzfdc.zzc(bundle, "dl", this.zzd);
        zzfdc.zzc(bundle, "ins_pn", this.zze);
        zzfdc.zzc(bundle, "ini_pn", this.zzf);
    }
}
