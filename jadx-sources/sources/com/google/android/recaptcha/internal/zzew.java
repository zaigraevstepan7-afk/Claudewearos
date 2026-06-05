package com.google.android.recaptcha.internal;

import ej.e;
import pi.k;
import pi.o;
import qj.q;
import qj.r;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzew extends i implements e {
    int zza;
    final /* synthetic */ zzez zzb;
    final /* synthetic */ zzoe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzezVar, zzoe zzoeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzezVar;
        this.zzc = zzoeVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzew(this.zzb, this.zzc, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzb;
            zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzez.zzl(this.zzb, this.zzc);
            new Integer(this.zzb.zzk().hashCode());
            q qVarZzk = this.zzb.zzk();
            this.zza = 1;
            if (((r) qVarZzk).k(this) == aVar) {
                return aVar;
            }
        }
        return new k(o.f13011a);
    }
}
