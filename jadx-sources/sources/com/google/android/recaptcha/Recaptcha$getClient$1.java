package com.google.android.recaptcha;

import pi.k;
import ui.a;
import vi.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, ti.c cVar) {
        super(cVar);
        this.zzb = recaptcha;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM3getClientBWLJW6A = this.zzb.m3getClientBWLJW6A(null, null, 0L, this);
        return objM3getClientBWLJW6A == a.f17085a ? objM3getClientBWLJW6A : new k(objM3getClientBWLJW6A);
    }
}
