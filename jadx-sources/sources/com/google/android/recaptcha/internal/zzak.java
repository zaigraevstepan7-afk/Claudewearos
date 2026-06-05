package com.google.android.recaptcha.internal;

import android.app.Application;
import ej.e;
import pi.o;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzak extends i implements e {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(Application application, String str, long j, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzak(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzak) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        int i10 = this.zza;
        uk.c.R(obj);
        if (i10 != 0) {
            return obj;
        }
        zzam zzamVar = zzam.zza;
        Application application = this.zzb;
        String str = this.zzc;
        long j = this.zzd;
        this.zza = 1;
        Object objZzc = zzam.zzc(application, str, j, null, this);
        return objZzc == aVar ? aVar : objZzc;
    }
}
