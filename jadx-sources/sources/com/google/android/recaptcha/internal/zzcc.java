package com.google.android.recaptcha.internal;

import ej.e;
import gk.b;
import java.util.ArrayList;
import pi.o;
import qi.l;
import qj.z;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcc extends i implements e {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(String[] strArr, zzcd zzcdVar, String str, c cVar) {
        super(2, cVar);
        this.zza = strArr;
        this.zzb = zzcdVar;
        this.zzc = str;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzcc(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        uk.c.R(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(b.n(this.zzc, "(", l.E0(arrayList, ",", null, null, null, 62), ")"), null);
        return o.f13011a;
    }
}
