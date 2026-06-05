package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbyq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyr zza;
    private final String zzb;

    public zzbyq(zzbyr zzbyrVar, String str) {
        this.zza = zzbyrVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbyr zzbyrVar = this.zza;
        synchronized (zzbyrVar) {
            try {
                for (zzbyp zzbypVar : zzbyrVar.zzb) {
                    zzbyr.zzb(zzbypVar.zza, zzbypVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
