package com.google.android.recaptcha.internal;

import pi.k;
import ui.a;
import vi.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzd extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzg zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, ti.c cVar) {
        super(cVar);
        this.zzb = zzgVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzb = this.zzb.zzb(0L, null, this);
        return objZzb == a.f17085a ? objZzb : new k(objZzb);
    }
}
