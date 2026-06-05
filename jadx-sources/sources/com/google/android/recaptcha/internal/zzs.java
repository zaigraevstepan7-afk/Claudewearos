package com.google.android.recaptcha.internal;

import ej.e;
import pi.o;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzs extends i implements e {
    public zzs(c cVar) {
        super(2, cVar);
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzs(cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((c) obj2).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f17085a;
        uk.c.R(obj);
        Thread.currentThread().setPriority(8);
        return o.f13011a;
    }
}
