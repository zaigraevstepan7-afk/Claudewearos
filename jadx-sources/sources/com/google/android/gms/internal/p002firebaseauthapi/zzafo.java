package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import java.io.UnsupportedEncodingException;
import java.util.List;
import t.m1;
import ud.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzafo {
    public static long zza(String str) {
        zzafr zzafrVarZzb = zzb(str);
        return zzafrVarZzb.zza().longValue() - zzafrVarZzb.zzb().longValue();
    }

    private static zzafr zzb(String str) {
        e0.e(str);
        List<String> listZza = zzac.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(m1.i("Invalid idToken ", str));
        }
        try {
            return zzafr.zza(new String(c.g(listZza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Unable to decode token", e10);
        }
    }
}
