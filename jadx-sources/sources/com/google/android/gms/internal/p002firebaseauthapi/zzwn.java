package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzwn implements zzwj {
    private final /* synthetic */ zzdg zza;

    public zzwn(zzdg zzdgVar) {
        this.zza = zzdgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwj
    public final int zza() {
        return this.zza.zzc() + this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwj
    public final zzlx zza(byte[] bArr) {
        return new zzlx(zzws.zza(zzcz.zzb().zza(this.zza).zza(zzxw.zza(Arrays.copyOfRange(bArr, 0, this.zza.zzb()), zzbr.zza())).zzb(zzxw.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzc() + this.zza.zzb()), zzbr.zza())).zza()));
    }
}
