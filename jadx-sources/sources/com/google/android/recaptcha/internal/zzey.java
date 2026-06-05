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
final class zzey extends i implements e {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, c cVar) {
        super(2, cVar);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzey(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f17085a;
        uk.c.R(obj);
        try {
            zzez zzezVar = this.zza;
            b0.w(this.zza.zzq.zzb(), null, new zzex(this.zza, zzezVar.zzf().zzb(this.zzb, zzezVar.zzp), null), 3);
        } catch (zzp e10) {
            zzez zzezVar2 = this.zza;
            zzezVar2.zzi.zzb(this.zzc, e10, null);
            ((r) this.zza.zzk()).h0(e10);
        }
        return o.f13011a;
    }
}
