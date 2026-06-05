package com.google.android.recaptcha.internal;

import ej.e;
import fj.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pi.k;
import pi.o;
import qi.s;
import qj.b0;
import qj.e0;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzf extends i implements e {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, long j, zzoe zzoeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzoeVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, cVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        v vVar;
        a aVar = a.f17085a;
        if (this.zza != 0) {
            vVar = (v) this.zze;
            uk.c.R(obj);
        } else {
            uk.c.R(obj);
            z zVar = (z) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(b0.d(zVar, null, new zze((zza) it.next(), this.zzc, this.zzd, null), 3));
            }
            v vVar2 = new v();
            e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
            e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
            this.zze = vVar2;
            this.zza = 1;
            Object objA = e0VarArr2.length == 0 ? s.f13520a : new qj.e(e0VarArr2).a(this);
            if (objA == aVar) {
                return aVar;
            }
            vVar = vVar2;
            obj = objA;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Throwable thA = k.a(((k) it2.next()).f13003a);
            if (thA != null) {
                vVar.f6807a = vVar.f6807a == null ? thA instanceof zzp ? (zzp) thA : null : new zzp(zzn.zzc, zzl.zzal, null);
            }
        }
        zzp zzpVar = (zzp) vVar.f6807a;
        return new k(zzpVar != null ? uk.c.r(zzpVar) : o.f13011a);
    }
}
