package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ej.e;
import pi.k;
import pi.o;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaq extends i implements e {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzaw zzawVar, RecaptchaAction recaptchaAction, long j, c cVar) {
        super(2, cVar);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzaq(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object objZzk;
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 != 0) {
            objZzk = ((k) obj).f13003a;
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzk = zzawVar.zzk(recaptchaAction, j, this);
            if (objZzk == aVar) {
                return aVar;
            }
        }
        return new k(objZzk);
    }
}
