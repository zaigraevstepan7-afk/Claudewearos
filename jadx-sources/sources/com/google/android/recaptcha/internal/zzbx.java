package com.google.android.recaptcha.internal;

import ej.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pi.o;
import qj.b0;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzbx extends i implements e {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcjVar, List list, zzca zzcaVar, c cVar) {
        super(2, cVar);
        this.zzb = zzcjVar;
        this.zzc = list;
        this.zzd = zzcaVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, this.zzd, cVar);
        zzbxVar.zze = obj;
        return zzbxVar;
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        int i10 = this.zza;
        o oVar = o.f13011a;
        uk.c.R(obj);
        if (i10 != 0) {
            return oVar;
        }
        z zVar = (z) this.zze;
        zzfh zzfhVarZzb = zzfh.zzb();
        while (true) {
            zzcj zzcjVar = this.zzb;
            if (zzcjVar.zza() < 0) {
                break;
            }
            if (zzcjVar.zza() >= this.zzc.size() || !b0.s(zVar)) {
                break;
            }
            try {
                this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
            } catch (Exception e10) {
                zzca zzcaVar = this.zzd;
                zzcj zzcjVar2 = this.zzb;
                this.zza = 1;
                return zzcaVar.zzh(e10, zzcjVar2, this) == aVar ? aVar : oVar;
            }
        }
        zzfhVarZzb.zzf();
        new Long(zzfhVarZzb.zza(TimeUnit.MICROSECONDS));
        return oVar;
    }
}
