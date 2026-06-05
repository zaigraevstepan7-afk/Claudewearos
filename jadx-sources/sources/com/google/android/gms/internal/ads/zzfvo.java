package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvo extends zzfvr {
    final /* synthetic */ zzfuq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvo(zzfvt zzfvtVar, CharSequence charSequence, zzfuq zzfuqVar) {
        super(zzfvtVar, charSequence);
        this.zza = zzfuqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzc(int i10) {
        return ((zzfuu) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzd(int i10) {
        Matcher matcher = ((zzfuu) this.zza).zza;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }
}
