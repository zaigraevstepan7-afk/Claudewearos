package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgmd {
    private static final Logger zza = Logger.getLogger(zzgmd.class.getName());
    private static final zzgmd zzb = new zzgmd();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgmd zzc() {
        return zzb;
    }

    private final synchronized zzgeo zzg(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzc;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzgeo) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgeo zzgeoVar, boolean z2, boolean z10) {
        try {
            String str = ((zzgmn) zzgeoVar).zza;
            ConcurrentMap concurrentMap = this.zzd;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            ConcurrentMap concurrentMap2 = this.zzc;
            zzgeo zzgeoVar2 = (zzgeo) concurrentMap2.get(str);
            if (zzgeoVar2 != null && !zzgeoVar2.getClass().equals(zzgeoVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zzgeoVar2.getClass().getName() + ", cannot be re-registered with " + zzgeoVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(str, zzgeoVar);
            concurrentMap.put(str, Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final zzgeo zza(String str, Class cls) throws GeneralSecurityException {
        zzgeo zzgeoVarZzg = zzg(str);
        if (zzgeoVarZzg.zzb().equals(cls)) {
            return zzgeoVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgeoVarZzg.getClass());
        String string = zzgeoVarZzg.zzb().toString();
        StringBuilder sbM = m1.m("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbM.append(string);
        throw new GeneralSecurityException(sbM.toString());
    }

    public final zzgeo zzb(String str) {
        return zzg(str);
    }

    public final synchronized void zzd(zzgeo zzgeoVar, boolean z2) {
        zzf(zzgeoVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgeo zzgeoVar, int i10, boolean z2) {
        if (!zzglu.zza(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgeoVar, false, true);
    }
}
