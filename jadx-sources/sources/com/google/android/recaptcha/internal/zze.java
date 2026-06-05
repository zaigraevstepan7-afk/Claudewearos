package com.google.android.recaptcha.internal;

import ej.e;
import pi.k;
import pi.o;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zze extends i implements e {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zza zzaVar, long j, zzoe zzoeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzaVar;
        this.zzc = j;
        this.zzd = zzoeVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zze(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object objZzb;
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 != 0) {
            objZzb = ((k) obj).f13003a;
        } else {
            zza zzaVar = this.zzb;
            long j = this.zzc;
            zzoe zzoeVar = this.zzd;
            this.zza = 1;
            objZzb = zzaVar.zzb(j, zzoeVar, this);
            if (objZzb == aVar) {
                return aVar;
            }
        }
        return new k(objZzb);
    }
}
