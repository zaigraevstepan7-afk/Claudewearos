package com.google.android.recaptcha.internal;

import pi.k;
import ui.a;
import vi.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzer extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzez zzb;
    int zzc;
    zzez zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzez zzezVar, ti.c cVar) {
        super(cVar);
        this.zzb = zzezVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZza = this.zzb.zza(null, 0L, this);
        return objZza == a.f17085a ? objZza : new k(objZza);
    }
}
