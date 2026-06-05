package com.google.android.recaptcha.internal;

import ej.e;
import fj.w;
import java.util.Arrays;
import pi.o;
import qj.b0;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzby extends i implements e {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ zzca zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(Exception exc, zzcj zzcjVar, zzca zzcaVar, c cVar) {
        super(2, cVar);
        this.zza = exc;
        this.zzb = zzcjVar;
        this.zzc = zzcaVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        zzby zzbyVar = new zzby(this.zza, this.zzb, this.zzc, cVar);
        zzbyVar.zzd = obj;
        return zzbyVar;
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        zzpg zzpgVarZza;
        a aVar = a.f17085a;
        uk.c.R(obj);
        z zVar = (z) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzpgVarZza = ((zzae) exc).zza();
            zzpgVarZza.zzd(this.zzb.zza());
        } else {
            zzcj zzcjVar = this.zzb;
            zzpg zzpgVarZzf = zzph.zzf();
            zzpgVarZzf.zzd(zzcjVar.zza());
            zzpgVarZzf.zzp(2);
            zzpgVarZzf.zze(2);
            zzpgVarZza = zzpgVarZzf;
        }
        zzph zzphVar = (zzph) zzpgVarZza.zzj();
        zzphVar.zzk();
        zzphVar.zzj();
        w.a(this.zza.getClass()).c();
        this.zza.getMessage();
        zzcj zzcjVar2 = this.zzb;
        zzz zzzVarZzb = zzcjVar2.zzb();
        zzz zzzVar = zzcjVar2.zza;
        if (zzzVar == null) {
            zzzVar = null;
        }
        zzno zznoVarZza = zzbp.zza(zzzVarZzb, zzzVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (b0.s(zVar)) {
            zzca zzcaVar = this.zzc;
            zzfy zzfyVarZzh = zzfy.zzh();
            byte[] bArrZzd = zzphVar.zzd();
            String strZzi = zzfyVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzfy zzfyVarZzh2 = zzfy.zzh();
            byte[] bArrZzd2 = zznoVarZza.zzd();
            zzcaVar.zzc.zze().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzfyVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return o.f13011a;
    }
}
