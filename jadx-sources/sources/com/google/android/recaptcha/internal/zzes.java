package com.google.android.recaptcha.internal;

import ej.e;
import pi.o;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzes extends i implements e {
    final /* synthetic */ zzez zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzez zzezVar, String str, c cVar) {
        super(2, cVar);
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzes(this.zza, this.zzb, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        uk.c.R(obj);
        this.zza.zzc().evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzb + "\")", null);
        return o.f13011a;
    }
}
