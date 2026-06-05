package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import ig.t;
import java.util.Map;
import java.util.concurrent.Executor;
import q.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzads {
    private static final Map<String, zzadu> zza = new e(0);

    public static t zza(String str, t tVar, zzacz zzaczVar) {
        zza(str, zzaczVar);
        return new zzadv(tVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacz zzaczVar) {
        zza.put(str, new zzadu(zzaczVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, t tVar, Activity activity, Executor executor) {
        Map<String, zzadu> map = zza;
        if (map.containsKey(str)) {
            zzadu zzaduVar = map.get(str);
            if (System.currentTimeMillis() - zzaduVar.zzb < 120000) {
                zzacz zzaczVar = zzaduVar.zza;
                if (zzaczVar == null) {
                    return true;
                }
                zzaczVar.zza(tVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
