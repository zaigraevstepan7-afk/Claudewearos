package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbda implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbde.zza(new zzfvw() { // from class: com.google.android.gms.internal.ads.zzbcx
                    @Override // com.google.android.gms.internal.ads.zzfvw
                    public final Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zzb(final zzbct zzbctVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbctVar.zzl();
            }
        }
        if (zzbctVar.zze() != 2) {
            return (zzbctVar.zze() == 1 && this.zzh.has(zzbctVar.zzm())) ? zzbctVar.zza(this.zzh) : zzbde.zza(new zzfvw() { // from class: com.google.android.gms.internal.ads.zzbcy
                @Override // com.google.android.gms.internal.ads.zzfvw
                public final Object zza() {
                    return zzbctVar.zzc(this.zza.zze);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbctVar.zzl() : zzbctVar.zzb(bundle);
    }

    public final Object zzc(zzbct zzbctVar) {
        return (this.zzd || this.zza) ? zzb(zzbctVar) : zzbctVar.zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:45:0x00a6, B:46:0x00aa, B:47:0x00ad, B:56:0x00dd, B:70:0x0125, B:78:0x0150, B:79:0x0157, B:81:0x0159, B:82:0x0160, B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:94:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:22:0x0046, B:24:0x004b, B:29:0x0058, B:35:0x0065, B:37:0x006f, B:38:0x0077, B:40:0x007d, B:42:0x008d, B:44:0x00a2, B:49:0x00b0, B:51:0x00b4, B:53:0x00c4, B:55:0x00d9, B:58:0x00e2, B:68:0x0121, B:72:0x012a, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:61:0x00f3, B:63:0x0101, B:65:0x0109, B:66:0x0114), top: B:87:0x0046, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbda.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
