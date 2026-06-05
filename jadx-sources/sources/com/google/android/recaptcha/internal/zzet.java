package com.google.android.recaptcha.internal;

import ej.e;
import pi.o;
import qj.b0;
import qj.r;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzet extends i implements e {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzezVar, c cVar) {
        super(2, cVar);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzet(this.zzb, this.zzc, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 != 0) {
            return obj;
        }
        zzez zzezVar = this.zzc;
        String str = this.zzb;
        r rVarA = b0.a();
        zzezVar.zzl.put(str, rVarA);
        String str2 = this.zzb;
        zzou zzouVarZzf = zzov.zzf();
        zzouVarZzf.zzd(str2);
        byte[] bArrZzd = ((zzov) zzouVarZzf.zzj()).zzd();
        b0.w(this.zzc.zzq.zzb(), null, new zzes(this.zzc, zzfy.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
        this.zza = 1;
        Object objK = rVarA.k(this);
        return objK == aVar ? aVar : objK;
    }
}
