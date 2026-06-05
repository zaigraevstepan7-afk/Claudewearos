package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import fc.w;
import ic.i;
import java.util.ArrayList;
import java.util.List;
import nc.l2;
import tc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqv extends zzbqc {
    private final t zza;

    public zzbqv(t tVar) {
        this.zza = tVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final boolean zzA() {
        return this.zza.f16315n;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final boolean zzB() {
        return this.zza.f16314m;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final double zze() {
        Double d10 = this.zza.f16309g;
        if (d10 != null) {
            return d10.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzf() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzg() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzh() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final Bundle zzi() {
        return this.zza.f16313l;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final l2 zzj() {
        l2 l2Var;
        w wVar = this.zza.j;
        if (wVar == null) {
            return null;
        }
        synchronized (wVar.f6715a) {
            l2Var = wVar.f6716b;
        }
        return l2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final zzbgg zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final zzbgn zzl() {
        ic.c cVar = this.zza.f16306d;
        if (cVar != null) {
            return new zzbga(cVar.getDrawable(), cVar.getUri(), cVar.getScale(), cVar.zzb(), cVar.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final xd.a zzm() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final xd.a zzn() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final xd.a zzo() {
        Object obj = this.zza.f16312k;
        if (obj == null) {
            return null;
        }
        return new xd.b(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzp() {
        return this.zza.f16308f;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzq() {
        return this.zza.f16305c;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzr() {
        return this.zza.f16307e;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzs() {
        return this.zza.f16303a;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzt() {
        return this.zza.f16311i;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzu() {
        return this.zza.f16310h;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final List zzv() {
        List<ic.c> list = this.zza.f16304b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ic.c cVar : list) {
                arrayList.add(new zzbga(cVar.getDrawable(), cVar.getUri(), cVar.getScale(), cVar.zzb(), cVar.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzw(xd.a aVar) {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzx() {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzy(xd.a aVar, xd.a aVar2, xd.a aVar3) {
        View view = (View) xd.b.u(aVar);
        ((com.google.ads.mediation.a) this.zza).getClass();
        if (i.f8505a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzz(xd.a aVar) {
        this.zza.getClass();
    }
}
