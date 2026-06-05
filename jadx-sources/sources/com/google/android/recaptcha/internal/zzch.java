package com.google.android.recaptcha.internal;

import fj.l;
import java.lang.reflect.Method;
import qi.k;
import qi.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcgVar, String str, Object obj) {
        super(obj);
        this.zza = zzcgVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!l.b(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? k.c0(objArr) : s.f13520a);
        return true;
    }
}
