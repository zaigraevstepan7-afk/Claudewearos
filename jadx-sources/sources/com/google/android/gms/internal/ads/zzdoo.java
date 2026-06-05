package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdoo implements zzhfy {
    private final zzhgh zza;

    public zzdoo(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbch.zza.EnumC0000zza enumC0000zza = ((zzcvi) this.zza).zza().zzo.zza == 3 ? zzbch.zza.EnumC0000zza.REWARDED_INTERSTITIAL : zzbch.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD;
        zzhgg.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
