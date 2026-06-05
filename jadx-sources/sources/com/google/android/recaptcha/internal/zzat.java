package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ej.e;
import pi.k;
import pi.o;
import qj.b0;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzat extends i implements e {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ zzbd zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzaw zzawVar, long j, RecaptchaAction recaptchaAction, zzbd zzbdVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzawVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
        this.zze = zzbdVar;
        this.zzf = str;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzat zzatVar;
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 != 0) {
            zzatVar = this;
            if (i10 == 1) {
            }
            zzol zzolVar = (zzol) obj;
            zzatVar.zzb.zzl(zzolVar, zzatVar.zze);
            zzatVar.zzb.zzi.zza(zzatVar.zze.zza(zzne.EXECUTE_TOTAL));
            return new k(zzolVar.zzi());
        }
        zzaw.zzi(this.zzb, this.zzc, this.zzd, this.zze);
        zzaw zzawVar = this.zzb;
        long j = this.zzc;
        String str = this.zzf;
        zzbd zzbdVar = this.zze;
        this.zza = 1;
        zzatVar = this;
        obj = zzawVar.zzj(j, str, zzbdVar, zzatVar);
        if (obj == aVar) {
            return aVar;
        }
        zzaw zzawVar2 = zzatVar.zzb;
        RecaptchaAction recaptchaAction = zzatVar.zzd;
        zzatVar.zza = 2;
        obj = b0.G(zzawVar2.zzl.zza().Q(), new zzav(zzatVar.zze, zzawVar2, recaptchaAction, (zzog) obj, null), this);
        if (obj == aVar) {
            return aVar;
        }
        zzol zzolVar2 = (zzol) obj;
        zzatVar.zzb.zzl(zzolVar2, zzatVar.zze);
        zzatVar.zzb.zzi.zza(zzatVar.zze.zza(zzne.EXECUTE_TOTAL));
        return new k(zzolVar2.zzi());
    }
}
