package com.google.android.recaptcha.internal;

import ej.e;
import fj.m;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcx extends m implements e {
    final /* synthetic */ zzcj zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzcj zzcjVar, String str, int i10) {
        super(2);
        this.zza = zzcjVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zzf(i10, objArr);
        }
        return o.f13011a;
    }
}
