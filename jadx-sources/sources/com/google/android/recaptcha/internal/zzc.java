package com.google.android.recaptcha.internal;

import ej.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pi.j;
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
final class zzc extends i implements e {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzgVar, String str, long j, c cVar) {
        super(2, cVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, cVar);
        zzcVar.zze = obj;
        return zzcVar;
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 == 0) {
            z zVar = (z) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(b0.d(zVar, null, new zzb((zza) it.next(), this.zzc, this.zzd, null), 3));
            }
            e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
            e0[] e0VarArr2 = (e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length);
            this.zza = 1;
            obj = e0VarArr2.length == 0 ? s.f13520a : new qj.e(e0VarArr2).a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        zzof zzofVarZzf = zzog.zzf();
        zzofVarZzf.zzd(str);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object obj2 = ((k) it2.next()).f13003a;
            if (!(obj2 instanceof j)) {
                zzofVarZzf.zzg((zzog) obj2);
            }
        }
        return (zzog) zzofVarZzf.zzj();
    }
}
