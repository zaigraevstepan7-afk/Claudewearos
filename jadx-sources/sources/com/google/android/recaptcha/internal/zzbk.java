package com.google.android.recaptcha.internal;

import ej.e;
import java.util.Timer;
import pi.o;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzbk extends i implements e {
    final /* synthetic */ zzbm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbm zzbmVar, c cVar) {
        super(2, cVar);
        this.zza = zzbmVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzbk(this.zza, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbk) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        uk.c.R(obj);
        zzbm zzbmVar = this.zza;
        synchronized (zzbh.class) {
            try {
                zzaz zzazVar = zzbmVar.zze;
                if (zzazVar != null && zzazVar.zzb() == 0) {
                    Timer timer = zzbm.zzb;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzbm.zzb = null;
                }
                zzbmVar.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o.f13011a;
    }
}
