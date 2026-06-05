package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import ej.e;
import pi.o;
import qi.l;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzbl extends i implements e {
    final /* synthetic */ zzbm zza;
    final /* synthetic */ zzpd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbmVar, zzpd zzpdVar, c cVar) {
        super(2, cVar);
        this.zza = zzbmVar;
        this.zzb = zzpdVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzbl(this.zza, this.zzb, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        uk.c.R(obj);
        zzbm zzbmVar = this.zza;
        zzpd zzpdVar = this.zzb;
        synchronized (zzbh.class) {
            try {
                if (zzbmVar.zze != null) {
                    byte[] bArrZzd = zzpdVar.zzd();
                    zzba zzbaVar = new zzba(zzfy.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzaz zzazVar = zzbmVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzbaVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzbaVar.zzb()));
                    zzazVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzbmVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzbmVar.zze.zza(l.M0(zzbmVar.zze.zzd(), iZzb));
                    }
                    if (zzbmVar.zze.zzb() >= 20) {
                        zzbmVar.zzg();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o.f13011a;
    }
}
