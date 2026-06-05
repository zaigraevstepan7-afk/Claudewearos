package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdnd implements zzbkd {
    private final zzbhr zza;
    private final zzdnr zzb;
    private final zzhfs zzc;

    public zzdnd(zzdix zzdixVar, zzdim zzdimVar, zzdnr zzdnrVar, zzhfs zzhfsVar) {
        this.zza = zzdixVar.zzc(zzdimVar.zzA());
        this.zzb = zzdnrVar;
        this.zzc = zzhfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbhh) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            String strJ = m1.j("Failed to call onCustomClick for asset ", str, ".");
            int i10 = l0.f13401b;
            k.h(strJ, e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
