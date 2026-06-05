package com.google.android.recaptcha.internal;

import pi.k;
import ui.a;
import vi.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzap extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzaw zzawVar, ti.c cVar) {
        super(cVar);
        this.zzb = zzawVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo4execute0E7RQCE = this.zzb.mo4execute0E7RQCE(null, 0L, this);
        return objMo4execute0E7RQCE == a.f17085a ? objMo4execute0E7RQCE : new k(objMo4execute0E7RQCE);
    }
}
