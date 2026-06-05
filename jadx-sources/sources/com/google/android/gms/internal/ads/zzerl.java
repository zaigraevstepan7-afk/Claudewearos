package com.google.android.gms.internal.ads;

import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzerl implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzerl(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzerj zzb() {
        return new zzerj(((zzchg) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
