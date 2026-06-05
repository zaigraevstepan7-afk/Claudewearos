package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import pi.h;
import qi.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzfa {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public static final Map zza() {
        h[] hVarArr = {new h(-4, zzl.zzz), new h(-12, zzl.zzA), new h(-6, zzl.zzv), new h(-11, zzl.zzx), new h(-13, zzl.zzB), new h(-14, zzl.zzC), new h(-2, zzl.zzw), new h(-7, zzl.zzD), new h(-5, zzl.zzE), new h(-9, zzl.zzF), new h(-8, zzl.zzP), new h(-15, zzl.zzy), new h(-1, zzl.zzG), new h(-3, zzl.zzI), new h(-10, zzl.zzJ)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.g0(15));
        v.k0(linkedHashMap, hVarArr);
        int i10 = Build.VERSION.SDK_INT;
        linkedHashMap.put(-16, zzl.zzH);
        linkedHashMap.put(1, zzl.zzL);
        linkedHashMap.put(2, zzl.zzM);
        linkedHashMap.put(0, zzl.zzN);
        linkedHashMap.put(3, zzl.zzO);
        if (i10 >= 29) {
            linkedHashMap.put(4, zzl.zzK);
        }
        return linkedHashMap;
    }
}
